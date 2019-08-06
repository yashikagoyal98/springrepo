package com.zensar.spring;

import org.springframework.context.ApplicationContext;
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
    	ApplicationContext ctx=new ClassPathXmlApplicationContext("performer.xml");
   Performer p=ctx.getBean("Yashika", Performer.class);
   p.perform();
   
   System.out.println();
   Performer p1=ctx.getBean("Reema Mishra", Performer.class);
   p1.perform();
    }
}
