package com.secondcache;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.Student;

public class SecondLevelCache {
public static void main(String[] args) {
	SessionFactory factory=new Configuration().configure().buildSessionFactory();
	Session session2=factory.openSession();
Student student2=	session2.get(Student.class, 12);
System.out.println(student2);
	
	session2.close();
	
	Session session3=factory.openSession();
Student student3=	session3.get(Student.class, 12);  //now if the second level cache is allowed then the query will run only once.
System.out.println(student3);
	session3.close();
	factory.close();
}
}
