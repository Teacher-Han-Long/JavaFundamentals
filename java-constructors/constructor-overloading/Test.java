class Test {
	Test (Double d) {
		this(10);
		System.out.println("Double-args");
	}
	
	Test (int i) {
		this();
		System.out.println("Int-Args");
	}
	
	Test () {
		System.out.println("No-Args");
	}
	
	public static void main(String[] args) {
		Test t1 = new Test(10.5);
		//No-Args
		//Int-Args
		//Double-Args
		Test t1 = new Test(10);
		//No-Args
		//Int-Args
		Test t1 = new Test();
		//No-Args
	}
}