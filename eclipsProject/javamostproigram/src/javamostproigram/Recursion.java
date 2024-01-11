package javamostproigram;

public class Recursion {
	 static void recursive(int a)
	{ 
		 System.out.println("number is :- "+a);
	if (a==1)
	{return;
	}
	recursive(--a); //same method is calling [recursion]
	}
	public static void main(String[] args)
	{ 
		//Recursion r= new Recursion();
		//r.recursive(10);
		Recursion.recursive(10);
	
	}

}
