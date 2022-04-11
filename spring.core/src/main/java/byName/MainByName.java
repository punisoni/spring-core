package byName;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainByName 
{
	public static void main(String[] args)
	{
		ApplicationContext ac= new ClassPathXmlApplicationContext("byName/configbyname.xml");
		Person p=(Person)ac.getBean("person");
		System.out.println(p);
	}

}
