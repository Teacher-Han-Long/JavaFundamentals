import java.util.*;

public class EnumerationDemo {
/*
	Get Objects from a Collection one by one- cursor concept
	There are 3 cursors
	--------------------------
	1. Enumeration
	2. Iterator
	3. ListIterator
*/
/*
	Enumeration
	-----------------
	Get elements one by one from Legacy Collection Object
	-We create an Enumeration object with 
	  elements() method of Vector class
	
	ONLY 2 methods for Enumeration
	-------------------------------------------
	1 public boolean hasMoreElements();
	2 public Object nextElement();
	
*/
	public static void main(String[] args) {
	
		Vector v = new Vector();
		for (int i = 0; i <= 10; i++) {
			v.addElement(i);
		}
		
		System.out.println(v);   
		//System.out.println(v.elements());   
		Enumeration e = v.elements();
		
		//EXPECTED: should also print the even numbers 1 by 1 on new line
		while (e.hasMoreElements()) {
			Integer I = (Integer)e.nextElement();
			if (I % 2 == 0) {
				System.out.println(I);
			} else {
				System.out.println(I + " will be removed");
				v.remove(I);
				System.out.println(v);
			}
		}
		
		
	}
	

}
