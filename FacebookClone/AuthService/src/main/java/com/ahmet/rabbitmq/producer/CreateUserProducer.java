package com.ahmet.rabbitmq.producer;

import com.ahmet.rabbitmq.model.CreateUserModel;
import lombok.RequiredArgsConstructor;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CreateUserProducer {

    private final RabbitTemplate rabbitTemplate;

    public void converAndSendData(CreateUserModel model){
        rabbitTemplate.convertAndSend("auht-exchange",
                "auth-routing-key-create-user", model);
    }
}
