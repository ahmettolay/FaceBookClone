package com.ahmet.rabbitmq.consumer;

import com.ahmet.rabbitmq.model.CreateUserModel;
import com.ahmet.service.UserProfileService;
import lombok.RequiredArgsConstructor;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CreateUserConsumer {

    private final UserProfileService userProfileService;
    @RabbitListener(queues = "auth-queue-create-user")
    public void createUserFromHandleQueue(CreateUserModel userModel){
        userProfileService.save(userModel);
        System.out.println("Kullanıcı Oluşturuldu.");
    }
}
