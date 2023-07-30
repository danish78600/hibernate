package com.firstcache;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.Student;

public class FirstDemo {
public static void main(String[] args) {
	SessionFactory factory=new Configuration().configure().buildSessionFactory();
	Session s=factory.openSession();
	
Student student	=s.get(Student.class, 12);
	System.out.println(student);
	System.out.println("working");
	
	Student student2=s.get(Student.class, 12);
	System.out.println(student2);
	
	System.out.println(s.contains(student2));  //it will tells that the student is present in cache memory or not
	s.close();
	factory.close();
}
}
