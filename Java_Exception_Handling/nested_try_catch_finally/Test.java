class Test {
	public static void main(String[] args) {

		try {
          System.out.println("Outer try");

		  try {
		  	System.out.println("Inner try");
		  	System.out.println(10/0);
		  } catch(ArithmeticException ae) {
		  	System.out.println("Inner catch block");
		  }
		  System.out.println("After Inner try-catch");

		} catch (Exception e) {
            System.out.println("Outer catch");
		} finally {
			System.out.println("Outer finally");
		}

	}
}

/**
o/p --->  Outer try
          Inner try
          Inner catch block
          After Inner try-catch
          Outer finally
**/