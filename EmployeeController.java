package controller;

import model.Employee;
import view.EmployeeView;

public class EmployeeController {

    private Employee model;
    private EmployeeView view;

    public EmployeeController(Employee model, EmployeeView view) {
        this.model = model;
        this.view = view;
    }

    public void setEmployeeName(String name) {
        model.setName(name);
    }

    public void setEmployeeEmail(String email) {
        model.setEmail(email);
    }

    public void setEmployeeId(int id) {
        model.setId(id);
    }

    public String getEmployeeName() {
        return model.getName();
    }

    public String getEmployeeEmail() {
        return model.getEmail();
    }

    public int getEmployeeId() {
        return model.getId();
    }

    public void updateView() {
        view.printEmployeeDetails(model);
    }
}