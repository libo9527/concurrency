package com.demo.interview.oop;

import java.util.Objects;

/**
 * @Description：
 * @Auther： libo
 * @date： 2018/10/24:09:13
 */
public class Employee {
    private String name;
    private int salary;

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Employee employee = (Employee) object;
        return salary == employee.salary &&
                Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, salary);
    }
}
