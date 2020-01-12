class Bar {
	int barNum = 28;
}

class FooBar {
	Bar myBar = new Bar();
	void changeIt(Bar myBar) {
	     	myBar.barNum = 99;
	     	System.out.println("myBar.barNum in changeIt =" 
				+ myBar.barNum);
		myBar = new Bar()
		myBar.barNum = 420;
		System.out.println("myBar.barNum in changeIt is now "
				+ myBar.barNum);
		}
	public static void main(String[] args) {
		FooBar f = new FooBar();
		System.out.println("f.myBar.barNum = " + f.myBar.BarNum);
		f.changeIt(f.myBar);
		System.out.println("f.myBar.barNum after changeIt = "
				+ f.myBar.barNum);
	}
}
