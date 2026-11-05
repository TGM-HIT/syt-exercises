package main;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Set;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.BasicConfigurator;

import model.*;

public class Main {

	private static final Logger log = Logger.getLogger(Main.class);

        // TODO Check PersistenceUnit Definition
	private static EntityManagerFactory sessionFactory;
	@PersistenceContext
	private static EntityManager entitymanager;
	
	static SimpleDateFormat dateForm = new SimpleDateFormat("dd.MM.yyyy");
	static SimpleDateFormat timeForm = new SimpleDateFormat("dd.MM.yyyy mm:hh");

	private Main() {
		super();
	}

	public static void main(String[] args) {
		
		BasicConfigurator.configure();
		
		try {
			log.info("Starting \"Mapping Perstistent Classes and Associations\" (task1)");
			sessionFactory = Persistence.createEntityManagerFactory("westbahn");
			entitymanager = sessionFactory.createEntityManager();
			fillDB(entitymanager);
			task01();
			log.info("Starting \"Working with JPA-QL and the Hibernate Criteria API\" (task2)");
			log.setLevel(Level.OFF);
			task02();
			task02a();
			task02b();
			task02c();
			log.setLevel(Level.ALL);
			task03(entitymanager);
		} catch (ParseException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (entitymanager.getTransaction().isActive())
				entitymanager.getTransaction().rollback();
			entitymanager.close();
			sessionFactory.close();
		}
	}

	public static void fillDB(EntityManager em) throws ParseException {
		em.getTransaction().begin();
		List<Bahnhof> list = new ArrayList<Bahnhof>();
		list.add(new Bahnhof("WienHbf", 0, 0, 0, true));
		list.add(new Bahnhof("SalzburgHbf", 20, 60, 120, true));
		list.add(new Bahnhof("Amstetten", 40, 124, 169, false));
		list.add(new Bahnhof("Linz-Ost", 140, 320, 250, false));
		list.add(new Bahnhof("Huetteldorf", 3, 5, 19, false));
		list.add(new Bahnhof("Wels-Zentrum", 102, 400, 250, true));
		for (Bahnhof b : list)
			em.persist(b);
		em.flush();
		em.getTransaction().commit();
	}

	public static void task01() throws ParseException, InterruptedException {
	}

	public static <T> void task02() throws ParseException {
		Query q = entitymanager.createNamedQuery("Bahnhof.getAll");

		List<?> l = q.getResultList();

		for (Object b : l) {
			Bahnhof bhf = null;
			if (b instanceof Bahnhof) {
				bhf = (Bahnhof) b;
				System.out.println("Bahnhof: " + bhf.getName());
			}
		}
	}

	public static void task02a() throws ParseException {
	}

	public static void task02b() throws ParseException {
	}

	public static void task02c() throws ParseException {
	}

	public static void task03(EntityManager em) {
	}

	public static void validate(Object obj) {
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator();
		Set<ConstraintViolation<Object>> violations = validator.validate(obj);
		for (ConstraintViolation<Object> violation : violations) {
			log.error(violation.getMessage());
			System.out.println(violation.getMessage());
		}
	}
}
