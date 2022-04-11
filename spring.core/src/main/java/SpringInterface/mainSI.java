package SpringInterface;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class mainSI {
	public static void main(String[] args)
	{
		AbstractApplicationContext context= new ClassPathXmlApplicationContext("SpringInterface/configSinterface.xml");
        context.registerShutdownHook();
		Studentt studentt=(Studentt)context.getBean("studentt");
		System.out.println(studentt);
	}


}
