package com.assign.concepts;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SessionFactory {

    DataSource dataSource;

    @Autowired
    public SessionFactory(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public void provideSession(){
        dataSource.getdata();
        System.out.println("Successfully provided the session from the data given");
    }
}
