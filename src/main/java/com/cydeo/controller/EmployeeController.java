package com.cydeo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/employee")//http://localhost:8080/employee
public class EmployeeController {

    @GetMapping("register")//http://localhost:8080/employee/register
    public String createEmployees(){

        return "employee/employee-create";
    }

}
