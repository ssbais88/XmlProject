package com.app.sac;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext ac = new ClassPathXmlApplicationContext("com/app/sac/config.xml");
		Student s = (Student)ac.getBean("std");
		System.out.println(s);
		
		
	}

}
