package com.test.service;

import java.util.List;
import com.test.entity.Employee;

public interface EmployeeService {
    List<Employee> getAll();
    Employee create(Employee emp);
    Employee update(Long id, Employee emp);
    void delete(Long id);
}
