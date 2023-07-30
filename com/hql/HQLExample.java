package com.hql;

import java.util.List;

import org.hibernate.query.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hibernate.Student;

public class HQLExample {
public static void main(String[] args) {
	 Configuration cfg=new Configuration();
     cfg.configure();
     
     SessionFactory factory=cfg.buildSessionFactory();
     Session s=factory.openSession();
     
     //creating hql query
     String query="from Student where name=:x";     //we can also gave name explicitly by name=:x; and set it by q.setparameter()
     
     Query q=s.createQuery(query);
     
     q.setParameter("x", "danish");
     
     List<Student>list=q.list(); //it will give us the list of students
     
     for(Student student:list)
     {
    	 System.out.println(student.getName());
    	 System.out.println(student.getCerti().getCourse());
     }
     
     Transaction tx=s.beginTransaction();
     
     //delete query
     
// Query query2=    s.createQuery("delete from Student where name=:c");
//   query2.setParameter("c", "danish");
//   int r=  query2.executeUpdate();
//   System.out.println(r);
     
     //update query
// Query query2=    s.createQuery("update Student set sex=:nsex where name=:nname ");
// query2.setParameter("nsex", "female");
// query2.setParameter("nname", "kartik bhai");
// int r=query2.executeUpdate();
// System.out.println(r);
  
     
     
   tx.commit();
     
     s.close();
     factory.close();
}
}
