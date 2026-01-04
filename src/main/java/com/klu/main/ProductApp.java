package com.klu.main;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.klu.entity.Product;
import com.klu.util.HibernateUtil;

public class ProductApp {

    public static void main(String[] args) {

        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();

        Product p1 = new Product("Laptop", "Gaming Laptop", 75000, 5);
        Product p2 = new Product("Mobile", "5G Smartphone", 30000, 10);

        session.persist(p1);
        session.persist(p2);

        tx.commit();
        session.close();

        System.out.println("Data inserted successfully");
    }
}
