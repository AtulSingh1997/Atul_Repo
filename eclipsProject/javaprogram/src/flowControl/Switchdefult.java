package flowControl;

public class Switchdefult {
	public static void main(String[] args) {
		int x = 0;
		switch(x) {
		default:
			System.out.println("default");
		case 0:
			System.out.println("0");
			break;
		case 1:
			System.out.println("1");
			//break;
		case 2:
			System.out.println("2");
			//break;
		}
	}

}
/*switch is a multipul choise decision making selectio statement  it is used 
 *  when we went to select only one case out ofmultiple chose
    Inside the switch statement beak is optional.
 If we are not providing break statement then from the matched case onwards up to break
statement will be executed, if there is no break statement then end of the switch will be
executed. This situation is called as fall though inside the switch case
 */