package main.java.windpark;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application implements CommandLineRunner {

	@Autowired
	private WindparkRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		repository.deleteAll();

		// save a couple of windengine data
		//public WindengineData(String windengineID, String windparkID, String timestamp, double windspeed,
//		double temperature, double power, double blindpower, double rotationspeed, double bladeposition)
		repository.save(new WindengineData("1","1","2019-01-01 00:00:00",1.0, 1.0, 1.0, 1.0, 1.0, 1.0));
		repository.save(new WindengineData("2","1","2019-01-02 00:00:00",1.5, 1.5, 1.5, 1.5, 1.5, 1.5));

		// fetch all customers
		System.out.println("Windengine data found with findAll():");
		System.out.println("-------------------------------");
		for (WindengineData windenginedata : repository.findAll()) {
			System.out.println(windenginedata);
		}
		System.out.println();

		// fetch an individual customer
		System.out.println("Customer found with findByWindengineID(\"1\"):");
		System.out.println("--------------------------------");
		System.out.println(repository.findByWindengineID("1"));

		System.out.println("Customers found with findByWindparkID(\"1\"):");
		System.out.println("--------------------------------");
		for (WindengineData windenginedata : repository.findByWindparkID("1")) {
			System.out.println(windenginedata);
		}

	}

}
