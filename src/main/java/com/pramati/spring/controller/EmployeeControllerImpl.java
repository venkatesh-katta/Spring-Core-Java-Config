package com.pramati.spring.controller;

import com.pramati.spring.pojo.EmployeeInfo;

/**
 * Created by venkateswarluk on 10/8/16.
 */
public class EmployeeControllerImpl implements EmployeeController {

    @Override
    public void createEmployee(EmployeeInfo employeeInfo) {
        System.out.println("Creating the controller method and display the employee name::"+employeeInfo.getEmployeeName());
    }
}
