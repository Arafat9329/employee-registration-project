package com.cydeo.controller;

import com.cydeo.model.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/employee")//http://localhost:8080/employee
public class EmployeeController {

    @GetMapping("register")//http://localhost:8080/employee/register
    public String createEmployees(Model model){

        model.addAttribute("employee", new Employee());

        return "employee/employee-create";
    }

}
