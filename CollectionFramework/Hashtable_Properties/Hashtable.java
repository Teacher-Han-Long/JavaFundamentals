1. Hashtable - underlying data structure
2. Insertion order not preserved- based on HC of keys
3. Duplicate keys - not allowed 
	duplicate values ok
4. Heterogeneous values allowed for key and value
5. null -  not allowed for key or value
6. Implements Serializable and Clonable-not RandomAccess
7. Thread-safe  :  Every method is synchronized
8. Search operations : Hashtable is the best choice if frequent
	operation is search.
	
	
========================================================

CONSTUCTORS:
-----------------------
same as HashMap/HashSet

1. Hashtable h = new Hashtable();
	empty
	default initial capacity 11
	(HashSet/Map = 16)
	default fill ratio 0.75
	
2. Hashtable h = new Hashtable(int initialCapacity)

3. Hashtable h = new Hashtable(int initialcapacity, float fillRatio)

4. Hashtable h = new Hashtable(Map m)

==========================================================

OVERRIDING HASHCODE METHOD
*HashtableDemo.java

Hashtable h = new Hashtable();
-11 buckets (0-10)
		h.put(new Temp(5), "A");
		h.put(new Temp(2), "B");
		h.put(new Temp(6), "C");
		h.put(new Temp(15), "D");
		h.put(new Temp(23), "E");
		h.put(new Temp(16), "F");
	- 5-6 are inserted at their respective bucket, but no 15...
	- 15 % 11 = 4 (inserted at 4)
	- 23 % 11 = 1 (inserted at 1)
	- 16 % 11 = 5 (inserted at 5?)
		Mulitiple entries are allowed in the same bucket
	
	10  
	  9
	  8
	  7
	  6  6="C"
	  5  5="A", 16="F"
	  4  15="D"
	  3
	  2  2="B"	 
	  1  23="E"
	  0
	  
	
	Printing :  from top to bottom
					multiple - right to left
	If we change the initial capacity, output will change
	Number of buckets rises
	
	--------------------                    --------------------------
	
	IF we change hashcode method:
	------------------------------------------
	class Temp {
		int i;
		Temp (int i) {
			this.i = i;
		}	
		public int hashCode() {
			return i % 9;
		}
		public String toString() {
			return i + "";
		}
	}
	
	10  
	  9
	  8
	  7  16="F"
	  6  6="C", 15="D"
	  5  5="A", 23="E""
	  4  
	  3
	  2  2="B"	 
	  1  
	  0
	  
	  O/P -> { 16=F, 15=D, 6=C, 23=E, 5=A, 2=B}
	  =========================================
	  
	  Hashtable h = new Hashtable(25);
	  h.put(new Temp(5), "A");
		h.put(new Temp(2), "B");
		h.put(new Temp(6), "C");
		h.put(new Temp(15), "D");
		h.put(new Temp(23), "E");
		h.put(new Temp(16), "F");
		System.out.println(h);
		
		class Temp {
			int i;
			Temp (int i) {
				this.i = i;
			}	
			public int hashCode() {
				return i;
			}
			public String toString() {
				return i + "";
			}
	}
	
	24
	23 23="E"
	22
	21
	20
	.
	.		O/P -->   { 23=E, 16=F, 15=D, 6=C, 5=A, 2=B }
	.
	  8
	  7  
	  6  6="C"
	  5  5="A"
	  4  
	  3
	  2  2="B"	 
	  1  
	  