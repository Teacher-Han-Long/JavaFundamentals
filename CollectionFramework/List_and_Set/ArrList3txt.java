import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.RandomAccess;


public class ArrList3 {
	
	/*
		When is ArrayList the worst choice?
		Insertion or deletion in the middle. (LinkedList is the best choice)
		Too many shift operations to insert an element in the middle
		The same goes for removal
		-------------------------------------
		l.add(1, "m");
		l.remove(1);
		
		It's the best choice for retieval operations, because of
		RandomAccessInterface
		
		ArrayList / Vector Differences
		=======================
		
		Arraylist :
		------------
		Every method non-synchronized
		Not thread-safe
		Performance relatively high
		1.2 (non-legacy)
		
		Vector : 
		-----------
		Synchronized
		Thread-safe, 1 at a time
		Performance relatively low
		1.0 (legacy)
		
		------------------------------------------------------------------------------------------
		____________________________________________________________
		
		How to get a synchronized/thread-safe version of ArrayList?
		-from the Collections class
		public static List synchronizedList(List l);
		
		ArrayList l = new ArrayList();
		List l1 = Collections.synchronizedList(l);
		
		l = non-synchronized
		l1 = synchronized
		
		----------------  also have synchronized Set and Map versions---------------
		Collection.synchronizedSet()
		Collection.synchronizedMap()
		public static Set synchronizedSet(Set s);
		public static Map synchronizedMap(Map m);
		
		
		========================================================
		========================================================
		LinkedList implements:
		Serializable / Clonable
		but not RandomAccess
		BEST choice for insertion or deletion in the middle middle middle
		WORST choice if the frequent operations are retrieval operations
	*/
	
	
	public static void main(String[] args) {
		
		
	}
	
	
}