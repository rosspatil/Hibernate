package componentmapping;

import org.hibernate.Session;

public class App {

	public static void main(String[] args) {
		
		Session session=HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		
		Address address=new Address();
		address.setCity("nashik");
		address.setState("mh");
		address.setStreet("Pumping station");
		address.setZipcode("422013");
		
		Employee emp=new Employee();
		
		emp.setFirstName("roshan");
		emp.setLastName("patil");
		emp.setAddress(address);
		emp.setSalary(100000);
		
		session.save(emp);
		session.getTransaction().commit();
		
		
	}
	
}
