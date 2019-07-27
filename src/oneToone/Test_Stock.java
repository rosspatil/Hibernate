package oneToone;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

public class Test_Stock {

	
	public static void main(String[] args) {
		Session session=new Configuration().configure().buildSessionFactory().getCurrentSession();
		session.getTransaction().begin();
		StockDetails std=new StockDetails();
		Stock stock=new Stock();

		stock.setStockCode("101");
		stock.setStockName("Bornvill");
		
		std.setCompDesc("Dark");
		std.setCompName("Nestle");
		std.setListedDate(new Date());
		std.setRemark("Good");

		stock.setStockDetail(std);
		std.setStock(stock);
		
		session.save(stock);
		session.getTransaction().commit();
		
		
	}
}
