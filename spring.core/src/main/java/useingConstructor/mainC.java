package useingConstructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class mainC 
{
	public static void main( String[] args )
    {
        ApplicationContext ac=new ClassPathXmlApplicationContext("useingConstructor/configCon.xml");
        Laptop laptop= ac.getBean(Laptop.class,"laptop");

     System.out.println(laptop.getName());
     System.out.println(laptop.getPrice());
     System.out.println(laptop.getProcessor());
     
     

    }

}
