package com.test;

import java.util.List;

public interface EmployeeDao {
    void addEmployee(Employee emp);
    void updateEmployee(Employee emp);
    void deleteEmployee(int id);
    List<Employee> getAllEmployee();
}
