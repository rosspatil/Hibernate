package annotatin;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class Test_student {
	
	public static void main(String[] args) {
		
		Session session=HibernateUtil.getSessionFactory().openSession();
		Transaction tx=session.beginTransaction();
		
		Student stud=new  Student();
		stud.setName("roshan");
		
		
		Marks marks=new Marks();
		marks.setMarks(100);
		Set<Marks> st=new HashSet<>();
		Marks m1=new Marks();
		m1.setMarks(200);
		st.add(marks);
		st.add(m1);
		stud.setMarks(st);
		
		session.save(stud);
		tx.commit();
		System.out.println("done");
		
	}

}
