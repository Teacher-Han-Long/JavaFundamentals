
Collections    ---->    Arrays class
---------------------------------------------
A utility class that defines several utility methods for Array objects
When working with arrays, the programmer is responsible for writing the 
code for every requirement (sort, etc). An API class has been provided
to define utility methods for arrays.

1. Sorting elements of Arrays:
	-----------------------------------
	Arrays class defines the following sort() methods to sort elements 
	of primitive and Object type arrays.
	
	Comparator/customized sorting does not apply to primitive arrays
	compare() method's args are Objects.
	
	1. public static void sort(primitive[] p)
			--------> both sort in default natural sorting order
	2. public static void sort(Object[] o)
	
	3. public static void sort(Object[], Comparator o)
		-customized sorting order
		
===================================================

ALL RULES OF ARRAYS CLASS BINARY SEARCH METHODS ARE 
EXACTLY THE SAME AS COLLECTIONS CLASS BINARY SEARCH
METHODS
*BinarySearchDemo.java
-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-==-=-=-=-=-=-=-=-=-==-


Conversion of Array to List
-------------------------------------
Array.asList(); -> why as and not to?
It doesn't create an equivalent List Object
We're using the existing array AS a list

public static List asList(Object[] a)

String[] s = { "A", "Z", "B" };
List l = Arrays.asList(s);

Viewing it in List form
String[] s ---
                |||||||------> A Z B
  List l -------

1. It doesn't create an independant List Object.
	If we perform any change by using List reference,
	the change will automatically be reflected in the array
	
	s[O] = "K";
	System.out.println(l); -> [K, Z, B]

2. Contradition here: Arrays are fixed in size, 
    but Collections are growable in nature 
	When using List reference, we can't perform any operation 
    that changes the size of the array.. 
	
	Internally it's an array, so array technology dominates.
	l.add("M");
	l.remove(1);
	BOTH RE: UnsupportedOperationException
	
	l.set(1, "N");  --->  OK. Replaces, but doesn't change the size

3. Another contradiction: While using List reference we are 
    not allowed to replace with heterogeneous objects
	l.set(1, new Integer(10)); ---> RE: ArrayStoreException
	The array is String[] type
    






