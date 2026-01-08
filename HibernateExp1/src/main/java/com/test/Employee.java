package com.test;


import jakarta.persistence.NamedQueries;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;

@Entity
@Table(name = "employee")

@NamedQueries({
    @NamedQuery(
        name = "Employee.findAll",
        query = "FROM Employee"
    ),
    @NamedQuery(
        name = "Employee.updateSalary",
        query = "UPDATE Employee SET salary = :salary WHERE id = :id"
    ),
    @NamedQuery(
        name = "Employee.deleteById",
        query = "DELETE FROM Employee WHERE id = :id"
    )
})
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    private String department;
    private double salary;

    public Employee() {}

    public Employee(String name, String department, double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

  
    public int getId() { return id; }
    public String getName() { return name; }
    public String getDepartment() { return department; }
    public double getSalary() { return salary; }

    public void setName(String name) { this.name = name; }
    public void setDepartment(String department) { this.department = department; }
    public void setSalary(double salary) { this.salary = salary; }

    @Override
    public String toString() {
        return id + " " + name + " " + department + " " + salary;
    }
}
