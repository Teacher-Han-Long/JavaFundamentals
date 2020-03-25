LIMITATIONS OF ENUMERATION(I)
===========================
1. 1.0 - only available for legacy classes
	not a universal cursor
2. Read access only. Can't remove elements

Iterator(I)
========
1. universal cursor - applicable to any Collection Object
2. Read and remove operations both possible

-----------------------------------------------------

How do we get an Iterator Object?
---------------------------------

public Iterator iterator()
-iterator method present in Collection(I)

Iterator itr = c.iterator();
-c can be any Collection Object


Methods in Iterator (shorter names)
----------------------
1. public boolean hasNext()

2. public Object next()

3. public void remove()
	-this has no equivalent in Enumeration
 
ArrayList l = new ArrayList();
for (int = 0; i <= 10; i++) {
	l.add(i);
}
System.out.println(l); --> 0,1,2,3....10

//get Objects one by one from the Collection
Iterator itr = l.iterator();
while (itr.hasNext()) {
	Integer I = (Integer) itr.next();
	if (I % 2 == 0) {
		System.out.println(I);
	} else {
		itr.remove();
	}
}

/*
		Limitiations of Iterator:
		-----------------------------
		1. SINGLE DIRECTION CURSORS(not BI)- only forward
		2. read / remove operations only 
			- no replace / addition of new objects.


				To overcome these limitations:
				----------------------------------------
				ListIterator(I): --> Child interface of Iterator(I)
				-----------------
				1. Bi-directional cursor- forward or back
				2. replacement / addition of new objects
					- in addition to read / remove
				3. All methods of Iterator available to ListIterator
				
	
		public ListIterator listIterator()  --> of List(I)
		eg.
		ListIterator itr = l.listIterator --> l = Any List Object
		
		ListIterator Defines the following 9 methods: (3 from Iterator)
		----------------------------------------------------------------------------
		FORWARD:
		1. public boolean hasNext()
		2. public Object next()
		3. public int nextIndex()
		REVERSE:
		4. public boolean hasPrevious()
		5. public Object previous()
		6. public int previousIndex()
		EXTRA:
		7. public void remove()
		8. public void add(Object o)
		9. public void set(Object o)
				* ListIteratorDemo.java
	*/


