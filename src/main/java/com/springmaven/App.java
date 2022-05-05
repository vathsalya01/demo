package com.springmaven;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext con=new ClassPathXmlApplicationContext("config.xml");
        Student stud1=(Student) con.getBean("student1");
        Student stud2=(Student) con.getBean("student2");
        System.out.println(stud1);
        System.out.println(stud2);
    }
}
