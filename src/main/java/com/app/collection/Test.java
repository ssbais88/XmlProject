package com.app.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext ac = new  ClassPathXmlApplicationContext("com/app/collection/config.xml");
		Student s = (Student)ac.getBean("sObj");
		System.out.println(s);

	}

}
