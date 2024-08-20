package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    public Employee getEmployeeByName(String name) {
        List<Employee> employees = employeeRepository.findByName(name);
        if (employees.isEmpty()) {
            return null;
        }
        return employees.get(0);
    }

    public void computeSalary(Employee employee) {
        Integer grossSalary = employee.getBasic() + employee.getHra() + employee.getDa();
        Integer tax = (int) (grossSalary * 0.15);
        Integer netSalary = grossSalary - (tax + employee.getDeductions());
        System.out.println("Gross Salary: " + grossSalary);
        System.out.println("Tax: " + tax);
        System.out.println("Net Salary: " + netSalary);
    }
}
