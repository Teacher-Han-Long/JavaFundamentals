import java.util.Stack;
class StackDemo {
	
	/*
		Stack class
1. Child class of Vector

2. All the same, inherited from Vector
	except it is a specially designed class for
	LIFO

3. One constructor
	Stack s = new Stack()

4. Methods:

	Object push(Object o)	-inserts object onto stack
	
	Object pop()		-removes and returns top of stack
	
	Object peek()	-return top of stack without removal
	
	boolean empty() -returns true if the stack is empty
	
	int search(Object o) 	- returns offset if available else, -1
	(offset - number from top of stack)
		offset	value	index
		---------------------------
		1			C			2
		2			B			1
		3			A			0
		search("A"); --> 3
		search("D");--> -1
	*/
	public static void main(String[] args) {
		
		Stack s = new Stack();
		s.push("A");
		s.push("B");
		s.push("C");
		System.out.println(s);
		System.out.println(s.search("A"));
		System.out.println(s.search("Z"));
		
	}
}