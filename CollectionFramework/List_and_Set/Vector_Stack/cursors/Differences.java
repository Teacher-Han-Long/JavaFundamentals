Property
--------

1. Where can we apply it?
2. Is it legacy?
3. Movement
4. Allowed Operations
5. How to get it
6. Methods

Enumeration
-----------
1. Only legacy classes
2. Yes (1.0)
3. Single direction (forward)
4. Read-only
5. elements() - Vector class
6. 2 methods: 
	hasMoreElements()
	nextElement() 

Iterator
--------
1. Any Collection Object
2. No (1.2)
3. Single direction (forward)
4. Read / Remove
5. iterator() - Collection(I)
6. 3 methods:
	hasNext()
	next()
	remove()

ListIterator
------------
1. Only List Objects
2. No (1.2)
3. Bi-directional
4. Read / Remove / Add / Replace
5. listIterator() - List(I)
6. 9 methods:
	1. public boolean hasNext()
	2. public Object next()
	3. public int nextIndex()
	
	4. public boolean hasPrevious()
	5. public Object previous()
	6. public int previousIndex()

	7. public void remove()
	8. public void add(Object o)
	9. public void set(Object o)
      * ListIteratorDemo.java

===================================================

Enumeration, Iterator, ListIterator
-All 3 are Interfaces
	How are we getting (E,I,L) Objects?
We aren't really getting Enumeration, etc Objects.
Enumeration(I) implements a class Object.
What are the names of these objects?

getClass()
getName()

*CursorsDemo.java
