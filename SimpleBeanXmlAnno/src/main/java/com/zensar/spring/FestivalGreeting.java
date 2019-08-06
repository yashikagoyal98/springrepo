package com.zensar.spring;

import org.springframework.stereotype.Component;

@Component
("fGreeting")
public class FestivalGreeting implements Greeting {

	
	public FestivalGreeting()
	{
		System.out.println("greeting created");
	}
	public String sayGreet() {
		// TODO Auto-generated method stub
		return "Happy Holi";
	}
}
