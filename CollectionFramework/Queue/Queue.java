
Queue : If we want to represent a group of objects
			Prior-to-processing
		Before sms message, we have to store all mobile numbers in some
		data structure, in order that messages should be delivered.
		Queue is the best choice
------------------------------------

Queue - 1.5 enhancement.
Child interface of List
FIFO FIRST IN FIRST OUT
				Collection(I)
						|
					Queue(I)
					|			|
	PriorityQueue   BlockingQueue
									-|
			              PriorityBlockingQueue
									-|
							LinkedBlockingQueue

LinkedList (as of 1.5)
implements List AND Queue.
(LinkedList based implementation of queue(FIFO))
-----------------------------------------------

Usually Queue follows FIFO order
BUT based on requirements, we can implement
our own priority order (PriorityQueue)

-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-

Queue Specific Methods:
-------------------------------
1. boolean offer(Object o)
	-add 1 object to the queue
	
2. Object poll()
	-remove (pop) and return head element(next to get service)
	(if queue is empty, returns null)
	
3. Object remove()
	-remove and return head BUT
	(if queue is empty, RE: NoSuchElementException)
	
4. Object peek()
	-return head element of queue (doesn't remove)
	(if queue is empty, returns null)
	
5. Object element()
	-returns head element of queue BUT
	(if queue is empty, RE: NoSuchElementException)
	
-=-==-=-=-=-=-=-=-=-=-=-=-=-=-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-==-=-=-=-=-=-=-=-=-=

PriorityQueue
------------------
1. Prior-to-processing
2. Default natural sorting order OR Customized sorting order
3. Insertion order not-preserved
4. Duplicates allowed 
5. Heterogeneous elements - DNSO - must be comparable
										    Otherwise - ClassCastException.
											CSO defined by Comparator - ok
6. null insertion- not allowed (not even as first element)

==========================================================

CONSTRUCTORS:
--------------------------

1. PriorityQueue q = new PriorityQueue(); -> 11, DNSO unless CSO

2. PriorityQueue q = new PriorityQueue(int initialCapacity)

3. PriorityQueue q = new PriorityQueue(int initialCapacity, Comparator c)
	(NO constructor can take Comparator only argument. Both must be custom)

4. PriorityQueue q = new PriorityQueue(SortedSet s) 

5. PriorityQueue q = new PriorityQueue(Collection c) 
