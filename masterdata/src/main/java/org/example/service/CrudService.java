package org.example.service;

import org.example.entity.Employee;

import java.util.List;

public interface CrudService {

    List<Employee> getEmployees();

    Employee getEmployee(long id);

    Employee addEmployee(Employee employee);

    Employee updateEmployee(Employee employee);

    void deleteEmployee(long id);
}