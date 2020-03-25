import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.*;


class Test1 {
	
	public static void main(String[] args) {
		
		HashMap<String, Integer> m = new HashMap<>();
		m.put("Java", 100);
		m.put("C++", 400);
		m.put("JavaScript", 300);
		m.put("BASIC", 200);
		
		System.out.println(m);
		System.out.println(m.put("JavaScript", 3000)); //--> returns 300
		System.out.println(m); 
		
		//Collection views of Map<I>-  [ K = V ] square brackets
		//only keys, values, or Entries
		Set s = m.keySet();
		System.out.println(s);
		Collection c = m.values();
		System.out.println(c);
		
		Set s1 = m.entrySet();  
		System.out.println(s1);
		Iterator itr = s1.iterator();
		System.out.println(s1);
		
		// Entry object methods in action
		while (itr.hasNext()) {
			
			Map.Entry m1 = (Map.Entry)itr.next(); // Outer<I>.Inner<I>
			System.out.println(m1.getKey() + "......" + m1.getValue());
			
			if (m1.getKey().equals("JavaScript")) {
				m1.setValue(5000);						  // returns 3000
			}
		}
		System.out.println(m);
		
		System.out.println();
	}
	
}