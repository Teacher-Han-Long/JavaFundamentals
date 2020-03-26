import java.util.ArrayList;
import java.util.Collections;

public class CollectionsSortDemo {
	public static void main(String[] args) {
		
		ArrayList l = new ArrayList();
		l.add("Z");
		l.add("A");
		l.add("K");
		l.add("N");
		//l.add(new Integer(10)); 
		 /* -- CCE (adds homogeneous element
			AND trying to sort it. If no Collections.sort()
			it's ok, UNLESS you use generics, which you should.
		*/
		
		// l.add(null); // -- NPE
		System.out.println("Before Sorting" + l);
		Collections.sort(l);
		System.out.println("After Sorting" + l);
	}
}