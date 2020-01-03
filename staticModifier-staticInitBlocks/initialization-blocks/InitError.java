class InitError {
	static int [] x = new int[4];
	static { x[4] = 5; }   //bad array index
	
	public static void main(String[] args) {
		
	}
}

//JVM throws an ExceptionInInitializerError
/*
Exception in thread "main" java.lang.ExceptionInInitializerError
Caused by: java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4
at InitError.<clinit>(InitError.java:3)
*/