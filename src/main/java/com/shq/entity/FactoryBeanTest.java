package com.shq.entity;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

@Component
public class FactoryBeanTest implements FactoryBean<Student> {

    public Student getObject() throws Exception {
        Student ss = new Student();
        ss.setScore("i am from factory bean");
        return ss;
    }

    public Class<?> getObjectType() {
        return Student.class;
    }
}
