import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CollectionsSortDemo2 {
	public static void main(String[] args) {
		
		ArrayList<String> l = new ArrayList<>();
		l.add("Z");
		l.add("A");
		l.add("K");
		l.add("N");
		
		System.out.println("Before Sorting: " + l);
		Collections.sort(l, new MyComparator());
		System.out.println("After Sorting: " + l);
	}
}

class MyComparator implements Comparator {
	
	public int compare(Object obj1, Object obj2) {
		String s1 = (String) obj1;
		String s2 = obj2.toString();
		return s2.compareTo(s1);
	}
	
}