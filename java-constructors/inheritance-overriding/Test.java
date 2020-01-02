/*
class P {
	P () {
		
	}
}

class C {
	C (int i) {
		
	}
}

class Test {
	public static void main(String[] args) {
	   C c = new C();
	}
}

CE: inheritance/overriding not applicable to constructors
Only methods.
By default, the no-arg constructor in P is not available to C.
*/

/* 
CONSTRUCTORS APPLICABLE TO ABSTRACT CLASSES 
abstract class Test {
	int x;
	Test (int x) {
		this.x = x;
	}
}
*/

/*
CONSTRUCTORS NOT APPLICABLE TO INTERFACES
CE: several compile time errors
interface Test {
	Test () {
	   The purpose of constructors is to perform initialization of
	   instance variables.
		Every variable in an interface is public static final
		There is no need for instance variable initialization in interfaces.
	}
}
*/
