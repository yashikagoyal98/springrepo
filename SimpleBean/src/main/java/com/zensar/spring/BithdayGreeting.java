package com.zensar.spring;

/*Author: Yahika Goyal
Creation Date: 27 july 2019 12:51AM
Modified Date: 27 july 2019 12:51AM
Version: 1.0
Copyright: zensar Tchnologies.All rights preserved
Description: It is specialized greeting used to greet anybody on his/her Birthday */

public class BithdayGreeting implements Greeting {

	public BithdayGreeting()
	{
		System.out.println("Birthday Greeting created");
	}
	public String sayGreet() {
		// TODO Auto-generated method stub
		return "Wish you a very Happy Birthday";
	}

}
