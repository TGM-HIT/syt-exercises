package windpark.controller;

import windpark.jms.JmsProducer;
import windpark.model.WindengineData;
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

    @PostMapping(value="/api/windengine")
    public WindengineData sendMessage(@RequestBody WindengineData windengine) {
        jmsProducer.sendMessage(windengine);
        return windengine;
    }
}
