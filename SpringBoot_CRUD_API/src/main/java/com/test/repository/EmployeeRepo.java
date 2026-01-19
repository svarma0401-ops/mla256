package com.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.test.entity.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Long> {}
