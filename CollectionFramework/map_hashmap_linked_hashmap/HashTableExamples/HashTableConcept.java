import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Set;

public class HashTableConcept {
// NOT USED FOR MULTI-THREADING
// stores a value on basis of hashCode of the key	
	public static void main(String[] args) {
		
		Hashtable<Integer, String> h1 = new Hashtable<>();
		h1.put(1, "Java");
		h1.put(2, "BASIC");
		h1.put(3, "C");
		
		// create a clone copy/shallow copy:
		Hashtable<Integer, String> h2 = new Hashtable<>();
		h2 = (Hashtable)h1.clone();
		
		System.out.printf("The values from h1: %s %n", h1);
		System.out.printf("The values from h2: %s %n", h2);
		h1.clear();
		System.out.printf("The values from h1: %s %n", h1);
		System.out.printf("The values from h2: %s %n", h2);
		
		// contains value
		Hashtable<String, String> st = new Hashtable<>();
		st.put("A", "R2D2");
		st.put("B", "R5D4");
		st.put("C", "Twiggy");
		
		if (st.containsValue("R5D4")) {
			System.out.println("We have the droid you're looking for, but he's got a bad motivator!");
		} else {
			System.out.println("I don't have the droid you're looking for.");
		}
		System.out.println();
		System.out.println();
		
		// print all values from Hashtable using -- Enumeration -- elements
		// returns Enumeration object, so store it in a Enumeration reference
		Enumeration e = st.elements();
		System.out.println("Print values from st using enumeration: ");
		
		while (e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
		
		// get ALL values from Hashtable using-- entrySet() --set of Hashtable values:
		System.out.println("Pring values from st using entry set: ");
		Set s = st.entrySet();
		System.out.println(s);
		
		System.out.println();
		System.out.println();
		
		// Check if 2 Hashtables are equal or not:
		Hashtable<String, String> st2 = new Hashtable<>();
		st2.put("A", "R2D2");
		st2.put("B", "R5D4");
		st2.put("C", "Twiggy");
		// only unique items
		st2.put("C", "Twiggy");
		// only unique elements - it will ignore it
		System.out.println("values from st2: ");
		System.out.println(st2);
		
		System.out.println();
		System.out.println();
		
		if (st2.equals(st)) {
			System.out.println("st1 and st2 are equal");
		} else {
			System.out.println("NOT EQUAL");
		}
		if (st2 == st) {
			System.out.println("Still equal!");
		}
		
		// get the value from a key
		System.out.println(st2.get("B"));
		
		// get the hashCode of hashTable object
		System.out.println("The hashCode value of st : " + st.hashCode());
		System.out.println("The hashCode value of st : " + st2.hashCode());
		
		System.out.println();
		System.out.println();
		
		// no null key or null values - allowed in HashMap
		// RuntimeException - NullPointerException
		//st2.put(null, "C-3PO");
		//st2.put("D", null);
		//System.out.println("Won't reach this line");
		
		
	}
	
}




























