package com.assign;

import com.assign.concepts.ConfigClass;
import com.assign.concepts.EmailNotification;
import com.assign.concepts.NotificationController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

       // ApplicationContext container = new ClassPathXmlApplicationContext("config.xml");
        ApplicationContext container = new AnnotationConfigApplicationContext(ConfigClass.class);
        // Get the NotificationController bean
        NotificationController controller = container.getBean("notificationController", NotificationController.class);

        // Call the method
        controller.notifyUser("Hello this is a test message!");
    }
}
