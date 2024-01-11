package flowControl;

public class Star {
	public static void main(String[] args) {
		/*  > 1 > for (int i= 1; i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
				System.out.println(" ");
			
		}>2>
		for (int i=1;i<=5;i++) {
			for(int j=5;j>=i;j--) {
				System.out.print("*");
			}
			System.out.println(    "  ");
			
		}> #> 
		for (int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println( "  ");
		}> 4>
		int sum= 0;
		for(int i= 1;i<=1000; i++) {//sum of the n naturel num print
			sum= sum+i;
			
		}
		System.out.println(sum);*/
		int [] numbers= {10,20,39};//for each loop in side only one colen(:) complsery
		for(int number : numbers) {
			System.out.println(number);
		}
		
	}

}
