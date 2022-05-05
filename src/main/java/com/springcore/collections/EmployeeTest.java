package com.springcore.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeTest {

	public static void main(String[] args) {
		ApplicationContext con=new ClassPathXmlApplicationContext("com/springcore/collections/employeeconfig.xml");
		Employee emp1=(Employee)con.getBean("emp");
		System.out.println(emp1.getEname());
		System.out.println(emp1.getEaddress());
		System.out.println(emp1.getEphones());
		System.out.println(emp1.getEcourse());
	}

}
