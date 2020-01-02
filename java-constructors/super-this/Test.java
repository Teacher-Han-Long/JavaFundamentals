/*
class Test {
	Test () {
		System.out.println("Hello Squirrel");
		super();
	}
}
//CE: call to super must be first statement in constructor

class Test {
	Test () {
		super();
		this();
		System.out.println("Hey hey hey");
	}
}
// CE: call to this must be first line in constructor

class Test {
	public void m1() {
		super();
		System.out.println("Method");
	}
}
// CE: call to super must be first statement in constructor (only)
Constructor can be called directly only from another constructor,
not from a method.
------------------------------------------------------------------
super()/this()
1. only inside constructors
2. should use only in the first line
3. only one, not both similtaneouly
*/


/*
super() / this()           
vs  
super / this (keywords)
1. keywords - refer to super class and current class
    instance members
2. can use anywhere but static areas
3. can use any number of times  
-----------------------------------------
class P {
	String s = "Parent var";
}

class C {
	String s = "Child var";
	public void m1() {
		System.out.println(s); //Child var
		System.out.println(this.s); //Child var
		System.out.println(super.s); //Parent var
	}
}

class Test {
    public static void main(String[] args) {
		C c = new c();
		c.m1();
	}
}
 
!!!!!!!!!!! super and this keywords
 refer to objects/instance vars
 can be used anywhere but 
 inside static area. If the above m1() is static,
 CE: non-static var cannot be referenced from static context
*/




























