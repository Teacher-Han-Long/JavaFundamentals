class Frog {
	static int frogCount; //declare and initialize to zero (or not, no need. It's static)
										//static var
	public Frog () {
		frogCount++;       //modify value in constructor
	}
	
	public static void main(String[] args) {
		new Frog();
		new Frog();
		new Frog();
		
		System.out.printf("We now have %d frogs %n", frogCount);
	}
	
}

/*
If frogCount isn't static......CE:
The JVM doesn’t know which Frog object’s frogCount you’re trying to access. The problem is
that main() is itself a static method and thus isn’t running against any particular instance of the
class; instead it’s running on the class itself. A static method can’t access a nonstatic (instance)
variable because there is no instance! That’s not to say there aren’t instances of the class alive on
the heap, but rather that even if there are, the static method doesn’t know anything about them.
The same applies to instance methods; a static method can’t directly invoke a nonstatic method.
Think static = class, nonstatic = instance. Making the method called by the JVM ( main() ) a static
method means the JVM doesn’t have to create an instance of your class just to start running code.
//what's wrong down here?
                |
			   \ /
                
class Foo {
	int x = 3;
	float y = 4.3f;
	public static void main(String[] args) {
		for ( int z = x; z < ++x; z--, y = y+x ) {
			//complicate looping and branching code
		}
	}
}
*/