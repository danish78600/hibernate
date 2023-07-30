package com.map;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hibernate.Student;

public class Test {
	 public static void main(String[] args) {
		 Configuration cfg=new Configuration();
	     cfg.configure();
	     
	     SessionFactory factory=cfg.buildSessionFactory();
//	     Question q1=new Question();
//	     q1.setId(12);
//	     q1.setName("name tell");
//	     
//	     Answer answer=new Answer();
//	     answer.setId(002);
//	     answer.setName("danish you tell");
//	     answer.setQuestion(q1);
//	     
////	     q1.setAnswer(answer); //code for one to one 
//	     
//	     Answer answer1=new Answer();
//	     answer1.setId(001);
//	     answer1.setName("kartik you tell");
//	     answer1.setQuestion(q1);
//	     
//	     List<Answer>list=new ArrayList<Answer>();
//	     list.add(answer);
//	     list.add(answer1);
	     
//	     q1.setAnswers(list);
	     
	     //OPEN SESSION
	     Session s=factory.openSession();
	     Transaction tx=s.beginTransaction();
	     
//	     s.save(q1);
//	     s.save(answer);
//	     s.save(answer1);
	     
	     //to get the data
	     Question q=(Question)s.get(Question.class, 12);
	     System.out.println(q.getName());
	     System.out.println(q.getId());
//	     
//	     System.out.println(q.getName());
//	     
//	     for(Answer a:q.getAnswers())
//	     {
//	    	 System.out.println(a.getName());
//	     }
	     
	     tx.commit();
	     s.close();
	     
	     factory.close();
	}
}
