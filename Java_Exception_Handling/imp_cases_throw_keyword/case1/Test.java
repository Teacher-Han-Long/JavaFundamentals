class Test {
  
  static ArithmeticException e = new ArithmeticException();
  public static void main(String[] args) {
    throw e;
  }

}


class Test2 {

  static ArithmeticException e;
  public static void main(String[] args) {
  	throw e;
  }

}