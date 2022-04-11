package com.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class maincollection {

    public static void main( String[] args )
    {

    ApplicationContext context=new ClassPathXmlApplicationContext("com/collection/configcollection.xml");
    Employee employee=(Employee)context.getBean(Employee.class,"employee");
    
    
    System.out.println(employee.getEmpId());

    System.out.println(employee.getHobbies());

    System.out.println(employee.getContacts());

    System.out.println(employee.getMobile());
    
    System.out.println(employee.getAddress());
    
    
    }
}
