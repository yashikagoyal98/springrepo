package com.zensar.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
Hello world*/

public class SpringApp {
public static void main(String [] args)
{
	ApplicationContext ctx=new ClassPathXmlApplicationContext("greetings.xml");
    Greeting g1=ctx.getBean("birthday", Greeting.class); // obtaining readymade object from spring IOC container
    System.out.println(g1.sayGreet()); // invoking business logic method
    
    Greeting g2=ctx.getBean("holi", Greeting.class); // obtaining readymade object from spring IOC container
    System.out.println(g2.sayGreet()); // invoking business logic method

    Greeting g3=ctx.getBean("birthday", Greeting.class); // obtaining readymade object from spring IOC container
		/*
		 * System.out.println(g1.sayGreet()); // invoking business logic method
		 */    
}
}
