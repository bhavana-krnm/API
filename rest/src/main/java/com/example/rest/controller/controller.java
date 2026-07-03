package com.example.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.rest.model.Employee;
import com.example.rest.services.service;

@RestController
@RequestMapping("/employee")
public class controller {

    @Autowired
    service serve;

    @GetMapping
    public List<Employee> getEmployees() {
        return serve.getEmployees();
    }

    @GetMapping("/{id}")
    public Employee getEmployee(@PathVariable Long id) {
        return serve.getEmployee(id);
    }

    @PostMapping
    public Employee saveEmployee(@RequestBody Employee emp) {
        return serve.saveEmployee(emp);
    }

    @PutMapping("/{id}")
    public Employee updateEmployee(@PathVariable Long id, @RequestBody Employee emp) {
        return serve.updateEmployee(id, emp);
    }

    @DeleteMapping("/{id}")
    public String deleteEmployee(@PathVariable Long id) {
        serve.deleteEmployee(id);
        return "Employee Deleted Successfully";
    }
}