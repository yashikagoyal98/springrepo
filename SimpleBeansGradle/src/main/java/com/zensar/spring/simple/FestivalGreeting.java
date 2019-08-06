package com.zensar.spring.simple;

public class FestivalGreeting implements Greeting {
public FestivalGreeting()
{
	System.out.println("Festival Greeting created");
}

@Override
public String sayGreet() {
	// TODO Auto-generated method stub
	return "happy rakhi";
}

}
