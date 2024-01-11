package flowControl;

import java.util.Scanner;

public class DoWhileLoop {
   public static void main(String[] args) {
	   System.out.println("enter the any number");
	   Scanner sc = new Scanner (System.in);
	   int i= sc.nextInt();
	   do {
		   System.out.println("i am do loop");
		   i++;
	   }
	   while(i<=10);
	  // System.out.println("i am while loop");
		   
   }
    
}
   
/*  java do-while loop is called an exit control loop.
 *  Therefore, unlike while loop and for loop, 
 *  
 *  the do-while check the condition at the end of loop body.
 *   The Java do-while loop is executed at least once because 
 *   condition is checked after loop body.
 * 
 * Do-While:-
 If we want to execute the loop body at least one time
 them we should go for do-while statement.
 In do-while first body will be executed then only condition will be checked.
 In the do-while the while must be ends with semicolon otherwise compilation error.


Syntax:- do
{ //body of loop
} while (condition)



Syntax:

do{    
//code to be executed / loop body  
//update statement   
}while (condition);  */  