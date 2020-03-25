import java.util.*;

public class ListIteratorDemo {
	
	// LIST ITERATOR IS THE MOST POWERFUL CURSOR, BUT
	// IT'S ONLY APPLICABLE ON LIST OBJECTS
	
	public static void main(String[] args) {
		
		LinkedList<String> l = new LinkedList<>();
		l.add("Groucho");
		l.add("Harpo");
		l.add("Chico");
		l.add("Zeppo");
		System.out.println(l);
		
		ListIterator itr = l.listIterator();
		while (itr.hasNext()) {
			String s = (String)itr.next();
			if (s.equals("Zeppo")) {
				itr.remove();
			} else if (s.equals("Harpo")) {
				itr.set("Adolf");
			} else if (s.equals("Groucho")) {
				itr.add("Rochester");
			} 
		}
		System.out.println(l);
	}
}