package com.app.reference;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext ac = new ClassPathXmlApplicationContext("com/app/reference/config.xml");
		Employee e = (Employee)ac.getBean("eObj");
		System.out.println(e);
		
	}

}
