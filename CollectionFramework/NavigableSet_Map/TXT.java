1.6 Enhancements in Collection Framework

1. NavigableSet(I)  
2. NavigableMap(I)

NavigableSet  ---->  child interface of SortedSet

All are 1.2 EXCEPT for NavigableSet
Collection(I)
     |
  Set(I)
	|
SortedSet(I)
    |
NavigableSet(I)
	|
TreeSet(I)

Many methods already. What is the need for
NavigableSet? 
To fill gaps left by the others.

If we want to display all flight times at an airport.
--------------------------------------------------------------
00:30
04:20
09:20
10:15
14:25
18:20
20:25
23:25

first()
last()
headSet()     ---> These methods all available in SortedSet
tailSet()
subSet()

BUT how do we find the time BEFORE 10 o'clock?
What's the first flight AFTER 10 o'clock? 
NavigableSet provides / defines methods for navigational support.
---------------                  ---------  ----------      --------------------------
					       METHODS
						 ------------------

1. lower(e) - returns highest element which is < e

2. floor(e) - returns highest element which is <= e

3. ceil(e) -> either return lowest element which is >= e

4. higher(e) -> returns lowest elemtn which is > e

5. pollFirst() -> removes and returns first element

6. pollLast() -> removes and returns last element

7. descendingSet() -> returns NavigableSet in reverse order


=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=--=-=
*NavigableSetDemo.java
*NavigableMapDemo.java
=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-


Collections class defines several utility methods for Collection objects
Sorting, searching, reversing, etc.....

ex. I need List,
 but there are no sorting methods in List class (insertion preserved)
 Collections.sort(l);


Sorting elements of a List
---------------------------------
	2 Utility Methods for sorting

1. public static void sort(List l)
	-natural sorting order
	Objects must be homogenous and comparable
	Otherwise RE: ClassCastException
	Can't contain null. Comparison = NullPointerException
	
2. public static void sort(List l, Comparator c)
	-customized sorting order

*CollectionsSortDemo.java
*CollectionsSortDemo2.java





