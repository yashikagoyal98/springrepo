package com.zensar.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class GreetingApp 
{
    public static void main( String[] args )
    {
    	ApplicationContext ctx=new ClassPathXmlApplicationContext("greetings.xml");
		/* Greeting fg= ctx.getBean("festivalGreeting",Greeting.class); */
    	Greeting fg= ctx.getBean("fGreeting",Greeting.class);
    	System.out.println(fg.sayGreet());
    	
    	
    
    
    }
}
