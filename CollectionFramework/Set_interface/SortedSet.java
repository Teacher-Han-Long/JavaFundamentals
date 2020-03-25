import java.util.*;

public class SortedSet {
	/*
		Collection(I)
			|
		Set(I)
			|
		SortedSet(I)
		
		1. the Child interface of Set
		2. represent a group of individual objects
			as a single entity according to some sorting order
			without duplicates
	*/
	
	/*
		DEFAULT NATURAL SORTING ORDER
		------------------------------------------------------
		numbers -> Ascending order
		String     -> Alphabetical order
		
		SortedSet Specific Methods -(SortedSet ONLY)
		-------------------------------------  
		100, 101, 104, 106, 110, 115, 120
		
		1. Object first() -> 100
		
		2. Object last() -> 120
		
		3. SortedSet headSet(106) -> [ 100, 101, 104 ] (< obj)
		
		4. Sorted tailSet(106) -> [ 110, 115, 120 ] (>= obj)
		
		5. SortedSetsubSet(101, 115) -> [ 101, 104, 106, 110 ]
				-includes first, excludes last (>= obj1 / < obj2)
		
		6. Comparator comparator() 
			- returns Comparator object that 
			describes underlying sorting technique
			If we are using default natural sorting, returns null
	*/
	
	public static void main(String[] args) {
		
		
	}
}