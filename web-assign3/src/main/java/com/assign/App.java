package com.assign;

import com.assign.concepts.ConfigClass;
import com.assign.concepts.DataSource;
import com.assign.concepts.HibernateTemplate;
import com.assign.concepts.SessionFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext container = new AnnotationConfigApplicationContext(ConfigClass.class);

        DataSource source=container.getBean("dataSource", DataSource.class);
        source.getdata();
        System.out.println("---------------------------");

        SessionFactory session = container.getBean("sessionFactory", SessionFactory.class);
        session.provideSession();
        System.out.println("----------------------------");

        HibernateTemplate hiber = container.getBean("hibernateTemplate", HibernateTemplate.class);
        hiber.getHibernateTemplate();
    }
}
