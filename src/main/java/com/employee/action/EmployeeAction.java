package com.employee.action;

import com.employee.dao.EmployeeDAO;
import com.employee.model.Employee;
import com.opensymphony.xwork2.ActionSupport;
import java.util.List;

public class EmployeeAction extends ActionSupport {
    private static final long serialVersionUID = 1L;
    private Employee employee;
    private List<Employee> employees;
    private int id;

    private EmployeeDAO dao = new EmployeeDAO();

    // Method to list all employees
    public String list() {
        employees = dao.getAllEmployees();
        if (employees == null || employees.isEmpty()) {
            addActionMessage("No employees found.");
        }
        return SUCCESS;
    }

    // Method to add a new employee
    public String add() {
        try {
            if (employee != null && employee.getName() != null && !employee.getName().isEmpty()) {
                dao.saveEmployee(employee); // Save the employee
                return SUCCESS;
            } else {
                addActionError("Employee data is invalid. Please provide valid details.");
                return ERROR;
            }
        } catch (Exception e) {
            addActionError("Error adding employee: " + e.getMessage());
            return ERROR;
        }
    }

    // Method to update an employee
    public String update() {
        try {
            Employee existingEmployee = dao.getEmployeeById(employee.getId());
            if (existingEmployee != null) {
                existingEmployee.setName(employee.getName());
                existingEmployee.setEmail(employee.getEmail());
                existingEmployee.setDesignation(employee.getDesignation());
                existingEmployee.setSalary(employee.getSalary());
                
                dao.updateEmployee(existingEmployee); // Update the employee
                return SUCCESS;
            } else {
                addActionError("Employee not found");
                return ERROR;
            }
        } catch (Exception e) {
            addActionError("Error updating employee: " + e.getMessage());
            return ERROR;
        }
    }

    // Method to delete an employee
    public String delete() {
        try {
            Employee existingEmployee = dao.getEmployeeById(employee.getId());
            if (existingEmployee != null) {
                dao.deleteEmployee(existingEmployee); // Delete the employee
                return SUCCESS;
            } else {
                addActionError("Employee not found");
                return ERROR;
            }
        } catch (Exception e) {
            addActionError("Error deleting employee: " + e.getMessage());
            return ERROR;
        }
    }

    // Getters and Setters
    public Employee getEmployee() { return employee; }
    public void setEmployee(Employee employee) { this.employee = employee; }

    public List<Employee> getEmployees() { return employees; }
    public void setEmployees(List<Employee> employees) { this.employees = employees; }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
}
