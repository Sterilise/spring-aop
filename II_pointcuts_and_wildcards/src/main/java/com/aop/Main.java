package com.aop;

import com.aop.service.ShapeService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {

    public static void main(String args[]) {

        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        ShapeService service = context.getBean("shapeService", ShapeService.class);
        System.out.println(service.getCircle().getName());
        System.out.println(service.getTriangle().getName());
    }
}
