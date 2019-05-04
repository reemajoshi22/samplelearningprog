package hibernatelearning;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.orm.hibernate3.HibernateTemplate;

public class PhoneDao_spring {
	HibernateTemplate hibernateTemplate;
	PhoneDao_spring phoneDao_spring;
	public static void main(String[] args) {
			ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
					"HibernateSpringContext.xml");
			
			PhoneDao_spring phoneDao_spring=(PhoneDao_spring)applicationContext.getBean("phoneDao");
			phoneDao_spring.insertData();
			
	}
	private Phone updateData() {
		Phone phone = new Phone();
		 phone.setPhone_id(200);// comment this line if we are using generaor
		// other than assigned cz this will be a detached entity
		phone.setSim_slots("4");
		phone.setPhone_model("nokia10");

		OS os = new OS();
		os.setOs_id(2);
		os.setOs_name("android");
		phone.setOs(os);

		Manufacturer manufacturer = new Manufacturer();
		manufacturer.setManufacturer_id(4);
		manufacturer.setManufacturername("nokia");
		manufacturer.setCountry("india");
		phone.setManufacturer(manufacturer);
		hibernateTemplate.update(phone);

		return phone;

	}

	private Phone insertData() {
		Phone phone = new Phone();
		 phone.setPhone_id(204);// comment this line if we are using generaor
		// other than assigned cz this will be a detached entity
		phone.setSim_slots("2");
		phone.setPhone_model("nokia11");

		OS os = new OS();
		os.setOs_id(8);
		os.setOs_name("android");
		phone.setOs(os);

		Manufacturer manufacturer = new Manufacturer();
		manufacturer.setManufacturer_id(9);
		manufacturer.setManufacturername("nokia");
		manufacturer.setCountry("india");
		phone.setManufacturer(manufacturer);
		hibernateTemplate.save(phone);

		return phone;

	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	public PhoneDao_spring getPhoneDao_spring() {
		return phoneDao_spring;
	}
	public void setPhoneDao_spring(PhoneDao_spring phoneDao_spring) {
		this.phoneDao_spring = phoneDao_spring;
	}

}
