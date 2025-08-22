package api.com.notificationsystem.ControllerService;

import api.com.notificationsystem.ProducerService.NotificationProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/notify")
public class NotificationController {

 @Autowired
 private NotificationProducer producer;

 @GetMapping("/{msg}")
 public String send(@PathVariable String msg) {
  producer.sendNotification(msg);
  return "Notification sent: " + msg;


 }
}
