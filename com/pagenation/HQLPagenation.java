package com.pagenation;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.Student;

public class HQLPagenation {
public static void main(String[] args) {
	SessionFactory factory=new Configuration().configure().buildSessionFactory();
	Session s=factory.openSession();
	
Query query=	s.createQuery("from Student" );
	
//implementing pagination

query.setFirstResult(2); //how minimum results you want and its index no
query.setMaxResults(5);  //how much results do you want at max
List<Student> list=  query.list();
for(Student st:list)
{
	System.out.println(st.getName());
	System.out.println(st.getId());
}

	s.close();
	
	factory.close();
}
}
