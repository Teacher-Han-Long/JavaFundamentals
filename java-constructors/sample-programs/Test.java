class Test {
	Test() {
		System.out.println("This is a test.");
	}
	
	public static void main(String[] args) {
		Test t1 = new Test();
		Test t2 = new Test();
		Test t3 = new Test();
	}
}

// Constructor runs every time a new object is created
/* o/p ->  This is a test.
               This is a test.
			   This is a test.
*/ con	