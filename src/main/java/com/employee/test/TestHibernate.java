package com.employee.test;

import org.hibernate.Session;
import com.employee.util.HibernateUtil;

public class TestHibernate {
    public static void main(String[] args) {
        System.out.println("Trying to connect to the database...");

        // Open Hibernate session
        Session session = HibernateUtil.getSessionFactory().openSession();
        if (session != null) {
            System.out.println("✅ Successfully connected to the database using Hibernate!");
            session.close();
        } else {
            System.out.println("❌ Database connection failed!");
        }
    }
}
