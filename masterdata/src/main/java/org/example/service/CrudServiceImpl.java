package org.example.service;

import org.example.entity.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CrudServiceImpl implements CrudService{


    List<Employee> list;

    public CrudServiceImpl() {

        list = new ArrayList<>();
        list.add(new Employee(1, "Raj", "Verma", "raj.verma@imahing.com", 35));
        list.add(new Employee(2, "Vaibhav", "Telang", "v.telang@futreready.com", 29));
        list.add(new Employee(3, "Ketan", "Bahadur", "k.bahadur@infonext.com", 32));
        list.add(new Employee(4, "Abhishek", "Raj", "abhi.raj@softsol.com", 30));
    }

    @Override
    public List<Employee> getEmployees() {
        return list;
    }

    @Override
    public Employee getEmployee(long id) {
        Employee e = null;

        for (Employee employee : list) {
            if (employee.getId()==id) {
                e = employee;
                break;
            }
        }
        return e;
    }

    @Override
    public Employee addEmployee(Employee employee) {
        list.add(employee);
        return employee;
    }

    @Override
    public Employee updateEmployee(Employee employee) {
        list.forEach(e -> {
            if (e.getId()==employee.getId()) {
                e.setFirstName(employee.getFirstName());
                e.setLastName(employee.getLastName());
                e.setEmail(employee.getEmail());
                e.setAge(employee.getAge());
            }
        });
        return employee;
    }

    @Override
    public void deleteEmployee(long id) {
        this.list.removeIf(employee -> employee.getId() == id);
    }
}