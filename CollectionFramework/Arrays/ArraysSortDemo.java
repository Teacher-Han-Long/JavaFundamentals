import java.util.Arrays;
import java.util.Comparator;

public class ArraysSortDemo {
	public static void main(String[] args) {
		
		int[] a = {10, 5,20,11, 6};
		System.out.print("Primitive array before sorting: ");
		for (int a1 : a) {
			System.out.printf("[%s] ", a1);
		}
		System.out.println();
		
		Arrays.sort(a);
		System.out.println("Primitive array after sorting: ");
		for (int a1 : a) {
			System.out.println(a1);
		}
		System.out.println(Arrays.toString(a));
		//----------------------------------------------------------------------------
		
		String[] s = {"A", "Z", "B"};
		System.out.print("Object array before sorting: ");
		for (String s1 : s) {
			System.out.print("["+s1+"]");
		}
		System.out.println();
		Arrays.sort(s);
		System.out.println("Object array after sorting(default)");
		System.out.println(Arrays.toString(s));
		for (String s1 : s) {
			System.out.printf("[%s] %n", s1);
		}
		System.out.println();
		//---------------------                            ---------------------------------
		System.out.println("Object array after sorting(custom)");
		Arrays.sort(s, new MyComparator());
		for (String s1 : s) {
			System.out.printf("[%s] %n", s1);
		}
	}
}

class MyComparator implements Comparator {
	public int compare(Object obj1, Object obj2) {
		String s1 = obj1.toString();
		String s2 = obj2.toString();
		return s2.compareTo(s1);
	}
}