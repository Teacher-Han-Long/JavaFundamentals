class Test {
/**
  without throw keyword - ArithmeticException -
  main method is responsible to create and hand over Exception
  Object. Everything is happening internally.
  There is no handling code, so method is terminated.
  **/
  public static void main(String[] args) {
     System.out.println(10/0);
  }

}

class Test2 {
	/**
Created Exception Object explicitly with throw keyword.
new ArichmeticException("/by zero") --> creates new Object
throw --> Hand over created Exception Object to the JVM.
**/


 public static void main(String[] args) {
     throw new ArithmeticException("Division by zero, boss.");
 }

}