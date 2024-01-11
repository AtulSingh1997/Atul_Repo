package flowControl;
import java.util.Scanner;
public class Switch22 {
	public static void main(String[] args) {
		System.out.println("enter the chose");
		Scanner sc= new Scanner(System.in);
		int ch= sc.nextInt();
		System.out.println("Enter the first number");
		int a= sc.nextInt();
		System.out.println("Enter the secund number");
		int b= sc.nextInt();
		switch(ch) {
		case 1:
			System.out.println("sum"+(a+b));
			break;
		case 2:
			System.out.println("manus"+(a-b));
			break;
		case 3:
			System.out.println("multi"+(a*b));
			break;
		default:
			System.out.println("chose mis mache");
		}
	}

}
/*
Switch statemt is used to declare multiple sellections
switch iss tacking  the argument the allowed argument are 
byte ,short ,int,char,
      and
Byte ,Short,Integer,Character,enum(1.5 version).abstract
String(1.7 version).abstract
Inside the switch it is possible to declare more
 than one case but it is possible to declare only one
default.
 Based on the provided argument the matched case will
 be executed if the cases are not matched
default will be executed.
 While declaring switch statement braces
 are mandatory otherwise compiler will generate error
message.
Note : Float and double and long is not allowed for 
a switch argument because these are having too large value 
*/