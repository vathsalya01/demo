package com.springcore.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClassTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext con=new ClassPathXmlApplicationContext("com/springcore/collections/classconfig.xml");
		ClassA a=(ClassA)con.getBean("aref");
		
		System.out.println(a.getX());
		
		System.out.println(a.getObj().getY());
		
		System.out.println(a);
		

	}

}
