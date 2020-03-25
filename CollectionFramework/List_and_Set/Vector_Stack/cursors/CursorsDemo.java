import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class CursorsDemo {
	public static void main(String[] args) {
		
		Vector v = new Vector();
		
		Enumeration e = v.elements();
		Iterator itr = v.iterator();
		ListIterator litr = v.listIterator();
		
		System.out.println(e.getClass().getName());
		System.out.println(itr.getClass().getName());
		System.out.println(litr.getClass().getName());
	}
	/*
		java.util.Vector$1			--> anonymous inner class
		java.util.Vector$Itr			--> class Itr in Vector class
		java.util.Vector$ListItr	--> ListIterator is an implementation
												 class of ListItr, an inner class
												 in Vector
												 
							Internal Implementation of Cursors					 
		We're not creating objects from interfaces.
		Inside of Vector class, there are inner classes that are 
		implemented.

	*/
}