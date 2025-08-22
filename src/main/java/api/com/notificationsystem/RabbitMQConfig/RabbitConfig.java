package api.com.notificationsystem.RabbitMQConfig;

import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.Binding;
@Configuration
public class RabbitConfig {

 public static final String QUEUE = "notificationQueue";
 public static final String EXCHANGE = "notificationExchange";
 public static final String ROUTING_KEY = "notificationRoutingKey";

 @Bean
 public Queue queue() {
//A queue is a storage area in RabbitMQ that holds messages until a consumer retrieves them.
return new Queue(QUEUE);
 }
 @Bean
 public Binding binding(Queue queue, DirectExchange exchange) {
  //A binding is the link between a queue and an exchange in RabbitMQ.
  return BindingBuilder.bind(queue).to(exchange).with(ROUTING_KEY);
 }

 @Bean
 public DirectExchange exchange() {
  //An Exchange receives messages from the producer and decides which queue(s) should get the message.
  return new DirectExchange(EXCHANGE);
 }


}
