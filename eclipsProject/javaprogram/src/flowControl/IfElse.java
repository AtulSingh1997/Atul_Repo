package flowControl;
import java.util.Scanner;
public class IfElse {
	public static void main(String[] args) {
		int a;
		System.out.println("Enter the any number");
		Scanner sc= new Scanner(System.in);
		a= sc.nextInt();
		if(a>=9) {
			if(a>=18) {
			System.out.println("it is a rahul");
			}
			else {
				System.out.println("hello");
			}
		}
		else
		{
		System.out.println("thanku");
		}
		System.out.println("thank you");
		
	}

}
/*the curly bbrases are options but whitout curly brases it 
 * is posible to take only one statement  that shuld not be a initialization
 * */
