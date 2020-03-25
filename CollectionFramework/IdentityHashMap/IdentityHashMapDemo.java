import java.util.*;

class IdentityHashMapDemo {
	public static void main(String[] args) {
		IdentityHashMap<Integer, String> m = new IdentityHashMap<>();
		Integer I1 = new Integer(10);
		Integer I2 = new Integer(10);
		m.put(I1, "Abbot");
		m.put(I2, "Costello");
		System.out.println(m);  // will there be one or 2 elements in the map?
	}
}

/*
	class IdentityHashMapDemo {
	public static void main(String[] args) {
		HashMap<Integer, String> m = new HashMap<>();
		Integer I1 = new Integer(10);
		Integer I2 = new Integer(10);
		m.put(I1, "Abbot");
		m.put(I2, "Costello");
		System.out.println(m);  // will there be one or 2 elements in the map?
	}
}
	In the case of HashMap, JVM  will use .equals() to identify duplicate keys!
	----------------------------------------------------------------------------------------------
	The value will be replace with the new value
	The output is :  10 => Costello
	===========================================================
	
	In IdentityHashMap JVM uses double equal operator (==) to compare objects
	-Including methods and constructors IdentityHashMap is identical to HashMap
	EXCEPT for this   ==
*/