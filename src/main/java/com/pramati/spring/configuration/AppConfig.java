package com.pramati.spring.configuration;


import com.pramati.spring.controller.EmployeeController;
import com.pramati.spring.controller.EmployeeControllerImpl;
import com.pramati.spring.pojo.EmployeeInfo;
import com.pramati.spring.service.EmployeeService;
import com.pramati.spring.service.EmployeeServiceImpl;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


/**
 * Created by venkateswarluk on 10/8/16.
 */
@Configuration
public class AppConfig {

    @Bean
    public EmployeeService getEmployeeServiceBean(){
        System.out.println("creating employee service bean ..!");
        return new EmployeeServiceImpl();
    }

    @Bean
    public EmployeeController getEmployeeControllerBean(){
        System.out.println("creating employee controller bean..!");
        return new EmployeeControllerImpl();
    }

    public static void main(String[] args){
        System.out.println("Running the application");
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);
        EmployeeInfo employeeInfo = new EmployeeInfo();
        employeeInfo.setEmployeeId(1);
        employeeInfo.setEmployeeGender("Male");
        employeeInfo.setEmployeeName("Venki");
        employeeInfo.setEmployeeWorkLocation("Hyderabad");
        context.getBean(EmployeeService.class).createEmployee(employeeInfo);

    }
}
