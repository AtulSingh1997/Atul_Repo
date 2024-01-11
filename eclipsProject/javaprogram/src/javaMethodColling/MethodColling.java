package javaMethodColling;

public class MethodColling {
	void m1() {
		m2();//m2()method colling
		System.out.println("m1");
		m2();//m2()method colling
		
		}
	void m2() {
		m3(300);//m3()method colling
		System.out.println("m2");
		m3(100);//m3()method colling
	}
	void m3(int a) {
		System.out.println("m3");
		
	}
	public static void main(String[] args) {
		MethodColling  r= new MethodColling();
		r.m1();//m1 colling
	}

}/*
      In java one method is calling another method by using method name.
 one java method is able to call more than one method. But once the method is completed the
control returns to caller method.
m1() --->calling ---->m2() ----> calling ---> m3()
m1() <------- after completion-m2() <------after completion m3()
*/