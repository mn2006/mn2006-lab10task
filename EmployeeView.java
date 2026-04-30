package view;

import model.Employee;

public class EmployeeView {

    public void printEmployeeDetails(Employee emp) {
        System.out.println("Employee Details:");
        System.out.println("ID: " + emp.getId());
        System.out.println("Name: " + emp.getName());
        System.out.println("Email: " + emp.getEmail());
    }
}