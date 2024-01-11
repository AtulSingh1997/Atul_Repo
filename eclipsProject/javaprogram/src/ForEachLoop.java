
public class ForEachLoop {
	public static void main(String[] args) {
		int[] a={10,20,30,40};
		//printing data by uisng for-loop
		for (int i=0;i<a.length;i++)
		{ System.out.println(a[i]);
		}
		//printing data by using for-each lopp
		for (int aa: a)
		{
			System.out.println(aa);
		}

	}
	/*
	 * For-each loop:- (introduced in 1.5 version)
 For loop is used to print the data & it is possible to apply conditions.
 For-each loop is used to print the data but it is not possible to apply the conditions. To print the data
starting element to ending element without conditions use for-each loop.

	 * 
	 * 
	 * Iterator vs Iterable:-
 The target elements in for-each loop should be iterable. And it is interface present in java.lang
package.
 If an object is iterable that class should implements Iterable interface.
 Iterator is cursor we will discussed in Collections framework. 
	 */

}
