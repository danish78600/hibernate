package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
     Configuration cfg=new Configuration();
     cfg.configure();
     
     SessionFactory factory=cfg.buildSessionFactory();
     System.out.println(factory);
      Student stud=new Student();
      stud.setId(15);
      stud.setName("shifalo");
      stud.setSex("male");
      
      Session s=factory.openSession();
    Transaction tx=  s.beginTransaction();
      s.save(stud);
      tx.commit();
      s.close();
      factory.close();
      
    }
}
