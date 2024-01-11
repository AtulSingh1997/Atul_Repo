package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method st
		ApplicationContext con=new ClassPathXmlApplicationContext("com\nt\test\bean.xml");
		Person p=con.getBean("idt",Person.class);
		System.out.println(p);
		

	}

}
