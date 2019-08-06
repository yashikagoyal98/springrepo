package com.zensar.spring.performers;
/*Author: Yahika Goyal
Creation Date: 27 july 2019 4:26PM
Modified Date: 27 july 2019 4:26PM
Version: 1.0
Copyright: zensar Tchnologies.All rights preserved
Description: It is a performer juggler of zensar idol comp
juggler gets bean bags using constructor injection */
public class Juggler implements Performer {
 
	private int beanBags;
	
	public Juggler()
	{
		System.out.println("no-arg constructor");
	}
	
	public Juggler(int beanBags)
	{
		super();
		this.beanBags=beanBags;
		System.out.println("param constructor of juggler");
	}
	 public void perform()
	 {
		 System.out.println("juggler juggling" + beanBags );
	 }
}
