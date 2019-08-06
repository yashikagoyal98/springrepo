  package com.zensar.spring;
  /*Author: Yahika Goyal
  Creation Date: 29 july 2019 3:44PM
  Modified Date: 29 july 2019 3:44PM
  Version: 1.0
  Copyright: zensar Tchnologies.All rights preserved
  Description: It is a performer juggler of zensar idol comp
  juggler gets bean bags using constructor injection */

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
    			System.out.println();
    			p=ctx.getBean("Meena",Performer.class);
    			p.perform();
    			System.out.println();
    			p=ctx.getBean("Geeta",Performer.class);
    			p.perform();
    			System.out.println();
    			p=ctx.getBean("Geeta",Performer.class);
    			p.perform();
    			
    			
    			ConfigurableApplicationContext cfgCtx=(ConfigurableApplicationContext) ctx;
    			
    			cfgCtx.close(); //shutting down spring Ioc container
    }
}
