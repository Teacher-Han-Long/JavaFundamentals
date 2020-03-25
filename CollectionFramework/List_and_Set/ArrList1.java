import java.util.ArrayList;
import java.util.List;

public class ArrList {
	/*
	List(I)
	---------------
	ArrayList
	LinkedList
	Vector
	Stack
	
	ArrayList:
		1. The underlying data structure -  Resizable Array / Growable Array
		2. Duplicates allowed
		3. Insertion order preserved
		4. Heterogeneous objects OK 
			(only not allowed in TreeSet and TreeMap)- sorting involves comparing
			Comparing objects must be of same type.
		5. null insertion - OK   l.add(null)
    */
	public static void main(String[] args) {
		
		ArrayList l = new ArrayList();
		l.add("What");
		l.add("rudoingthat");
		l.add(4);
		l.add(null);
		
		System.out.println(l);
		l.remove(1);
		System.out.println(l);
		l.add(1, "theheck ");
		l.add("happened?");
		System.out.println(l);
		System.out.println();
		// l is an object reference - toString method() will be called
		// Collection objects prints out in brackets []
		// Map objects print out in these {}
		// 1.5 onwards, we should us Collection with Generics
			// ArrayList<String> al = new ArrayList<>();
		
	}
	
}

/*
	1. ArrayList l = new ArrayList();
		-size of 10
		-at the 11th element, all elements are copied to a new ArrayList obj + 1
		  old list is available for GC
		- NEW CAPACITY = (currentCapacity * 3/2) + 1 = 16
			16 * 3/2 + 1 = 25
			25 * 3/2 + 1 = 38
			
	2. ArrayList l = new ArrayList(int initialCapacity);
	
	3. ArrayList l = new ArrayList(Collection c)
		-for any Collection object, it creates an equivalent ArrayList Obj
			-interconversion-
*/
