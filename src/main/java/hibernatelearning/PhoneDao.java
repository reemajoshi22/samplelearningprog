package hibernatelearning;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class PhoneDao {

	public static void main(String[] args) {
		PhoneDao dao = new PhoneDao();
		/*Session session = SessionFactoryHolder.buildSessionFactory()
				.openSession();*/
		SessionFactory factory = SessionFactoryHolder.buildSessionFactory();
        Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		// insert data
		Phone insertData = dao.insertData();
		 session.save(insertData);
		//session.persist(insertData);// comment generator in xml if using this
		// session.flush();
		System.out.println("data inserted");
		transaction.commit();
		session.close();
		factory.close();
		

		// delete data
		/*
		 * Transaction transaction2 = session.beginTransaction(); Phone
		 * updateData = dao.updateData(); session.delete(updateData);
		 * transaction2.commit();
		 */

		// updating data
		/*
		 * Transaction transaction3 = session.beginTransaction(); Phone
		 * updateData = dao.updateData(); session.update(updateData);
		 * transaction3.commit();
		 */

		// get data-load- using load method
		// Transaction transaction4 = session.beginTransaction();
		/*
		 * Phone phone=(Phone) session.load(Phone.class,new Integer(101));//
		 * load is lazy initializer
		 * System.out.println(phone.getPhone_model());// throws object not found
		 * exception if it doent exit
		 */// transaction4.commit();

		// get data using get method
		/*
		 * Phone phoneUsingGet = (Phone) session.get(Phone.class,new
		 * Integer(101)); System.out.println(phoneUsingGet.getPhone_model());
		 */

	}

	private Phone updateData() {
		Phone phone = new Phone();
		//phone.setPhone_id(410);// comment this line if we are using generaor
		// other than assigned cz this will be a detached entity
		phone.setSim_slots("18");
		phone.setPhone_model("nokia11");

		OS os = new OS();
		os.setOs_id(40);
		os.setOs_name("androidd");
		phone.setOs(os);

		Manufacturer manufacturer = new Manufacturer();
		manufacturer.setManufacturer_id(41);
		manufacturer.setManufacturername("nokiaa");
		manufacturer.setCountry("india");
		phone.setManufacturer(manufacturer);

		return phone;

	}

	private Phone insertData() {
		Phone phone = new Phone();
		 phone.setPhone_id(125);// comment this line if we are using generaor
		// other than assigned cz this will be a detached entity// for forst
		// time it inserts 0 and for second time it will return error
		phone.setSim_slots("2");
		phone.setPhone_model("nokia11");

		OS os = new OS();
		os.setOs_id(228);
		os.setOs_name("android");
		phone.setOs(os);

		Manufacturer manufacturer = new Manufacturer();
		manufacturer.setManufacturer_id(38);
		manufacturer.setManufacturername("nokia");
		manufacturer.setCountry("india");
		phone.setManufacturer(manufacturer);

		return phone;

	}

}
