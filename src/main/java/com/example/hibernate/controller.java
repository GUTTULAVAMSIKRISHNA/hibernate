package com.example.hibernate;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;

import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;



public class controller {
@SuppressWarnings("deprecation")
public static void main(String[] args) {
	StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
	Metadata md = new MetadataSources(ssr).getMetadataBuilder().build();
	SessionFactory sf= md.getSessionFactoryBuilder().build();
	Session s = sf.openSession();
	Transaction t = s.beginTransaction();
	Scanner src= new Scanner(System.in);
	hibernate h = new hibernate();
	System.out.println("enter name");
	String name = src.nextLine();
	System.out.println("enter email");
	String email=src.nextLine();
	System.out.println("enter password");
	String password =src.nextLine();
	System.out.println("enter number");
	long number = src.nextLong();
		h.setName(name);
		h.setEmail(email);
		h.setPassword(password);
		h.setNumber(number);
		s.save(h);
	t.commit();
	System.out.println("successfully inserted");
	s.close();
	sf.close();
}
}
