import java.util.*;


public class LinkedListDemo {
	
	/*
		  ========================================================
		
		LinkedList Constructors
		-------------------------------
		
		1. LinkedList l = new Linked();
		2. LinkedList l = new LinkedList(Collection c);
		
		========================================================
		LinkedList implements:
		Serializable / Clonable
		but not RandomAccess
		BEST choice for insertion or deletion in the middle middle middle
		WORST choice if the frequent operations are retrieval operations
		
		Arrays - 
		Stacks and Queues
		---------------------------
		LinkedList - 
		Stacks -> LIFO
		Queues -> FIFO
		
		LinkedList class
		COMMONLY USED TO IMPLEMENT:
		to provide support for this, 
		LinkedList class defines these specific methods:
		addFirst();
		addLast();
		getFirst();
		getLast();
		removeFirst();
		removeLast();
		ions
	*/
	
	
	public static void main(String[] args) {
		
		LinkedList l1 = new LinkedList();
		l1.add("Flying Burrito Brothers");
		l1.add(68);
		l1.add(null);
		System.out.println(l1);
		System.out.println();
		l1.add("Burrito Deluxe");  // appends Burrito Deluxe
		l1.set(0, "Sneaky Pete");  // replaces Flying Burrito Brothers
		System.out.println(l1);
		System.out.println();
		l1.add(0, "Flying Burrito Brothers");
		l1.removeLast();				// removes Burrito Deluxe
		l1.addFirst("Last of the Red Hot Burritos"); // adds to head of list
		System.out.println(l1);
		System.out.println();
	}
	
	
}