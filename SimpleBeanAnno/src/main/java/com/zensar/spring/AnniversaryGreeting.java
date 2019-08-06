package com.zensar.spring;

import org.springframework.stereotype.Component;

@Component
("greeting")
public class AnniversaryGreeting implements Greeting {

	public String sayGreet() {
		// TODO Auto-generated method stub
		return "Happy Anniversary";
	}
public AnniversaryGreeting()
{
	System.out.println("AnniversaryGreeting created");
}
}
