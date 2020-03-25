import java.util.*;

public class TreeSetDemo {
	
	/*
		1. BalancedTree - underlying data structure for TreeSet
		2. Duplicates not allowed
		3. Insertion order not preserved
			inserted based on some sorting order
			(may be default or customized sorting order)
		4. Heterogeneous elements not allowed
			-Comparison requires objects to be of the same type
			-Throws a classCastException
		5. BEFORE 1.7 - null insertion allowed BUT not with other elements.
			Only empty in an TreeSet,  as first element
		6. Implements Serializable, Clonable, BUT NOT RandomAccess
	*/
	/*
		4 Constructors
		---------------------
		1. TreeSet t = new TreeSet(); -> default natural sorting order
		
		2. TreeSet t = new TreeSet(Comparator c); -> customized sorting
												order specified by Comparator Object
												
		3. TreeSet t = new TreeSet(Collection c); -> interconversion
		
		4. TreeSet t = new TreeSet(SortedSet s);
	*/
	
	/*
		null acceptance
		----------------------
		1. t.add(null)--> in TreeSet, while adding objects comparisons must be
		made. In a non-empty TreeSet, trying to compare an object to null  NullPointerException
		t.add(null);  --> ok
		t.add("A");  --> invalid NullPointerException
	*/
	
	public static void main(String[] args) {
		TreeSet t = new TreeSet();
		t.add("A");
		t.add("a");
		t.add("B");
		t.add("Z");
		t.add("L");
		System.out.println(t);
		//t.add(new Integer(20)); //--> ClassCastException
		System.out.println(t);
		//t.add(null);				   //--> null pointer Exception
		System.out.println(t);
		System.out.println();
	}
	
}