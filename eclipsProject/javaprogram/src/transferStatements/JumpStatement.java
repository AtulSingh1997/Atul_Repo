package transferStatements;

public class JumpStatement {
	public static void main(String[] args) {
		for(int i= 1; i<10;i++) {
			if(i==5)
				break;
			System.out.println(i);
		}
	}

}/*
By using transfer statements we are able to transfer the flow of execution from one position to
another position.

o break
o continue
o return

break:-
Break is used to stop the execution. And is possible to use the break statement only two areas.
a. Inside the switch statement.
b. Inside the loops.
Example-1 :- break means stop the execution come out of loop
