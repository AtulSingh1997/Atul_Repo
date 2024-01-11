package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method st
		ApplicationContext con=new FileSystemXmlApplicationContext("bean.xml");
		Person p=con.getBean("idt",Person.class);
		System.out.println(p);
		

	}

}
