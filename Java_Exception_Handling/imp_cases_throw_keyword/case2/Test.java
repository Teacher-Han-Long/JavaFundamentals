class Test {
	public static void main(String[] args) {
		System.out.println(10/0);
		System.out.println("Oh, darlin', please belive me.");
    }
}


class Test2 {
	public static void main(String[] args) {
		throw new ArithmeticException("division by zero, dude");
		System.out.println("Where's my red stapler?");
	}
}