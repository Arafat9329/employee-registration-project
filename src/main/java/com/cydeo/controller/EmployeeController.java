package com.cydeo.controller;

import com.cydeo.bootstrap.DataGenerator;
import com.cydeo.model.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping("/employee")//http://localhost:8080/employee
public class EmployeeController {

    @GetMapping("register")//http://localhost:8080/employee/register
    public String createEmployees(Model model){

        model.addAttribute("employee", new Employee());
        model.addAttribute("states", DataGenerator.getAllStates());

        return "employee/employee-create";
    }

    @PostMapping("/list")
    public String employeeList(@Valid @ModelAttribute("employee")Employee postEmployee, BindingResult bindingResult, Model model){

        if (bindingResult.hasErrors()){
            model.addAttribute("states", DataGenerator.getAllStates());
            return "employee/employee-create";
        }
        DataGenerator.saveEmployee(postEmployee);
        model.addAttribute("employees",DataGenerator.readAllEmployee());



        return "employee/employee-list";
    }

}
