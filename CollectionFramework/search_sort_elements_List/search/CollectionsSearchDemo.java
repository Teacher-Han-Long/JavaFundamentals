import java.util.Collections;
import java.util.ArrayList;

public class CollectionsSearchDemo {
	
	public static void main(String[] args) {
		ArrayList<String> l = new ArrayList<>();
		l.add("Z");
		l.add("A");
		l.add("K");
		l.add("a");
		l.add("M");
		System.out.println(l);
		Collections.sort(l);
		System.out.println(l);
	
		// binary search elements
		System.out.println(Collections.binarySearch(l, "Z")); //-> 3
		System.out.println(Collections.binarySearch(l, "J")); //-> -2
		System.out.println(Collections.binarySearch(l, "z")); //-> -6
		// comment out the sort, and o/p -> unpredictable
	}
	
}

