/*
	String s = new String("Harpo");
	2 Objects created
	whenever we use "new" keyword, a new object will be created in the Heap
	and (for every String literal) one copy in the String Constant Pool (scp)
	for future purposes(no implicit reference variable, but internally, implicit 
	reference 	variable will be maintained by the JVM). Not available for GC.
	Until 1.6 scp was part of Method Area |  PERMGEN
	From 1.7 on, scp is in the Heap

	String s = ("Harpo");
	1 object created in scp.
	First JVM will check to see if any object with same content exists.
	Only after that will an object be created.
	------------------------------------------------------------------------------------
	
	String s1 = new String("Groucho");
	String s2 = new String("Groucho");
	String s3 = "Groucho";
	String s4 = "Groucho";
	
	3 objects created
	------------------------------------------------------------------------------------
	
	1. String s = new String("Leonard ");
	2. s.concat("Chico ");
	3. s = s.concat("Marx");
	
	1. 2 objects, 1 heap 1 scp
	2. For every literal, 1 object created in scp
		Leonard Chico created in heap (runtime obj., not scp), but no reference
		avaiable for GC
	3. Marx created in scp for reusability (literal)
		s -> Leonard Marx in the heap
		Original s reference (Leonard) and s.concat with no reference are now 
		available for GC.

*/