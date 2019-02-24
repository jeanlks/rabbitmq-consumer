package com.consumer.rabbitconsumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class MessageListener {

    private static final Logger log = LoggerFactory.getLogger(MessageListener.class);


    @RabbitListener(queues = "test")
    public void receiveMessage(CustomMessage message) {
        log.info("Received message: {}", message.getText());
    }

}
