/*
class Frog {
	
	int frogSize;
	public int getFrogSize () {
		return frogSize;
	}
	public Frog (int s) {
		frogSize = s;
	}
	
	public static void main(String[] args) {
		Frog f = new Frog(33);
		System.out.printf("Size of Frog: %d%n", f.getFrogSize());
	}
	
}
Preceding code :
instantiates a Frog, assigns it to a reference variable f
uses f reference to invoke a method on that instance 
(a Frog object on the heap)
*/

//accessing a static method/variable
class Frog {
	private static int frogCount;    //static variable
	static int getCount() {      //static getter method
		return frogCount;
	}
	public Frog () {						//modify value in constructor	
		frogCount++;
	}
}

public class TestFrog {
	
	public static void main(String[] args) {
		new Frog();
		new Frog();
		new Frog();
		System.out.printf("From static Frog: %d %n", Frog.getCount()); //static context
		new Frog();
		
		new TestFrog().go();
		Frog f = new Frog();
		System.out.printf("Use reference variable: %d %n", f.getCount()); //refernce variable
	}
	
	
	
	void go() {
		System.out.printf("From instance : %d %n", Frog.getCount()); //instance context
	}
}

/*
line 46 is using an object referenc to access a static variable.  We're using a specific Frog 
instance to access the static method. The static member is still unaware of the particular
instance used to invoke the static member.        The compiler knows the reference variable f
is of type Frog. The Frog class static method is run with no awareness or concern for the Frog 
instance at the other end of the f reference. 







