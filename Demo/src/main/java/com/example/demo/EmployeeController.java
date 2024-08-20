package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
    @Autowired
     EmployeeService employeeService;

    @GetMapping("/{name}")
    public Employee getEmployee(@PathVariable String name) {
        Employee employee = employeeService.getEmployeeByName(name);
        if (employee != null) {
            employeeService.computeSalary(employee);
        }
        return employee;
    }
}