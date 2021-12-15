package com.shq.entity;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@PropertySource("classpath:person.properties")
//@Scope("prototype")
@Controller
public class Person {

    @Value("${person.name}")
    private String name;

    private static int st = 0;

    private int index = 0;

    public void sayHello(){
        System.out.println("i am a person, my name is " + name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void testAnnotation(){
        st++;
        index++;
        System.out.println("no static "+index);
        System.out.println("static "+st);
    }
}
