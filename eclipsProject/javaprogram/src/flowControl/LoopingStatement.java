package flowControl;
import java.util.Scanner;
public class LoopingStatement {
	public static void main(String[] args) {
		int n= 10;
		System.out.println("Enter the any number");
		Scanner sc= new Scanner(System.in);
		int a= sc.nextInt();
		/*for (int i=0;i<=a;i++ ) {
			System.out.println(i);
		}*/
		/*for(int i=1;i<=n;i++) {
			System.out.println(a*i);
		}Nested for loop > =
		         If we have a for loop inside the another loop, it is known as nested for loop
		 * .      The inner loop executes completely whenever outer loop executes.
		 */
		for (int i= 1;i<=10;i++) {
			for(int j= 1; j<= 10;j++) {
				System.out.println(i +" "+j);
			}
				
		}
	}

}
/* 1  Initialization: > It is the initial condition which is
      executed once when the loop starts. Here, we can initialize the variable, 
      or we can use an already initialized variable. It is an optional condition.
 
2    Condition:  > It is the second condition which is executed each time 
     to test the condition of the loop. It continues execution until
     the condition is false. It must return boolean value either true or false.
     It is an optional condition.
  
3    Increment/Decrement: >  It increments or decrements
     the variable value. It is an optional condition.
 
4    Statement: >  The statement of the loop is executed each time until
     the second condition is false.
     Syntax:

    for(initialization; condition; increment/decrement){    
        //statement or code to be executed    
}    */