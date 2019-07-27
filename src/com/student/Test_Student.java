package com.student;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

public class Test_Student {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws SQLException {
		Session session=new Configuration().configure().buildSessionFactory().openSession();
		session.beginTransaction();
		Student s1,s2;
		
//		 s1=new Student();
//		s1.setName("roshan");
//		s1.setRoll(1);
//		session.save(s1);
//		session.getTransaction().commit();		
//		System.out.println("saved");
		
		
	
		
//		s1=(Student)session.get(Student.class, 1);
//		System.out.println(s1);
//		s2=(Student) session.get(Student.class, 1);
//		s2.setName("lokesh");
//		session.update(s2);
//		session.getTransaction().commit();
//		System.out.println("Data Upated...");
		
		
//		s2=(Student) session.get(Student.class, 1);
//		session.delete(s2);
//		session.getTransaction().commit();
//		System.out.println(Data Delete.....);
		
		
	List s=session.createQuery("From Student").list();
//		List s=session.createQuery(" from student").list();
	Iterator<List> i=s.iterator();
	while (i.hasNext()) {
		 s1= (Student) i.next();
		System.out.println(s1);
		
		
	}
		
		
	}
	
	
}
