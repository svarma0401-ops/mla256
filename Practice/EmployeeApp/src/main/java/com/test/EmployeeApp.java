package com.test;


import java.util.Scanner;

public class EmployeeApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        EmployeeDao dao = new EmployeeDaoImpl();
        System.out.println("Welcome to Employee Management System");
        while (true) {
        	System.out.println("Select Option");
        	System.out.println("1. Add New Employee");
        	System.out.println("2. Update Employee details");
        	System.out.println("3. Delete Employee");
        	System.out.println("4. View Employees");
        	System.out.println("5. Exit");
        	System.out.println("Enter You Option:");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                	System.out.print("Enter Employee ID: ");
                    int id = sc.nextInt();

                    System.out.print("Enter Employee Name: ");
                    String name = sc.next();

                    System.out.print("Enter Employee Salary: ");
                    double salary = sc.nextDouble();

                    System.out.print("Enter Employee Department: ");
                    String dept = sc.next();

                    dao.addEmployee(new Employee(id, name, salary, dept));
                    System.out.println("Employee added successfully\n");
                    break;

                case 2:
                    System.out.print("Enter id name salary dept : ");
                    dao.updateEmployee(new Employee(
                            sc.nextInt(),
                            sc.next(),
                            sc.nextDouble(),
                            sc.next()
                    ));
                    System.out.println("Employee Details Updated");
                    break;

                case 3:
                    System.out.print("Enter id: ");
                    dao.deleteEmployee(sc.nextInt());
                    System.out.println("Employee Deleted");
                    break;

                case 4:
                    dao.getAllEmployee().forEach(System.out::println);
                    break;

                case 5:
                    System.exit(0);  
            }
        }
    }
}
