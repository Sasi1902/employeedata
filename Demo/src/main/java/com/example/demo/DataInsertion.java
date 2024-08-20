//package com.example.demo;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.stereotype.Component;
//
//@Component
//public class DataInsertion implements CommandLineRunner {
//    @Autowired
//    private EmployeeRepository employeeRepository;
//
//    @Override
//    public void run(String... args) throws Exception {
//        List<Employee> employees = new ArrayList<>();
//        employees.add(new Employee(233, "John Marquee", 50000, 10000, 20000, 5000));
//        employees.add(new Employee(243,"Jane Doe", 60000, 12000, 25000, 6000));
//        employees.add(new Employee(143,"Bob Smith", 70000, 15000, 30000, 7000));
//        employees.add(new Employee(23,"Alice Johnson", 80000, 18000, 35000, 8000));
//        employees.add(new Employee(null, "Mike Brown", 90000, 20000, 40000, 9000));
//        employees.add(new Employee(null, "Emily Davis", 100000, 22000, 45000, 10000));
//        employees.add(new Employee(null, "David Lee", 110000, 25000, 50000, 11000));
//        employees.add(new Employee(null, "Sarah Taylor", 120000, 28000, 55000, 12000));
//        employees.add(new Employee(null, "Kevin White", 130000, 30000, 60000, 13000));
//        employees.add(new Employee(null, "Lisa Nguyen", 140000, 32000, 65000, 14000));
//
//        employeeRepository.saveAll(employees);
//    }
//}
