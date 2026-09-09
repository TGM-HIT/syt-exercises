package main.java.sectionpark;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class Application implements CommandLineRunner {

	@Autowired
	private SectionparkRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		repository.deleteAll();

		// save a couple of timing station data
		repository.save(new TimingstationData("1","1","2022-01-01 01:00:00", 20.0, "c"));
		repository.save(new TimingstationData("2","1","2022-01-02 02:00:00", 20.5, "c"));

		// fetch all customers
		System.out.println("Windengine data found with findAll():");
		System.out.println("-------------------------------");
		for (TimingstationData timingstationdata : repository.findAll()) {
			System.out.println(timingstationdata);
		}
		System.out.println();

		// fetch an individual customer
		System.out.println("Record(s) found with findByTimingstationID(\"1\"):");
		System.out.println("--------------------------------");
		System.out.println(repository.findByTimingstationID("1"));

		System.out.println("Record(s) found with findBySectionparkID(\"1\"):");
		System.out.println("--------------------------------");
		for (TimingstationData timingstationdata : repository.findBySectionparkID("1")) {
			System.out.println(timingstationdata);
		}

	}

}
