package com.example.anotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @Description：
 * @Auther： libo
 * @date： 2018/10/20:09:56
 */
public class Test {

    public static void main(String[] args) {
        Filter f1 = new Filter();
        f1.setId(10); // 查询id为10的用户

        Filter f2 = new Filter();
        f2.setUserName("lucy"); // 查询用户名为lucy的用户

        Filter f3 = new Filter();
        f3.setEmail("email1@163.com,email2@163.com,email3@163.com"); // 查询邮箱为其中任意一个的用户

        String sql1 = query(f1);
        System.out.println(sql1);

        String sql2 = query(f2);
        System.out.println(sql2);

        String sql3 = query(f3);
        System.out.println(sql3);
    }

    private static String query(Filter f) {
        StringBuilder sb = new StringBuilder();

        // 1. 获取到class
        Class c = f.getClass();

        // 2. 获取到table的名字
        boolean isTExit = c.isAnnotationPresent(Table.class);
        if (!isTExit) {
            return null;
        }
        Table table = (Table) c.getAnnotation(Table.class);
        String tableName = table.value();
        sb.append("select * from ").append(tableName).append(" where 1=1");

        // 3. 遍历所有的字段
        Field[] fields = c.getDeclaredFields();
        for (Field field : fields) {
            // 4. 处理每个字段对应的sql
            // 4.1 拿到字段名
            boolean isCExit = field.isAnnotationPresent(Column.class);
            if (!isCExit) {
                continue;
            }
            Column column = field.getAnnotation(Column.class);
            String columnName = column.value();

            // 4.2 拿到字段值
            String fieldName = field.getName();
            String getMethodName = "get" + fieldName.substring(0, 1).toUpperCase() + fieldName.substring(1);
            Object fieldValue = null;
            try {
                Method method = c.getMethod(getMethodName);
                fieldValue = method.invoke(f);
            } catch (Exception e) {
                e.printStackTrace();
            }

            // 4.3 拼装sql
            if (fieldValue == null ||
                    (fieldValue instanceof Integer && (Integer) fieldValue == 0)) {
                continue;
            }
            sb.append(" and ").append(columnName);
            if (fieldValue instanceof String) {
                if (((String) fieldValue).contains(",")) {
                    String[] strings = ((String) fieldValue).split(",");
                    sb.append(" in (");
                    for (String string : strings) {
                        sb.append("'").append(string).append("'").append(",");
                    }
                    sb.deleteCharAt(sb.length() - 1).append(")");
                } else {
                    fieldValue = "'" + fieldValue + "'";
                    sb.append("=").append(fieldValue);
                }
            } else if (fieldValue instanceof Integer) {
                sb.append("=").append(fieldValue);
            }
        }
        return sb.toString();
    }
}
