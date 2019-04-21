class Test {

	public static void main(String[] args) {
        doStuff();
    }

    public static void doStuff(){
    	doMoreStuff();
    }

    public static void doMoreStuff() {
    	System.out.println(10/0);
    }

}

/**
If an exception arises in a method, that method
is responsible for creating Exception object (with
the help of the JVM) by including
1. Name of Exception (ArithmeticException)
2. Description (Division by zero)
3. Stack Trace (location)

o/p -->  Exception in thread main: 
java.lang.ArithmeticException: division by zero
at Test.doMoreStuff()
at Test.doStuff()
at Test.main()

We create an Exception Object and hand it over to the 
JVM, which asks each method if it has handling code. If
not, JVM terminates method abnormally and removes it 
from the stack. It finally reaches "main". Main was called
by the JVM, which maintains an assistant, 
DefaultExceptionHandler- prints info to the console and 
terminates the program.
**/