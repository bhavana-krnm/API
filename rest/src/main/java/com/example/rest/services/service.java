package com.example.rest.services;

import com.example.rest.model.Employee;
import com.example.rest.repository.EmployeeRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class service {

    @Autowired
    EmployeeRepository res;

    public List<Employee> getEmployees() {
        return res.findAll();
    }

    public Employee getEmployee(Long id) {
        return res.findById(id).orElse(null);
    }

    public Employee saveEmployee(Employee emp) {
        return res.save(emp);
    }

   public Employee updateEmployee(Long id, Employee emp)
{
    Employee employ = res.findById(id).orElse(null);

    if (employ == null) {
        return null;
    }

    employ.setName(emp.getName());
    employ.setDept(emp.getDept());
    employ.setSalary(emp.getSalary());

    return res.save(employ);
}

    public void deleteEmployee(Long id) {
        res.deleteById(id);
    }
}