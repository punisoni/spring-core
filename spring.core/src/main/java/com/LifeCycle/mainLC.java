package com.LifeCycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class mainLC 
{
	public static void main( String[] args )
    {
        AbstractApplicationContext context=new ClassPathXmlApplicationContext("com/LifeCycle/configLife.xml");
        context.registerShutdownHook();
        Student student=(Student)context.getBean("student");
        
        System.out.println(student.getStudentid());
        System.out.println(student.getStudentname());
        System.out.println(student.getEducation());

   
    }
}