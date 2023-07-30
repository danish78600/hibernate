package com.cascading;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.map.Answer;
import com.map.Question;

public class Cascade {
public static void main(String[] args) {
	SessionFactory factory=new Configuration().configure().buildSessionFactory();
	Session s=factory.openSession();
	
	Question q1=new Question();
	q1.setId(12112);
	q1.setName("tell me your passion");
	
	Answer answer=new Answer(11111,"programmer");
	Answer a1=new Answer(12121,"coder");
	
	List<Answer>list=new ArrayList<Answer>();
	list.add(answer);
	list.add(a1);
	q1.setAnswers(list);
	
	Transaction txTransaction=s.beginTransaction();
	
	s.save(q1);
//	s.save(answer);
//	s.save(a1);
//	
	
	txTransaction.commit();
	s.close();
	
	factory.close();
}
}
