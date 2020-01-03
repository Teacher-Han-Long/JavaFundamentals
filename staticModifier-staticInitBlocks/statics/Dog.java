//redefining vs overriding a static method

class Animal {
	static void doStuff () {
		System.out.print("a ");
	}
}

class Dog extends Animal {
	static void doStuff () {			//redefining
		System.out.println("d ");    //not overriding
	}
	
	public static void main(String[] args) {
		Animal[] a  = { new Animal(), new Dog(), new Animal() };
		for (int x = 0; x < a.length; x++) {
			a[x].doStuff();     //invoke static
		}
	 Dog.doStuff();        //invoke using class name
	}
}

/*
The syntax a [x].doStuff() is a shortcut (a syntax trick) -
The compiler will substitute something like Animal.doStuff() instead.
Notice also we can invoke a static method using the class name.
