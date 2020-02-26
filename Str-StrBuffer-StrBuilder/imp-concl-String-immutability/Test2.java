// Create our own immutable class

// If there's a change in content, a new obj is created
// If no change in content, object will be reused
final class Test {		// no one can override / change content
	
	private int i;
	Test (int i) {
		this.i = i;
	}
	
	// makes Test class immutable - Every method inside of String class
	// is implemented like this
	public Test modify(int i) {
		if (this.i == i) {   			// if current object = int i
			return this;
		} else {
			return new Test(i);
		}
	}
	
	
	public static void main(String[] args) {
		
		Test t1 = new Test(10);
		Test t2 = t1.modify(100);	// creates a new object
		Test t3 = t1.modify(10);  	// pts to the same object 
		
	    System.out.println(t1 == t2);  // false
		System.out.println(t1 == t3);  // true
	}
}
