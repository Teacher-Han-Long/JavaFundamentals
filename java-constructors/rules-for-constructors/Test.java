// Name of constructor must match class name
// No return type. Compiler treats it as a method 
// Method can have same name as class
// public, <default>, protected, private allowed modifiers
// no other modifiers allowed

class Test {
	
	void Test() {
		System.out.println("This is allowed, but bad naming.");
	}
	
	Test () {
		
	}
}