9 Key Intefaces of Collection Framework
-----------------------------------------

1. Collection

2. List

3. Set

4. SortedSet

5. Navigable Set

6. Queue

7. Map

8. SortedMap

9. NavigableMap

Collection(I):
Rep. a group of individ objects as a single entity
For any Collection object, the most common methods available, are 
defined inside of Collection(I)

Collection(I) in general, is considered the root interface of
Collection hierarchy 
BUT it's not.
Map(I) is not a child interface of Collection(I)

No concrete class implements Collection(I) directly


VERY COMMON QUESTION in INTERVIEWS:
Difference between Collection and Collections?
------------------------------------------------
BIG DIFFERENCE
 
Collection: An interface
Collections: A class. A utility class defining several utility methods
	for handling Collection Objects
ex. Collections.sort(l)


_________________________________________________________________________

Collection(I) - 1.2
----------------------


List(I) -1.2 :
1. Child interface of Collection
2. Duplicates are allowed
3. Insertion order preserved

Implementation classes
-----------------------
1. ArrayList -1.2  
2. Linked List -1.2  
3. Vector -1.0
4. Stack -1.0 
(1.0-Legacy classes)

Vector and Stack : How can they implement 1.2 List(I)?
Re-engineered in 1.2 version to implement List(I)



Set(I) -1.2 :
1. Child interface of Collection
2. Duplicates not allowed
3. Insertion order not preserved

Implementation classes
-----------------------
1. HashSet -1.2
2. LinkedHashSet -1.4


SortedSet(I) -1.2 :
1. Child interface of Set 
2. Duplicates not allowed
3. Inserts according to some sorting order
				|
			   V
NavigableSet(I) -1.6 :
1. Child interface of SortedSet
2. Contains several methods for navigation purposes

Implementation classes
-----------------------
1. TreeSet -1.2
   (modified in 1.6 version to implement NavigableSet(I)




Queue(I) -1.5 :
1. Child Interface of Collection
2. Prior-to-processing
3. First in, first out

If you want to store all mail id's in some data structure
before sending out messages - Store in a Queue

Implementation classes
-----------------------
1. PriorityQueue
2. BlockingQueue
	a. PriorityBlockingQueue
	b. LinkedBlockingQueue


__________________________________________________________________


The above interfaces (C,L,S,SS....) are meant for representing a 
group of individual objects. To represent by key/value pairs.....
 
Map(I) - 1.2:
1. Represent a group of objects as key/value pairs
2. NOT a child interface of Collection - It's own thang
3. Duplicate keys not allowed
4. Duplicate values allowed

Implementation classes
------------------------
1. HashMap -1.2
2. LinkedHashMap -1.4 - extends HashMap
3. WeakHashMap -1.2
4. IdentityHashMap -1.4
Legacy Classes (1.0)
5. Hashtable - child of Dictionary(Abstract class)
6. Properties - extends Hashtable


SortedMap(I) - 1.2 : 
1. Child interface of Map(I)
2. Represent k/v pairs according to some sort order of KEYS(not val)

NavigableMap(I) - 1.6
1. Child interface of SortedMap(I)
2. It defines several methods for navigation purposes

Implementation classes
-----------------------
1. TreeMap - 1.2


________________________________________________________________________



If we need default natural sorting:
1. Comparable(I)

Customized Sorting:
2. Comparator(I)



To get objects one by one from Collection:
Cursors
---------
1. Enumeration(I) *
2. Iterator(I)
3. ListIterator(I)


Utility Classes
---------------
1. Collections
2. Arrays


*Legacy 
----------
Enumeration(I)
Dictionary(AC)
Vector(C)
Stack(C)
Hashtable(C)
Properties(C)
