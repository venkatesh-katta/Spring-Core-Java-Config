package com.pramati.spring.service;

import com.pramati.spring.controller.EmployeeController;
import com.pramati.spring.pojo.EmployeeInfo;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by venkateswarluk on 10/8/16.
 */
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeController employeeController;

    public void createEmployee(EmployeeInfo employeeInfo) {
        if (employeeInfo != null) {
            System.out.println("In service method .. "+employeeController);
            // do something
            employeeController.createEmployee(employeeInfo);
        }

    }
}
