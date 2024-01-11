package com.nt.test;

import java.applet.AppletContext;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.client.Person;

public class Test {
	public static <ApplicationContext> void main(String[] args) {
		ApplicationContext ac = new AnnotationConfigApplicationContext(MyAppConfig.class);
		Person ee = ac.getBean("per", Person.class);
		System.out.println(ee);
	}

}
