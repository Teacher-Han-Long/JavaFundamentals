class Foo {

	private String name;
	

	void bar() {
		Foo f = new Foo();
		doStuff(f);
		System.out.println(f.name);
 	}

	void doStuff(Foo g) {
		g.setName("Bubba");
		g = new Foo();
	}
	
	void setName(String name) {
		this.name = name;
	}


	public static void main(String[] args) {
		Foo f1 = new Foo();
		f1.bar();
	}
}
	

