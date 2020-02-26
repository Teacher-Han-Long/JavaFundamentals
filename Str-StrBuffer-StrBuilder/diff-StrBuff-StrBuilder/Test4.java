class Test4 {
	
	public static void main(String[] args) {
		
		// What is the output of the 2 lines below?
		//System.out.println("Hello " + new StringBuilder("Java SE 8"));
		//System.out.println("Hello " + new MyString("Java SE 8"));
		
		// What is the output and why? Which toString() method is called?
		Test4 t4 = new Test4();
		System.out.println(t4);
		
	}
	
	// NOW, what is printed if we uncomment this toString() method?
	/* 
	public String toString() {
		return "Test object!";
	}
	*/
	
}

class MyString {
	
	String msg;
	public myString (String msg) {
		this.msg = msg;
	}
	
}

/*
	When trying to print any object reference, toString() will be called.
	If a class has that method, that version will be called. If not, Object class
	toString method will be called. That'll print  className@<hashcode>
	
	In String class, Buffer, Builder, wrapper, and Collection classes, 
	toString() is overridden
	
	Here we're concatinating, so the object becomes a String and the overridden
	String version is called:
	
class Test4 {
	
	public static void main(String[] args) {
		
		Test4 t4 = new Test4();
		System.out.println("Hello " + t4);
		
	}
	
}
	
	Practice:  override the toString() method in the MyString class
*/