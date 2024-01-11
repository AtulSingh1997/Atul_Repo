package java8fecher;

import java.util.function.Predicate;

public class Lamda {
	public static void m1( int a) {
		System.out.println(20);
	}
	public static void main(String[] args) {
		
	Predicate<Integer> p= i-> i%2==0;
	//System.out.println(p.equals(p.test(10)));
	System.out.println(p.test(12));
			
		
	}

}
