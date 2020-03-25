import java.util.*;

public class TreeMapDemo3 {
	/*
		
	*/
	public static void main(String[] args) {
		
		SortedMap t = new TreeMap(new MyComparator());
		t.put("ZZZ", 10);
		t.put("XXX", 20);
		t.put("YYY", 30);
		t.put("LLL", 40);
		//t.put("FFF", "XXX"); //CCE
		System.out.println(t);
	}
}

class MyComparator implements Comparator {
	
	public int compare(Object obj1, Object obj2) {
		String s1 = obj1.toString();
		String s2 = obj2.toString();
		return s2.compareTo(s1);
	}
	
}