/*
3 places in a class you can put code to perform operations
1 . methods
2. constructors
3. initialization blocks
Static init blocks - run once when the class is first loaded
Instance init blocks - run whenever an instance is created (similar to constructors)
								(after super() constructors run)

-init blocks execute in the order in which they appear.
-Static init blocks run once, when the class is first loaded.
-Instance init blocks run every time a class instance is created.
-Instance init blocks run after the constructor's call to super().
*/

class Init {
	Init (int x) { System.out.println("1-arg const"); }
    Init () { System.out.println("no-arg const"); }
	static { System.out.println( "1st static init"); }
	{ System.out.println("1st instance init"); }
	{ System.out.println("2nd instance init"); }
	static { System.out.println("2nd static init"); }
	
	public static void main(String[] args) {
		new Init();
		new Init(7);
	}
}

//1st static init
//2nd static init
//1st instance init
//2nd instance init
//no-arg const
//1st instance init
//2nd instance init
//1-arg const

//By convention, init  blocks appear at top of class file, near constructors
