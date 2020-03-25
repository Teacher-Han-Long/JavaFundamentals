import java.util.HashSet;
import java.util.Set;

public class SetDemo {

/*
				Collection(I)- 1.2
		 |
					Set(I)- 1.2
					_|_
HashSet- 1.2		SortedSet(I)- 1.2
	|									|
LinkedHashSet- 1.4	NavigableSet(I)- 1.6
										|
								TreeSet- 1.2


===================================================

HashSet
--------
1. Underlying data structure - Hashtable
2. Duplicates not allowed
3. Insertion order not preserved
	all objects inserted based on hashcode
4. null insertion allowed
5. Heterogeneous elements allowed - only not 
	allowed in TreeSet and TreeMap
6. Serializable, Cloneable implemented
	RandomAccess not implemented
7. Best choice for search operations 
	-all Hash based data structures
 
8. HashSet h = new HashSet();
    h.add("A"); -> true
    h.add("A"); -> try to insert duplicate object,
	add() return type is boolean. No error or 
	Exception. Just returns "false"
*/

//========================================================

/*
	Same Constructors for 
	---------------------
	HashSet
	LinkedHashSet
	HashMap
	LinkedHashMap
	WeakHashMap
	IdentityHashMap

	Constructors
	--------------
	1. HashSet h = new HashSet();
		initial capacity-> 16
		Default (fill ratio)-> 0.75
			(load factor)
	ArrayList -must wait until 100% full(11th element)
	HashSet obj - after filling 75%, a new HashSet obj
	is created.
	
	2. HashSet h = new HashSet(int initialCapacity);
		Creates HS with specified initial capacity
		and default fill ratio - 0.75

	3. HashSet h = new HashSet(int initialCapacity, float fillRatio);
		Specified initial capacity and custom fill ration
		HashSet h = new HashSet(25, 0.9)

	4. HashSet h = new HashSet(Collection c);
		Creates equivalent HashSet for another Collection
		-interconversion between Collection objects


*/
/*
	HashSet h = new HashSet();
		h.add("A");
		h.add("E");
		h.add("C");
		h.add("G");
		h.add(null);
		h.add(10);
		System.out.println(h.add("G")); //false
		System.out.println(h.add("H")); //true
		System.out.println(h);
		for (String i : hs) {
			System.out.println(i);
		}
*/

	public static void main(String[] args) {
		
		Set<String> hs = new HashSet<>();
		hs.add("Hello");
		hs.add("Muddah");
		hs.add("Hello");
		hs.add("Faddah");
		hs.add(null);
		System.out.println(hs.add("Hello"));
		System.out.println(hs.add("GBye"));
		System.out.println(hs.add(null));
		System.out.println(hs.add("Beermeister"));
		for (String i : hs) {
			System.out.println(i);
		}
		
	}

}
