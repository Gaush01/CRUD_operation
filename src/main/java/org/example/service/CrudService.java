package org.example.service;

import org.example.entity.Employee;

import java.util.List;

public interface CrudService {

    public List<Employee> getEmployees();

    public Employee getEmployee(long id);

    public Employee addEmployee(Employee employee);

    public Employee updateEmployee(Employee employee);

    public void deleteEmployee(long parseLong);
}
