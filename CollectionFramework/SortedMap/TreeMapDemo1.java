import java.util.*;

public class TreeMapDemo1 {
	
	/*
	Sorted Map defines the following specific methods :
	(SAME AS SortedSet)
		Object firstKey();
		Object lastKey();
		SortedMap headMap(Object key);
		SortedMap tailMap(Object key);
		SortedMap subMap(Object key1, Object key2);
		Comparator comparator();
	*/
	public static void main(String[] args) {
		
		SortedMap t = new TreeMap();
		t.put(101, "A");
		t.put(103, "B");
		t.put(104, "C");
		t.put(107, "D");
		t.put(125, "E");
		t.put(136, "F");
		
		System.out.println(t.firstKey());
		System.out.println(t.lastKey());
		System.out.println(t.headMap(107));
		System.out.println(t.tailMap(107));
		System.out.println(t.subMap(103, 125));
		System.out.println(comparator()); // --> null?
	}
	
	/*
		1. Red-Black Tree - underlying data structure
		2. insertion order not preserved-based on some sorting order - keys
		3. Duplicate keys N/A,  Duplicate values OK
		4. Heterogeneous allowed? :
			If we're depending on default natural sorting order
			-keys should be homogeneous and comparable
			(otherwise- R/E --> ClassCastException)
			If we're defining our own sorting order by Comparator
			-keys need not be homogeneous and comparable
			We can take heterogeneous and non-comparable objects.
			Depends on our compare method logic. 
			No restrictions for values.
			Comparison is based on key, not value.
		5. Null acceptance - same as TreeSet. UP THROUGH 1.6 version
			For non-empty TreeMap
			- RE: NullPointerException (comparing with null)
			First entry - (null, "A") OK
			1.7 onwards -> no nul acceptance in TreeMap
	*/
}