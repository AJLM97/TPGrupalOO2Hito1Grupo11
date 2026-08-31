package dao;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class HibernateUtil {
	private static SessionFactory sessionFactory;

	public static SessionFactory getSessionFactory() {
		try {
			if (sessionFactory == null) {
				StandardServiceRegistry standardRegistry = new StandardServiceRegistryBuilder()
						.configure("hibernate.cfg.xml").build();
				Metadata metaData = new MetadataSources(standardRegistry).getMetadataBuilder().build();
				sessionFactory = metaData.getSessionFactoryBuilder().build();
			}
			return sessionFactory;
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException("Error inicializando Hibernate", e);
		}
	}
	
}