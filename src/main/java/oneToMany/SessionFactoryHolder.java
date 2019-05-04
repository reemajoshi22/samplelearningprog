package oneToMany;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class SessionFactoryHolder {
	private static SessionFactory factory = buildSessionFactory();

	public static SessionFactory buildSessionFactory() {
		if (factory == null) {
			Configuration configuration = new Configuration()
					.configure("/hibernate_oneTOOne.cfg.xml");
			/*Configuration configuration = new Configuration()
			.configure("/hibernate_learning_parentChild.cfg.xml");*/
			StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
					.applySettings(configuration.getProperties()).build();
			factory = configuration.buildSessionFactory(registry);
		}
		return factory;
	}
}
