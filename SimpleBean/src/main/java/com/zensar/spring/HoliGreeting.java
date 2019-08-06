package com.zensar.spring;

/*Author: Yahika Goyal
Creation Date: 27 july 2019 12:56AM
Modified Date: 27 july 2019 12:56AM
Version: 1.0
Copyright: zensar Tchnologies.All rights preserved
Description: It is specialized greeting used to greet anybody on Holi */
public class HoliGreeting implements Greeting{

	public String sayGreet()
	{
		return "Happy Holi may your life full of colors";
	}
	public HoliGreeting()
	{
		System.out.println("HoliGreeting created");
	}
}
