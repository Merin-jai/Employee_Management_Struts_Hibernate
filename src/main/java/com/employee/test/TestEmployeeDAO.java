package com.employee.test;

import com.employee.dao.EmployeeDAO;
import com.employee.model.Employee;

public class TestEmployeeDAO {
    public static void main(String[] args) {
        EmployeeDAO dao = new EmployeeDAO();

        // Create a new Employee
        Employee emp = new Employee();
        emp.setName("Abey");
        emp.setEmail("Abey@example.com");
        emp.setSalary(50000);
        emp.setDesignation("Software Engineer");

        dao.saveEmployee(emp);
        System.out.println("✅ Employee added successfully!");

        // Fetch and print all employees
        System.out.println("🔍 Employee List:");
        for (Employee e : dao.getAllEmployees()) {
            System.out.println(e.getId() + " | " + e.getName() + " | " + e.getEmail());
        }
    }
}
