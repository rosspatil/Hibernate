package com.seed.hibernate;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class Test_stud {

	static String subj[]={"toc","dcwn","osd"};
	static int mark=100;
	public static void main(String[] args) {

		Session session=HibernateUtil.getSessionFactory().openSession();
		Transaction tx=session.beginTransaction();

		Student stud=new Student();
		stud.setName("roshan");
		session.save(stud);

		Set<Result> st=new HashSet<>();
		Result result=new Result();
		for (String str : subj) {
			result.setMarks(mark+10);
			result.setSub(str);
			st.add(result);
		}
		result.setStud(stud);
		
		stud.setResult(st);

		session.save(result);
		tx.commit();
		session.close();

	}

}
