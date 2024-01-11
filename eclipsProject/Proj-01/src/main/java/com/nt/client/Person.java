package com.nt.client;

public class Person {
	private String name;
	private Integer rollno;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getRollno() {
		return rollno;
	}
	public void setRollno(Integer rollno) {
		this.rollno = rollno;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", rollno=" + rollno + "]";
	}
	public Person(String name, Integer rollno) {
		super();
		this.name = name;
		this.rollno = rollno;
	}
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
