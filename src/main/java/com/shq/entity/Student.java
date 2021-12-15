package com.shq.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;

public class Student {

    private String score;

    @Autowired
    private Person person;

    public void sayHello(){
        System.out.println("i am student, my name is " + person.getName());
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }
}
