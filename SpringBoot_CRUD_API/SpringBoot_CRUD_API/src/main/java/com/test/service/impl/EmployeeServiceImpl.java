package com.test.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.*;
import com.test.repository.EmployeeRepo;
import com.test.entity.Employee;
import com.test.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepo repo;

    public List<Employee> getAll() {
        return repo.findAll();
    }

    public Employee create(Employee emp) {
        return repo.save(emp);
    }

    public Employee update(Long id, Employee emp) {
        emp.setId(id);
        return repo.save(emp);
    }

    public void delete(Long id) {
        repo.deleteById(id);
    }
}
