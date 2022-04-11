package com.construct;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class mainconstruct {
	public static void main( String[] args )
    {

    ApplicationContext context=new ClassPathXmlApplicationContext("com/construct/configconstruct.xml");
    Laptop laptop=(Laptop)context.getBean(Laptop.class,"laptop");
    

    
    System.out.println(laptop);
   

    }
}
