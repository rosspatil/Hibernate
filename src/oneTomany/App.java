package oneTomany;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

public class App {
	public static void main(String[] args) {

		System.out.println("Hibernate one to many (XML Mapping)");
		Session session = new Configuration().configure().buildSessionFactory().getCurrentSession();

		session.beginTransaction();

		Stock stock = new Stock();
		stock.setStockCode("7052");
		stock.setStockName("PADINI");
		session.save(stock);

		StockDailyRecord stockDailyRecords = new StockDailyRecord();
		stockDailyRecords.setPriceOpen(new Float("1.2"));
		stockDailyRecords.setPriceClose(new Float("1.1"));
		stockDailyRecords.setPriceChange(new Float("10.0"));
		stockDailyRecords.setVolume(3000000L);
		stockDailyRecords.setDate(new Date());
		
		StockDailyRecord st=new StockDailyRecord();
		st.setPriceChange(1.3f);
		st.setPriceOpen(1.1f);
		st.setPriceClose(2.2f);
		st.setVolume(200L);
		st.setDate(new  Date(2,2,1));
		st.setStock(stock);

		stockDailyRecords.setStock(stock);        
		stock.getStockDailyRecords().add(stockDailyRecords);

		session.save(stockDailyRecords);
		session.save(st);
		

		session.getTransaction().commit();
		System.out.println("Done");
	}
}
