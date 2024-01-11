package flowControl;

import java.util.Scanner;

public class WhileLoop {
	public static void main(String[] args) {
		int a= 40;
	System.out.println("it is while loop");
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the any number");
	int b= sc.nextInt();
	while(b>=a) {
		System.out.println("ram is good friend");
		break;//it is code terminate this loop  because it is not termenated loop then code enfinntive time exequte
	}
	System.out.println("loop is desmis"); {
		
	}
	}

}/*Whil loop > = In computer programming, loops are used to repeat a block of code. 
For example, if you want to show a message 100 times, then you can use a loop. 
 > Java while loop is used to run a specific code until a certain condition is met.
The syntax of the while loop is:

while (testExpression) {
    // body of loop
}
*/
