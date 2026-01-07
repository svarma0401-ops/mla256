package com.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

import java.util.List;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class EmployeeDaoTest {

    static EmployeeDao dao;

    @BeforeAll
    static void init() {
        dao = new EmployeeDaoImpl();
    }

   
    @Test
    @Order(1)
    void testAddEmployeePositive() {
        Employee emp = new Employee(1, "John", 50000, "IT");
        Employee result = dao.addEmployee(emp);
        assertEquals(1, result.getId());
    }

    @Test
    @Order(2)
    void testUpdateEmployeePositive() {
        Employee emp = new Employee(1, "John Updated", 60000, "HR");
        Employee result = dao.updateEmployee(emp);
        assertEquals(60000, result.getSalary());
    }

    @Test
    @Order(3)
    void testGetAllEmployeePositive() {
        List<Employee> list = dao.getAllEmployee();
        assertTrue(list.size() > 0);
    }

    @Test
    @Order(4)
    void testDeleteEmployeePositive() {
        assertDoesNotThrow(() -> dao.deleteEmployee(1));
    }

  

    @Test
    @Order(5)
    void testAddEmployeeNegative_DuplicateId() {
        Employee emp1 = new Employee(2, "Alice", 40000, "IT");
        Employee emp2 = new Employee(2, "Bob", 45000, "HR");

        dao.addEmployee(emp1);

        assertThrows(RuntimeException.class, () -> {
            dao.addEmployee(emp2);
        });
    }

    @Test
    @Order(6)
    void testUpdateEmployeeNegative_NotFound() {
        Employee emp = new Employee(999, "Ghost", 0, "NA");

        assertThrows(RuntimeException.class, () -> {
            dao.updateEmployee(emp);
        });
    }

    @Test
    @Order(7)
    void testDeleteEmployeeNegative_NotFound() {
        assertThrows(RuntimeException.class, () -> {
            dao.deleteEmployee(999);
        });
    }
}
