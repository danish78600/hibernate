package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class embed {
public static void main(String[] args) {
	 Configuration cfg=new Configuration();
     cfg.configure();
     
     SessionFactory factory=cfg.buildSessionFactory();
  Student stud=new Student();
  stud.setId(21);
  stud.setName("kartkik");
  stud.setSex("male");
  
  Certificate certificate=new Certificate();
  certificate.setCourse("web dev");
  certificate.setDuration("2 months");
stud.setCerti(certificate);

Session s=factory.openSession();
Transaction tx=s.beginTransaction();

s.save(stud);
tx.commit();
s.close();
factory.close();


}
}
