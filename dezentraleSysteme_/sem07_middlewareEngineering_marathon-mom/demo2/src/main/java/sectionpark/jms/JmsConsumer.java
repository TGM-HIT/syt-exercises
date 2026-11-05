package sectionpark.jms;

import sectionpark.model.TimingstationData;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.ObjectMessage;

@Component
@Slf4j
public class JmsConsumer implements MessageListener {


    @Override
    @JmsListener(destination = "${active-mq.topic}")
    public void onMessage(Message message) {
        try{
            ObjectMessage objectMessage = (ObjectMessage)message;
            TimingstationData timingstation = (TimingstationData)objectMessage.getObject();
            //do additional processing
            log.info("Received Message from Topic: "+ timingstation.toString());
        } catch(Exception e) {
            log.error("Received Exception while processing message: "+ e);
        }

    }
}
