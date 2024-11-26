package com.assign;

import com.assign.concepts.UserController;
import com.assign.concepts.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        System.out.println( "Hello World!" );
        //Creating container through applicationcontex
        ApplicationContext container = new ClassPathXmlApplicationContext("config.xml");

        UserService userService1 = container.getBean("userService1", UserService.class);
        userService1.Coding();

        System.out.println("-----------------------");
        UserController userController = container.getBean("userController", UserController.class);
        userController.control();
    }
}
