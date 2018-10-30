package com.demo.interview.designpattern.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @Description：
 * @Auther： libo
 * @date： 2018/10/30:09:14
 */
public class Manager implements Role {

    private final List<Employee> reporters;

    public Manager(List<Employee> reporters) {
        this.reporters = Collections.unmodifiableList(new ArrayList<>(reporters));
    }

    @Override
    public void doWork() {
        System.out.println("Dispatching work.");
        Employee worker = selectReporter();
        worker.doWork();
    }

    @Override
    public String toString() {
        return "Manager";
    }

    private Employee selectReporter() {
        // selects a reporter to do work.
        return reporters.get(0);
    }
}
