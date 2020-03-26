import java.util.Arrays;
import java.util.Comparator;

public class BinarySearchDemo {
	public static void main(String[] args) {
		
		/*
			Searching a primitive array
		*/
		int[] a = {10, 5, 20, 11, 6};
		
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.binarySearch(a, 6)); // 1
		System.out.println(Arrays.binarySearch(a, 14));
		System.out.println();
		//----------------------------------------------------------------------------
		/*
			Searching an object array, if object array is sorted according to 
			default natural sorting order
		*/
		String[] s = {"A", "Z", "B"};
		System.out.println(Arrays.toString(s));
		Arrays.sort(s);
		
		System.out.println(Arrays.toString(s));
	    System.out.println(Arrays.binarySearch(s, "Z"));
	    System.out.println(Arrays.binarySearch(s, "S"));
		
		
		//---------------------                            ---------------------------------
		/*
			Searching an object array, if object array is sorted according to 
			cusomized sorting order
		*/
		System.out.println();
		System.out.println(Arrays.toString(s));
		Arrays.sort(s, new MyComparator());
		System.out.println(Arrays.toString(s));
		System.out.println(Arrays.binarySearch(s, "Z", new MyComparator()));
		//unpredictable results below, because no comparator arg
	    System.out.println(Arrays.binarySearch(s, "S"));
		System.out.println();
	}
}

class MyComparator implements Comparator {
	public int compare(Object obj1, Object obj2) {
		String s1 = obj1.toString();
		String s2 = obj2.toString();
		return s2.compareTo(s1);
	}
}