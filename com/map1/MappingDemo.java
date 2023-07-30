package com.map1;

import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.SAXParser;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MappingDemo {
	public static void main(String[] args) {

		 Configuration cfg=new Configuration();
	     cfg.configure();
	     
	     SessionFactory factory=cfg.buildSessionFactory();
	     Emp e1=new Emp();
	     Emp e2=new Emp();
	     e1.setId(1);
	     e1.setEmpName("danish");
	     
	     e2.setId(2);
	     e2.setEmpName("prince");
	     
	     Project p1=new Project();
	     Project p2=new Project();
	     
	     p1.setId(3);
	     p1.setProjectName("chatgpt");
	     
	     p2.setId(4);
	     p2.setProjectName("chat app");
	     
	     List<Emp>list1=new ArrayList<Emp>();
	     List<Project>list2=new ArrayList<Project>();
	     
	     list1.add(e1);
	     list1.add(e2);
	     
	     list2.add(p1);
	     list2.add(p2);
	     
	     e1.setProjects(list2);
	     
	     p2.setEmps(list1);
	     
	     Session s=factory.openSession();
	     Transaction tx=s.beginTransaction();
	     s.save(e1);
	     s.save(e2);
	     s.save(p1);
	     s.save(p2);
	     
	     tx.commit();
	     s.close();
	     factory.close();
	     
	}
     
}
