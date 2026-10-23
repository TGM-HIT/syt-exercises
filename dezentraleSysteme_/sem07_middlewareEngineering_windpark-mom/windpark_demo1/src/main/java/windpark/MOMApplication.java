package windpark;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.CommandLineRunner;


import org.apache.activemq.ActiveMQConnection;
import org.apache.activemq.ActiveMQConnectionFactory;

import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.Destination;
import javax.jms.MessageConsumer;
import javax.jms.Session;
import javax.jms.TextMessage;
import javax.lang.model.util.ElementScanner6;

@SpringBootApplication
public class MOMApplication implements CommandLineRunner  {

	public static void main(String[] args) {
		SpringApplication.run(MOMApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {

		String flag = new String("receiver");
		for(String arg:args) {
			flag = arg;
		}
		
		if ( flag.toLowerCase().equals("sender") )
			new MOMSender();
		else
			new MOMReceiver();

	}

}
