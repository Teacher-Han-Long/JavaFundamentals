/*
Static blocks-
When are they required?
At time of class loading, we want to load class libraries.
We have to define this activity inside a static block.

class Test {
    static {
		System.loadLibrary("native library path");
	}
}

ex. 1
public class Object {
	private static native void registerNatives();
	static {
		registerNatives();
	}
}

ex. 2
JDBC
1. load driver class
2. get Connection Object
3. prepare Statement Object
4. execute Query
5. use ResultSet

class DbDriver {
	static {
		Registers this driver w/DriverManager.
		we're not responsible for this activity
	}
}
after loading every DbDriver class we haev to register driver class 
w/DriverManager. Inside DBDClass there's a static block to perfom this activity.

Within a class we declare any # of static blocks.
All executed from top to bottom.
*/