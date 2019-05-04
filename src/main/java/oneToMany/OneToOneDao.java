package oneToMany;

import java.util.Date;



import org.hibernate.Session;
import org.hibernate.Transaction;

public class OneToOneDao {
	public static void main(String[] args) {
		Session session = SessionFactoryHolder.buildSessionFactory()
				.openSession();
		Transaction transaction = session.beginTransaction();
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
        
        stockDailyRecords.setStock(stock);        
        stock.getStockDailyRecords().add(stockDailyRecords);

        session.save(stockDailyRecords);

        transaction.commit();
	System.out.println("Done");
	}
}
