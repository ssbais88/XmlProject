package com.app.externalizasion;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ac = new ClassPathXmlApplicationContext("com/app/externalizasion/config.xml");
		DbConfig db = (DbConfig)ac.getBean("dbObj");
		System.out.println(db);
	}

}
