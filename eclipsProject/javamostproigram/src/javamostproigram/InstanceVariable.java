package javamostproigram;

public class InstanceVariable {
	//instance variables
	int val1;
	int val2;
	void values(int val1,int val2)//local variables
	{ System.out.println(val1);
	System.out.println(val2);
	//conversion of local to instance (passing local variables values to instance variables)
	this.val1=val1;
	this.val2=val2;
	}
	void add()
	{ System.out.println(val1+val2);
	}
	void mul()
	{ System.out.println(val1*val2);
	}
	public static void main(String[] args)
	{ 
		InstanceVariable  t = new InstanceVariable ();
	t.values(10,20);
	t.add();
	t.mul();
	
	}

}
