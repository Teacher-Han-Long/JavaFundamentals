List Interface defines the following List specific methods

List(I) - The child interface of Collection(I)
------------------------------------------------------
1. represent a group of individual objects as a single entity
2. duplicates are allowed
3. insertion order is preserved - with respect to index
	list[0] = "A";   list[5] = "A"; 
	index plays an important role in insertion order
	
	All of Collection's methods are available to List by default, BUT
	l[3] = "D"
	
	boolean add(int index, Object o)
		l.add(3, "A"); 3 = "A"
	boolean addAll(int index, Collection c)
	
	Object remove(int index)
		l.remove("A")
		
	Object get(int index) --> if not there, returns null
	Object set(int index, Object new)
		to replace the element present at specified index w/provided
		Object and returns old object
	
	int indexOf(Object o) --> returns index of first occurance of 'o'
		indexOf("A")  --> first occurance = 0
	lastIndexOf(Object obj)
	
	ListIterator listIterator();
	_________________________________________________________
	
	