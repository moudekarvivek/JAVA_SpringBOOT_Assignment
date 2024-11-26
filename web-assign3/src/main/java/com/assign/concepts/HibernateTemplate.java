package com.assign.concepts;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class HibernateTemplate {
    SessionFactory sessionFactory;
    @Autowired
    public HibernateTemplate(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public void getHibernateTemplate(){
        sessionFactory.provideSession();
        System.out.println("Sucessfully created the template");
    }
}
