/*
class Test {
	public static void m1() {
		m2();
	}
	public static void m2() {
		m1();
	}
	
	public static void main(String[] args) {
		//code compiles fine, but we get a runtime error
		//Exception in thread main, stack overflow error
		m1();
		//This line below only, code compiles and runs fine
		System.out.println("Would you like to play a game?");
		
	}
}
recursive method call is always a runtime error
*/

class Test {
	Test () {
		this(10);
	}
	
	Test (int i) {
		this();
	}
	
	public static void main(String[] args) {
		System.out.println("Callilng Dr. Fine, Dr. Howard...");
	}
}

/* 
This code will not compile.  If there is any possibility of recursive 
CONSTRUCTOR call, CE: Recursive constructor invocation
/*