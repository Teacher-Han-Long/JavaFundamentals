public class MarxBro {
	String name;
	MarxBro (String name) {
		this.name = name;
	}
	
	MarxBro (){
		this(makeRandomName());
	}
	
	static String makeRandomName() {
		int x = (int) (Math.random() * 5);
		String name = new String[] {"Groucho","Chico","Harpo","Gummo","Zeppo"} [x];
		return name;										  
	}
	
	public static void main(String[] args) {
		MarxBro m1 = new MarxBro();
		System.out.println(m1.name);
		MarxBro m2 = new MarxBro("Rosco");
		System.out.println(m2.name);
	}
}
/*
Line 2 :  Declare a String instance variable name.
Line 3-5 :  Constructor that takes a String and assigns it to an
				instance variable name.
Line 7 :  Calling code might not know a Marx name, so MarxBros
             class will assign a random name. No-arg constructor
			 generates one by invoking makeRandomName();
Line 8 :  No-arg constructor invokes it's own overloaded constructor
			that takes a String (in effect calling it the same way it would
			be called if client code were doing a "new" to instantiate an 
			object, passing it a String for the name. The overloaded 
			invocation
			uses keyword "this", but uses it as though it were a method
			named 
			this(). So line 8 is simply calling the constructor on line 3, 
			passing it 
			a randomly selected String rather than a client code 
			chosen name.
Line 11 :  makeRandomName() is static  because you can't invoke an instance
			 (non-static) method (or access an instance variable) until after the
			 "super" constructor has run. AND since the "super" constructor will
			 be invoked from the constructor on line 3, rather than from the one
			 on line 7, line 8 can use only a static method to generate the name.
			 If we wanted all Marx brothers to have the same default name, then
			 line 8 could simply read  this("Harpo");  rather than calling the random
			 method returning a String.
Line 12 :  Generates random integer between 0 and 4.
Line 13 :  Creates a  new String object (just a single String instance), but we 
			  want the string to be selected randomly from a list. We don't have the
			  list, so we need to make it. In one line of code we
			 1. Declare a String variable name
			 2. Create a String array (anonymously-we don't assign the array to a var)
			 3. Retrieve the string at index [x] (x being random number generate on 
			     line 12) of the newly created String array.
			 4. Assing the string retrieved from the array to the declared instance 
			     variable name. This could also be written as :
				 String nameList = {"Groucho", "Chico", "Harpo", "Zeppo", "Gummo"};
				 String name = nameList[x];
Line 18 :  Invokes the no-arg version of the constructor(causing a random name
			  from the list to be passed to the other constructor).
Line 20 :  Invokes the overloaded constructor that takes a string representing 
			  the name.
The key point to get from this code example is in LINE 8.
Rather than calling super(), we're calling this()  which always means a call to
another constructor in the same class. Delaying the inevitable. Some con-
structor somewhere must make the call to super(). super() or this() must be
the first line in a constructor, so the compiler will not put a call to super() in
any constructor with a call to this().