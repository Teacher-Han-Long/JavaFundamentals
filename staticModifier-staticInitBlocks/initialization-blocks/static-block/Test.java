//Must have this line - System.exit(0);
//Before 1.7, can print to the console
//1.7 on, must have a main method
/*
class Test {
	static {
		System.out.println("I can print.");
		//System.exit(0);
	}
	
	public static void main(String[] args) {}
}
*/

class Test {
	static int count = 0; 
	{ count++; }
	
	public static void main(String[] args) {
		Test t1 = new Test();
		Test t2 = new Test();
		Test t3 = new Test();
	    System.out.println(Test.count);
	}
} 

// O/P -> 3