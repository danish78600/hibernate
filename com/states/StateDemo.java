package com.states;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hibernate.Certificate;
import com.hibernate.Student;

public class StateDemo {
public static void main(String[] args) {
	SessionFactory f=new Configuration().configure().buildSessionFactory();
	Student student=new Student();
	student.setId(113);
	student.setName("danish");
	student.setSex("male");
	
	Certificate certificate=new Certificate();
	certificate.setCourse("blochain dev");
	certificate.setDuration("9 months");
	
	student.setCerti(certificate);
	//in the above the object is in transient state as it is not associated with session
	
	Session s=f.openSession();
	Transaction tx=s.beginTransaction();
	
	
	s.save(student);
	
	//in the above the object will be transfered in the persistence state as it is associated with both database and session
	
	student.setName("kartik bhai");//so the new value will stored in the session as it is above commit
	
	tx.commit();
	s.close();
	//by s.close() the object will be in detached state as the obj from the session is removed but remain in the database
	
	f.close();
}
}
