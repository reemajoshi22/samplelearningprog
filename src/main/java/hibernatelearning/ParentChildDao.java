package hibernatelearning;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class ParentChildDao {
	public static void main(String[] args) {
		Session session = SessionFactoryHolder.buildSessionFactory()
				.openSession();
		InheritChildCheque cheque=new InheritChildCheque();
		cheque.setPaymentId(11);
		cheque.setAmount(2600);
		cheque.setChequeType("hdfc");
		
		InheritChildCreditCard card=new InheritChildCreditCard();
		card.setAmount(2500);
		card.setPaymentId(11);
		card.setCreditCardType("visa");
		
		Transaction transaction = session.beginTransaction();
		session.save(cheque);
		//session.save(card);
		transaction.commit();
		session.close();

	}

}
