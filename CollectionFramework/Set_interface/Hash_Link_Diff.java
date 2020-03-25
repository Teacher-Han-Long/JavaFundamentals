import java.util.*;

public class Hash_Link_Diff {

/*
	Same methods and constructors
BUT If we need insertion order but no duplicates- LinkedList

HashSet
--------
1. HashTable - underlying data structure
        -duplicates not allowed
        -insertion order not preserved   
		-1.2v

LinkedHashSet
--------------
1. LinkedList and HashTable - hybrid data structure
        -duplicates not allowed
        -insertion order PRESERVED
		-1.4v


*/

/*
	Cache Memory:
	-------------------
	Primary memory - fast / costly
	-performance down
	
	(In the middle)
	Cache memory - repeatedly required code stored here-costly
	1. duplicates are not allowed
	2. insertion order must be preserved
	
	Secondary memory - hard disk / slow / cheaper
	-performance relatively high
	-----------------------------------------------------------------
	Which data structure meets this criteria?
	LinkedHashSet can be used to develop cache based applications
	where duplicates are not allowed and insertion order must be preserved.
	
*/


	public static void main(String[] args) {
		LinkedHashSet lh = new LinkedHashSet();
		lh.add("A");
		lh.add("E");
		lh.add("C");
		lh.add("G");
		lh.add(null);
		lh.add(10);
		System.out.println(lh.add("G")); //false
		System.out.println(lh.add("H")); //true
		System.out.println(lh);
	}

}
