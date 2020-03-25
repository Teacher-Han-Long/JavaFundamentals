import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.RandomAccess;


public class ArrList2 {
	
	/*
		We can use Collection to hold and transfer Objects from one location 
		to another. (CONTAINER) To provide support for this:
		
		Every Collection class implements Serializable / Clonable
		
		Serializable(I)
		By default EVERY COLLECTION CLASS implements
		Serializable()
		
		If something goes wrong with operations on object:
		We can perform any operation on a duplicate object and recover inital obj.
		
		Clonable(I) : to provide support for this, EVERY COLLECTION CLASS 
		implements Clonable (I)
		--------------------------------------------------------------------------------------------
		
		ArrayList / Vector - ONLY
		-----------------------
		RandomAccess(I) : We can access any random element with the same speed
		Only these 2 classes implement RandomAccess(I)
		java.util package
		No methods
		Marker interface
	*/
	public static void main(String[] args) {
		
		ArrayList l1 = new ArrayList();
		LinkedList l2 = new LinkedList();
		/*
		System.out.println(l1 instanceof Serializable); 		true
		System.out.println(l2 instanceof Clonable);	 		true
		System.out.println(l1 instanceof RandomAccess);	true
		System.out.println(l2 instanceof RandomAccess);	false
		*/
		
		System.out.println(l1 instanceof RandomAccess);
		
		
	}
	
	
}