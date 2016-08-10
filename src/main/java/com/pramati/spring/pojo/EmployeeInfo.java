package com.pramati.spring.pojo;

/**
 * Created by venkateswarluk on 10/8/16.
 */
public class EmployeeInfo {

    private int employeeId;
    private String employeeName;
    private String employeeGender;
    private String employeeWorkLocation;

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeGender() {
        return employeeGender;
    }

    public void setEmployeeGender(String employeeGender) {
        this.employeeGender = employeeGender;
    }

    public String getEmployeeWorkLocation() {
        return employeeWorkLocation;
    }

    public void setEmployeeWorkLocation(String employeeWorkLocation) {
        this.employeeWorkLocation = employeeWorkLocation;
    }
}
