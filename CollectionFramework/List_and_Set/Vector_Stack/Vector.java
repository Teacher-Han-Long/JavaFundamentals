Vector:

1. ResizableArray / GrowableArray
2. Insertion order preserved
3. Duplicates allowed
4. Heterogeneous elements ok
5. null insertion ok
6. Implements - Serializable, Clonable, RandomAccess Interfaces
7. Every method in Vector is synchronized, so Vector objects: thread-safe

=============================================================

Constructors
------------------

1.
Vector v = new Vector();  --> default capacity 10
-add 11th...
NOT cc * 3/2 + 1 
Once Vector reaches it's capacity, it doubles
10, 20 , 40.......

2.
Vector v = new Vector(int initialCapacity)

3.
Vector v = new Vector(int initialCapacity, int incrementalCapacity)
Vector v = new Vector(1000, 5);
-Vector v = new Vector(1000) --> what if we're about to reach capacity,
but only need a few more - NOT DOUBLE!

4.
Vector v = new Vector(Collection c)
-meant for interconversion between Collection objects

============================================================

Vector specific methods
--------------------------------

older generations - lengthier names

1.
addElement(Object o)
2.
removeElement(Object o)
3.
removeElementAt(int index)
4.
removeAllElements()

====================================================================

COMPARISON OF METHODS 
-Collection, List, Vector specific

-to add objects
----------------
add(Object o)			-C
add(int index, Object o)	-L
addElement(Object o)		-V

-to remove
-----------
remove(Object o)		-C
remove(int index)		-L
removeElement(Object o)		-V
removeElementAt(Object o)	-V
clear()				-C
removeAllElements()		-V

-to get
--------
Object get(int index)		-L
Object elementAt(int index)	-V
Object firstElement()		-V
Object lastElement()		-V

-other methods(misc)
--------------------
int size()
int capacity()
Enumeration elements()

Why isn't capacity not in ArrayList()?
-Java programmers don't need to worry about memory anymore.
More of an issue in C, C++. Older generations use capacity().
*VectorDemo1.java
