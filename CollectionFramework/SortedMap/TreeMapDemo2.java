import java.util.*;

public class TreeMapDemo2 {
	/*
		CONSTRUCTORS
		--------------------------
		1. TreeMap t = new TreeMap();
			Default sorting order of keys
			
		2. TreeMap t = new TreeMap(Comparator c);
			Customized sorting order
		
		3. TreeMap t = new TreeMap(SortedMap m);
			-creates equivalent SortedMap object
		
		4. TreeMap t = new TreeMap(Map m);
			Any Map object - creates equivalent Map object
	*/
	public static void main(String[] args) {
		SortedMap m = new TreeMap();
		m.put(101, "ZZZ");
		m.put(103, "XXX");
		m.put(101, "YYY");
		m.put(104, 106);
		//m.put("FFF", "XXX"); //CCE
		// (trying to insert heterogeneous keys, because of DNComparison)
		 m.put(null, "XXX");	  //NPE
		
		System.out.println(m);
		
	}
}