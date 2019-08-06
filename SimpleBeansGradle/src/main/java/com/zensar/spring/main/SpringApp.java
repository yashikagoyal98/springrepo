package com.zensar.spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zensar.spring.simple.FestivalGreeting;
import com.zensar.spring.simple.Greeting;

public interface SpringApp {
	public static void main(String[] args) {
		
	
	ApplicationContext ctx=new ClassPathXmlApplicationContext("Greetings.xml");
	Greeting g=ctx.getBean("greeting",FestivalGreeting.class);
	System.out.println(g.sayGreet());

	
	}
}
