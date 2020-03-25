public class BinarySearch {
	
	/*
		binary search : list must be sorted
		
		2 binary search methods:
	------------------------------------
	
	DEFAULT SORTING ORDER
	   1.  public static int binarySearch(List l, Object target)
		
		
		l = Z A M K a
		Collections.sort(l);
		l = AKMZa
		Successful search returns index of element
		binarySearch(l, "Z");  -> 3
		
		Unsuccessful search returns insertion point
		(the point where we can insert the element)
		 0   1   2   3   4
	    -1  -2  -3  -4  -5
		binarySearch(l, "J"); -> -2
		
		If the list is not sorted we get unpredictable results, but error
	
	CUSTOMIZED SORTING ORDER
		2.	public static int binarySearch(List l, Object target, Comparator c)
			-at time of search we must also include Comparator
		==================================================
		
		Internally both of the above methods use BINARY SEARCH ALGORITHM
		
		==================================================
		*CollectionSearchDemo.java
		==================================================
		
		l -> 	15	0	  20	 10	 5
		
				-1     -2    -3    -4    -5	-> insertion point
		l -> 	20    15	  10	  5	 0
				0		1		2	  3 	  4	-> index
				
		Collections.binarySearch(l, 10, new MyComparator());  -> 2
		Collections.binarySearch(l, 13, new MyComparator());  -> -3
		Collections.binarySearch(l, 17);  -> 	unpredictable
		*If list is sorted by custom comparator, the binary search
		must be implemented with the same custom comparator*
		Collections.binarySearch(l, 17, new myComparator);  ->  -2 
		
		=================================================
		=================================================
		
		ex. 3 - elements
		-1	-2	-3	-4
		A	 K  Z
		0   1   2  
		
		Successful Search Result Range: 0 to 2
		Unsuccessful Search Result Range: -4 to 1
		Total Result Range: -4 to 2
		--------------------------------------------------------
		For List of 'n' elements
		1.	Successful Search Result Range: 0 to n-1
		2. Unsuccessful Search Result Range: -(n+1) -1
		3. Total Result Range: -(n+1) to n-1
		
	*/
	
	/*
		Reverse Elements of a List - Collections class defines the following
		
		public static void reverse(List l)
		
		import java.util.*;
		class CollectionsReverseDemo {
			ArrayList l = new ArrayList();
			l.add(15);
			l.add(5);
			l.add(2);
			System.out.println(l);
			Collections.reverse(l);
			System.out.println(l);
		}
		
		-------------------------------------------------------------------------------------
		
		reverse()   vs   reverseOrder()
		
		reverseOrder()   -    to get the reverseOrder of the comparator
		Comparator c1 = Collections.reverseOrder(Comparator c)
		(Descending order)											(Ascending order)
	*/
	
}