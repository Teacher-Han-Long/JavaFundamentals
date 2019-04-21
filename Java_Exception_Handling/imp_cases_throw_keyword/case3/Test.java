class Test {
    public static void main(String[] args) {
		throw new Test();
	}
}

class Test2 extends RuntimeException {
    public static void main(String[] args) {
		throw new Test();
	}
}