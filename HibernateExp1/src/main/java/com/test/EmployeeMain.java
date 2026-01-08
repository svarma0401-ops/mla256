package com.test;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class EmployeeMain {

    public static void main(String[] args) {

        Configuration cfg = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class);

        SessionFactory sf = cfg.buildSessionFactory();

        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();

        Employee emp1 = new Employee("John", "IT", 50000);
        Employee emp2 = new Employee("Jane", "HR", 45000);

        session.persist(emp1);
        session.persist(emp2);

        tx.commit();
        session.close();
        System.out.println("Employees Inserted");

       
        session = sf.openSession();
        tx = session.beginTransaction();

        Query<Employee> selectQuery =
                session.createNamedQuery("Employee.findAll", Employee.class);

        List<Employee> employees = selectQuery.getResultList();

        tx.commit();
        session.close();

        System.out.println("All Employees:");
        employees.forEach(System.out::println);

        
        session = sf.openSession();
        tx = session.beginTransaction();

        Query<?> updateQuery =
                session.createNamedQuery("Employee.updateSalary");
        updateQuery.setParameter("salary", 60000.0);
        updateQuery.setParameter("id", emp1.getId());

        int updated = updateQuery.executeUpdate();

        tx.commit();
        session.close();
        System.out.println(updated + " record updated");

       
        session = sf.openSession();
        tx = session.beginTransaction();

        Query<?> deleteQuery =
                session.createNamedQuery("Employee.deleteById");
        deleteQuery.setParameter("id", emp2.getId());

        int deleted = deleteQuery.executeUpdate();

        tx.commit();
        session.close();
        System.out.println(deleted + " record deleted");

        sf.close();
    }
}
