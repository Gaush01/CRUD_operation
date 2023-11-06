package org.example.controller;

import org.example.entity.Employee;
import org.example.service.CrudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CrudController {

    @Autowired
    private CrudService crudService;

    @GetMapping("/home")
    public String home() {
        return "Welcome to courses application";
    }

    @GetMapping("/employees")
    public List<Employee> getEmployees() {
        return this.crudService.getEmployees();
    }

    @GetMapping("/employees/{id}")
    public Employee getEmployee(@PathVariable String id) {
        return this.crudService.getEmployee(Long.parseLong(id));
    }

    @PostMapping("/employee")
    public Employee addEmployee(@RequestBody Employee employee) {
        return this.crudService.addEmployee(employee);
    }

    @PutMapping("/employees")
    public Employee updateEmployee(@RequestBody Employee employee) {
        return this.crudService.updateEmployee(employee);
    }

    @DeleteMapping("/employees/{id}")
    public String deleteCourse(@PathVariable String id) {
        this.crudService.deleteEmployee(Long.parseLong(id));
        return "Successfully Deleted Id: " + id;
    }
}