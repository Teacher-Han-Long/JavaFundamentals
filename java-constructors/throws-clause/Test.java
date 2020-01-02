import java.io.*;

class P {
	P () throws IOException {
		
	}
}

class C extends P {
	
}

/*
CE: unreported exception IOException in default constructor

we have to explicitly write the child's constructor
2 ways for a method- try/catch   OR   throws (delegate)
First line in constructor MUST be super() or this()   
SO  
If we try a try/catch block we get a CE:

class C extends P {
	C () throws IOException {
		super();
	}
}

class C extends P {
	C () throws Exception {
		super();
	}
}

If Parent class throws checked exception, Child class constructor must throw same
checked exception or it's parent
*/