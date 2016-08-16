package com.springinaction.springidol;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestClass {
    public static void main(String[] args) throws Exception{
        //ApplicationContext ctx = new ClassPathXmlApplicationContext("com/springinaction/springidol/spring-idol.xml");
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-idol.xml");

//        Performer performer = (Performer)ctx.getBean("duke");
//        performer.perform();
//
//        Performer performerUsingConstructor = (Performer)ctx.getBean("dukeUsingConstructor");
//        performerUsingConstructor.perform();
//
//        Performer performerPoeticDuke = (Performer)ctx.getBean("poeticDuke");
//        performerPoeticDuke.perform();

//        Performer kenny = (Performer)ctx.getBean("kenny");
//        kenny.perform();

//        Performer kennyPspace = (Performer)ctx.getBean("kennyPspace");
//        kennyPspace.perform();

//        Performer hankVone = (Performer)ctx.getBean("hankVone");
//        hankVone.perform();

//        Performer hankVTwo = (Performer)ctx.getBean("hankVTwo");
//        hankVTwo.perform();

        Performer hankVThree = (Performer)ctx.getBean("hankVThree");
        hankVThree.perform();
    }
}
