package com.zensar.spring.performers;
/*Author: Yahika Goyal
Creation Date: 27 july 2019 4:18PM
Modified Date: 27 july 2019 4:18PM
Version: 1.0
Copyright: zensar Tchnologies.All rights preserved
Description: More skilled jugglers who juggles while reciting a poem
poem is injected into poeticjuggler using constructor injection
 */
import com.zensar.spring.poems.Poems;
public class poeticJuggler extends Juggler {
//dependency object
	private Poems poem;
 public poeticJuggler()
 {
	 System.out.println("No-arg constructor of poetic juggler");
 }
public poeticJuggler(int beanBags, Poems poem) {
	super(beanBags);
	this.poem = poem;
	System.out.println("param constructor of poeticJuggler");
}
@Override
public void perform() {
	// TODO Auto-generated method stub
	super.perform();
	System.out.println("while reciting a poem...");
	poem.recite();
}

}
