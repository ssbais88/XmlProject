package com.app.life;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext ac =new  ClassPathXmlApplicationContext("com/app/life/config.xml");
		Cat c = (Cat)ac.getBean("cObj");
		System.out.println(c);
//		ac.registerShutdownHook();
		ac.close();
		
	}

}
