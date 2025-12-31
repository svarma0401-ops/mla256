package com.test;


import java.util.Scanner;

public class EmployeeApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        EmployeeDao dao = new EmployeeDaoImpl();

        while (true) {
            System.out.println("\n1.Add 2.Update 3.Delete 4.View 5.Exit");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter id name salary dept: ");
                    dao.addEmployee(new Employee(
                            sc.nextInt(),
                            sc.next(),
                            sc.nextDouble(),
                            sc.next()
                    ));
                    System.out.println("Employee Added");
                    break;

                case 2:
                    System.out.print("Enter id name salary dept: ");
                    dao.updateEmployee(new Employee(
                            sc.nextInt(),
                            sc.next(),
                            sc.nextDouble(),
                            sc.next()
                    ));
                    System.out.println("Employee Updated");
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
