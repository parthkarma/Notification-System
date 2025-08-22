package api.com.notificationsystem.ProducerService;

import api.com.notificationsystem.RabbitMQConfig.RabbitConfig;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NotificationProducer {
 @Autowired
 private RabbitTemplate rabbitTemplate;
 public void sendNotification(String message) {
  rabbitTemplate.convertAndSend(RabbitConfig.EXCHANGE, RabbitConfig.ROUTING_KEY, message);
  System.out.println("Sent: " + message);
 }
}
