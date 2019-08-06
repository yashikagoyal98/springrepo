package com.zensar.spring.performers;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import com.zensar.spring.instruments.Instrument;

public class Instrumentalist implements Performer,BeanNameAware,BeanFactoryAware,ApplicationContextAware,InitializingBean,DisposableBean {

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
 
		System.out.println("instrumentalist" +beanName+"is playing" );
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
