/*
	How can we make StringBuffer immutable?
	A: Change the source code of every method in StringBuffer class
	Q: What is the significance of final here?
	A: You can make changes to the object here, but you can't reassingn the variable
	to any other object.
*/

class Test {
	
	public static void main(String[] args) {
		// will this make sb mutable?
		final StringBuffer sb = new StringBuffer("David ");
		sb.append("Lightman");
		System.out.println(sb);
		
		// this gives us a compile time error: Cannot assign a value to final var....
		sb = new StringBuffer("WOPR wants to play global thermo nuclear war");
	}
	
	/* Which of these are correct?
		1. final variable
		2. final Object
		3. immutable variable
		4. immutable Object
	*/
}