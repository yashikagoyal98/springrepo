package com.zensar.spring.performers;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/*Author: Yahika Goyal
Creation Date: 29 july 2019 2:33PM
Modified Date: 29 july 2019 2:33PM
Version: 1.0
Copyright: zensar Tchnologies.All rights preserved
Description: it is used to represent instrumentalist of zensar idol competition
it also shows bean life cycle in spring framework.
 */
import com.zensar.spring.instruments.Instrument;

public class Instrumentalist implements Performer {

	private String song;
	private Instrument instrument;
	
	
	
	  //for setter injection
	public void setSong(String song) { 
		this.song = song;
	  System.out.println("song is set");
	  }
	 
	  // for setter injection
	public void setInstrument(Instrument instrument) {
	  this.instrument = instrument; System.out.println("instrument is set"); }
	

	//business logic of Instrumentalist
	public void perform() {
		// TODO Auto-generated method stub
 
		System.out.println("instrumentalist is playing");
		instrument.play();
	}

}
