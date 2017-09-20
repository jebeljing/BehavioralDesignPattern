package com.pluralsight.memento;

import java.util.Stack;

/**
 * Created by jingshanyin on 9/7/17.
 */
//caretaker
public class Caretaker {

    private Stack<EmployeeMemento> employeeHistory = new Stack<>();

    public void save(Employee emp) {
        employeeHistory.push(emp.save());
    }

    public void revert(Employee emp) {
        emp.revert(employeeHistory.pop());
    }

}
