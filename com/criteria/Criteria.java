package com.criteria;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

import com.hibernate.Student;

public class Criteria {
public static void main(String[] args) {
	Session s=new Configuration().configure().buildSessionFactory().openSession();
	
	org.hibernate.Criteria criteria=s.createCriteria(Student.class);
	criteria.add(Restrictions.eq("sex", "female"));   //by this we have added restriction that print only those values that have sex = female
	List<Student> students=criteria.list();
	
	for(Student st:students)
	{
		System.out.println(st);
	}
	
}
}
