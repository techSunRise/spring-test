package com.shq.entity;

import com.shq.app.Application;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = Application.class)
public class PersonTest {

    @Autowired
    private Person person;

    @Test
    public void sayHelloTest(){
        person.sayHello();
    }
}
