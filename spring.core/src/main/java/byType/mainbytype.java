package byType;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class mainbytype 
{
	public static void main( String[] args )
    {
        ApplicationContext ac=new ClassPathXmlApplicationContext("byType/configbyt.xml");
        Emp emp=ac.getBean(Emp.class,"Emp");
        System.out.println(emp.getEid());
        System.out.println(emp.getName());
        System.out.println(emp.getProject());

    }
}
