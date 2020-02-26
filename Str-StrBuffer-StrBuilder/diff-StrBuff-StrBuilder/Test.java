class Test {
	
	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder(5); // capacity of 5
		String s = ""; 										// empty String
		
		if (sb.equals(s)) {									// sb(Object)version equals() called
			System.out.println("Match1");
		} else if (sb.toString().equals(s.toString())) {	// empty String Obj. created
			System.out.println("Match2");
		} else {
			System.out.println("No match");
		}
	}
	
}

/*
	What is the result?
	A) Match1
	B) Match2
	C) No match
	D) NullPointerException is thrown at runtime

	In StringBuilder equals() is not overridden. Object class method is executed.
	If ARGUMENTS ARE OF A DIFFERENT TYPE, then equals method returns
	FALSE.
	
	String class equals() meant for content comparison. 
	Hence sb.toString().equals()   is meant for content comparison.
	Hence    sb.toString().equals(s.toString())    returns true.

*/