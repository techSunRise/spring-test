package com.shq.app;

import com.shq.entity.Person;
import com.shq.entity.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;


@ComponentScan(value = {"com.shq.entity"})
@Configuration
public class Application {

    public static void main(String[] args){
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Application.class);
        for(int i = 0 ; i < 10 ; i++){
            Person person = (Person) applicationContext.getBean("person");
            person.testAnnotation();
        }
    }

}
