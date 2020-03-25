import java.util.*;

public class TreeSetDemo2 {
	
	/*
		Elements in a TreeSet must be:
		-Homogeneous
		-implement Comparable
		
		This course is for Java 8, StringBuffer does not implement Comparable
		so this code throws a ClassCastException
		As of Java 11
		StringBuffer implements Comparable but does not override equals . Thus, the natural ordering of StringBuffer is inconsistent with equals. Care should be exercised if StringBuffer objects are used as keys in a SortedMap or elements in a SortedSet .
		String and all Wrapper Classes implement Comparable
	*/
	
	public static void main(String[] args) {
		
		TreeSet<StringBuffer> t = new TreeSet<>();
		t.add(new StringBuffer("A"));
		t.add(new StringBuffer("a"));
		t.add(new StringBuffer("B"));
		t.add(new StringBuffer("Z"));
		t.add(new StringBuffer("L"));
		System.out.println(t);
		//t.add(new Integer(20)); //--> ClassCastException
		System.out.println(t);
		//t.add(null);				   //--> null pointer Exception
		System.out.println(t);
		System.out.println();
	
	}
	
}