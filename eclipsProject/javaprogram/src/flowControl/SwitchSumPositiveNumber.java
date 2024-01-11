package flowControl;

import java.util.Scanner;

public class SwitchSumPositiveNumber {
	public static void main(String[] args) {
		int sum = 0;
		System.out.println("Enter the any number");
		Scanner sc= new Scanner (System.in);
		int a= sc.nextInt();
		while( a>=0) {
			sum+= a;
		
			System.out.println("enter the number");
			a= sc.nextInt();
			
			
		}
		System.out.println(sum);
		
		
	}

}
