package ua.lviv.lgs.hbm.xml;

import java.util.Arrays;
import java.util.HashSet;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class HibernateXMLConfStarter {
	public static void main(String[] args) {

		// create configuartion object with credentionls to DB
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");

		ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
				.applySettings(configuration.getProperties()).build();

		SessionFactory factory = configuration.buildSessionFactory(serviceRegistry);

		Session session = factory.openSession();

		Transaction transaction = session.beginTransaction();

//		//create
//		Person person = new Person("Andrew","Horlovych",35);
//		session.persist(person);

//		//read single entity
//		Person personFromDB = (Person) session.get(Person.class,2);
//		System.out.println(personFromDB);

//		//get All from DB
//		List<Person> listOfPersons = session.createCriteria(Person.class).list();
//		listOfPersons.forEach(System.out::println);

//		//update entity
//		Person personForUpdate = (Person) session.get(Person.class, 1);
//		System.out.println(personForUpdate);
//		personForUpdate.setAge(80);
//		session.persist(personForUpdate);

		// delete
//		Person personForDelete = (Person) session.get(Person.class, 1);
//		session.delete(personForDelete);

		// create
		Item i = new Item(35);
		Item i1 = new Item(36);
		Item i2 = new Item(37);
		Item i3 = new Item(38);
		Cart c = new Cart(35,"my_cart");
		
		c.setItems(new HashSet<>(Arrays.asList(i,i1,i2,i3)));
		session.persist(c);
		session.persist(i);
		session.persist(i1);
		session.persist(i2);
		session.persist(i3);

		transaction.commit();
		session.close();

	}

}
