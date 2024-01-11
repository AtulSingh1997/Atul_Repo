package com.nt.test;

public class Person {
	private String pname;
	private Integer rollno;
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public Integer getRollno() {
		return rollno;
	}
	public void setRollno(Integer rollno) {
		this.rollno = rollno;
	}
	public Person(String pname, Integer rollno) {
		super();
		this.pname = pname;
		this.rollno = rollno;
	}
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Person [pname=" + pname + ", rollno=" + rollno + "]";
	}
	

}
