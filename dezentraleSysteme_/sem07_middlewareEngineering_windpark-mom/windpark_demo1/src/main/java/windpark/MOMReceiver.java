package windpark;


import org.apache.activemq.ActiveMQConnection;
import org.apache.activemq.ActiveMQConnectionFactory;

import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.DeliveryMode;
import javax.jms.Destination;
import javax.jms.MessageConsumer;
import javax.jms.Session;
import javax.jms.TextMessage;

public class MOMReceiver {

  private static String user = ActiveMQConnection.DEFAULT_USER;
  private static String password = ActiveMQConnection.DEFAULT_PASSWORD;
  private static String url = ActiveMQConnection.DEFAULT_BROKER_URL;
  private static String subject = "windengine_001";
	
  public MOMReceiver() {
		
	  System.out.println( "Receiver started." );

	  // Create the connection.
	  Session session = null;
	  Connection connection = null;
	  MessageConsumer consumer = null;
	  Destination destination = null;
			
	  try {

		ConnectionFactory connectionFactory = new ActiveMQConnectionFactory(user, password, url);
		connection = connectionFactory.createConnection();
		connection.start();
	
		// Create the session
		session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
		destination = session.createTopic( subject );
			  
		// Create the consumer
		consumer = session.createConsumer( destination );
			
		// Start receiving
		TextMessage message = (TextMessage) consumer.receive();
		while ( message != null ) {
			System.out.println("Message received: " + message.getText() );
			message.acknowledge();
			message = (TextMessage) consumer.receive();
		}
		connection.stop();
	      
	  } catch (Exception e) {
	  	
	  	System.out.println("[MessageConsumer] Caught: " + e);
	  	e.printStackTrace();
	  	
	  } finally {
	  	
			try { consumer.close(); } catch ( Exception e ) {}
			try { session.close(); } catch ( Exception e ) {}
			try { connection.close(); } catch ( Exception e ) {}
			
	  }
	  System.out.println( "Receiver finished." );
      
  } // end main
	
}
