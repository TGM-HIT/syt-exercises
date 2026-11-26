package sectionpark.controller;

import sectionpark.jms.JmsProducer;
import sectionpark.model.TimingstationData;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class ProduceMessageController {

    @Autowired
    JmsProducer jmsProducer;

    @PostMapping(value="/api/timingstation")
    public TimingstationData sendMessage(@RequestBody TimingstationData timingstation) {
        jmsProducer.sendMessage(timingstation);
        return timingstation;
    }
}
