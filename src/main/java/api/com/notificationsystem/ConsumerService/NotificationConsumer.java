package api.com.notificationsystem.ConsumerService;

import api.com.notificationsystem.RabbitMQConfig.RabbitConfig;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class NotificationConsumer {

 @RabbitListener(queues = RabbitConfig.QUEUE)
 public void receiveNotification(String message) {
  System.out.println("Received: " + message);
 }
}

