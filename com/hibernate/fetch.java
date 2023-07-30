package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class fetch {
public static void main(String[] args) {
	 Configuration cfg=new Configuration();
     cfg.configure();
     
     SessionFactory factory=cfg.buildSessionFactory();
     Session s=factory.openSession();
     Student stud=(Student)s.get(Student.class, 1);
     System.out.println(stud);
     s.close();
     factory.close();
    
}
}
