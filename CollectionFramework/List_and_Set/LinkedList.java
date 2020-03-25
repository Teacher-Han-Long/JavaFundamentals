        ========================================================
		
		LinkedList Constructors
		-------------------------------
		
		1. LinkedList l = new Linked();
		2. LinkedList l = new LinkedList(Collection c);
		
		
		
		========================================================
		LinkedList implements:
		Serializable / Clonable
		but not RandomAccess
		BEST choice for insertion or deletion in the middle middle middle
		WORST choice if the frequent operations are retrieval operations
		
		Arrays - 
		Stacks and Queues
		---------------------------
		LinkedList - 
		Stacks -> LIFO
		Queues -> FIFO
		
		LinkedList class
		COMMONLY USED TO IMPLEMENT:
		to provide support for this, 
		LinkedList class defines these specific methods:
		addFirst();
		addLast();
		getFirst();
		getLast();
		removeFirst();
		removeLast();
		