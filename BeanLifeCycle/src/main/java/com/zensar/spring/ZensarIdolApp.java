  package com.zensar.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zensar.spring.performers.Performer;

/**
 * Hello world!
 *
 */
public class ZensarIdolApp 
{
    public static void main( String[] args )
    {
    	ApplicationContext ctx=new ClassPathXmlApplicationContext("performers.xml");
    	Performer p=ctx.getBean("Tina J",Performer.class);
    			p.perform();
    			ConfigurableApplicationContext cfgCtx=(ConfigurableApplicationContext) ctx;
    			
    			cfgCtx.close(); //shutting down spring Ioc container
    }
}
