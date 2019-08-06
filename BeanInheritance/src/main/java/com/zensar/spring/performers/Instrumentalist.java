package com.zensar.spring.performers;

/*Author: Yahika Goyal
Creation Date: 29 july 2019 3:44PM
Modified Date: 29 july 2019 3:44PM
Version: 1.0
Copyright: zensar Tchnologies.All rights preserved
Description: It is a performer juggler of zensar idol comp
juggler gets bean bags using constructor injection */

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import com.zensar.spring.instruments.Instrument;

public class Instrumentalist implements Performer,BeanNameAware {

	private String song;
	private Instrument instrument;
	private String beanName;
	
	//for setter injection
	public void setSong(String song) {
		this.song = song;
		System.out.println("song is set");
	}

	// for setter injection
	public void setInstrument(Instrument instrument) {
		this.instrument = instrument;
		System.out.println("instrument is set");
	}

	//business logic of Instrumentalist
	public void perform() {
		// TODO Auto-generated method stub
 
		System.out.println("instrumentalist" +beanName+ "is playing" +song );
		instrument.play();
	}
	public void setBeanName(String arg0)
	{
		this.beanName=arg0;
		System.out.println("bean name is set");
	}
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("spring core Ioc container BeanFactory is set");
	}

	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("spring specialize Ioc container ApplicationContext is set");
	}

	public void afterPropertiesSet() throws Exception
	{
		instrument.tune();
		System.out.println("afterPreopertiesSet is called");
	}
	
	
	  public void tuneInstrument() { instrument.tune();
	  System.out.println("custom init method"); }
	 
	public void destroy() throws Exception
	
	{
		System.out.println("destroy method is called");
	}
	public void cleanInstrument()
	{
		instrument.clean();
		System.out.println("custom destroy method");
	}
	

}
