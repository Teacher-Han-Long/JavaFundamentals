class ValueTest {
	public static void main(String[] args) {
		int a = 10; 
		System.out.println("a = " + a);
		int b = a;
		b = 30;
		System.out.println("a = " + a + " after change to b.");	
	}
}

/*
a and b are not referring to the same place in memory. They don't share a 
single value. They have identical copies.
*/

