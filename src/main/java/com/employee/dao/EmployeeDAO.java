package com.employee.dao;

import com.employee.model.Employee;
import com.employee.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class EmployeeDAO {

    public void saveEmployee(Employee employee) {
        Transaction transaction = null;
        Session session = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            transaction = session.beginTransaction();
            
            // Save Employee
            session.save(employee);
            
            // Commit transaction
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) transaction.rollback(); // Rollback on error
            e.printStackTrace();
        } finally {
            if (session != null && session.isOpen()) {
                session.close(); // Ensure session is closed
            }
        }
    }

    public List<Employee> getAllEmployees() {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            return session.createQuery("FROM Employee", Employee.class).list();
        }
    }
}
