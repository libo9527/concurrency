package com.demo.interview.designpattern.company;

import java.util.List;
import java.util.Objects;

/**
 * @Description：
 * @Auther： libo
 * @date： 2018/10/30:09:06
 */
public class Employee {
    public static List<Employee> allEmployees;

    private final String name;
    private final int salary;
    private Role role;

    public Employee(String name, int salary, Role role) {
        this.name = name;
        this.salary = salary;
        this.role = role;
    }

    public void doWork(){
        role.doWork();
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Employee employee = (Employee) object;
        return salary == employee.salary &&
                Objects.equals(name, employee.name) &&
                Objects.equals(role, employee.role);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, salary, role);
    }

    public static List<Employee> getAllEmployees() {
        return allEmployees;
    }

    public static void setAllEmployees(List<Employee> allEmployees) {
        Employee.allEmployees = allEmployees;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", role=" + role +
                '}';
    }
}
