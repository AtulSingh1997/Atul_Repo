package toStringMethod;

public class ToString {
	String name;
	int rolno;
	  ToString(String name, int rolno){
		  this .name= name;
		  this.rolno= rolno;
	  }
	 
		  public static void main(String [] args) {
			  ToString t= new ToString("Atul",101);
			  ToString t1= new ToString("ram",102);
			  System.out.println(t);
			  System.out.println(t1);
			  System.out.println(t.toString());
		  }
		  
	  }

/* we  cam use this method to get striing representation of an object 
 * whenever we are try to printn any object refrence internally to String () methodwill we excuted
 * if our class dose not  
contain any to String() then object class to String ()
 method will we excuted*/