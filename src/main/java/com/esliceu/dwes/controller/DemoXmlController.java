package com.esliceu.dwes.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by xavi on 31/01/18.
 */
@RestController
public class DemoXmlController {

    @RequestMapping("/demo")
    public Employee demo() {            // it will return response in xml and json
        Employee employee = new Employee();
        employee.setId(1);
        employee.setName("Java Developer Zone");
        employee.setRole("HR");
        return employee;
    }

    @RequestMapping("/employees")
    public List<Employee> employees(){

        Employee employee = new Employee();
        employee.setId(1);
        employee.setName("Java Developer Zone");
        employee.setRole("HR");
        List<Employee> employees = new ArrayList<>();

        employees.add(employee);

        employees = new ArrayList<>();

        employee.setId(2);
        employee.setName("Java XXX");
        employee.setRole("HR-1");

        employees.add(employee);

        return employees;
    }
}