/*
Compiler generates default constructor if
we do not provide one.
Default and custom will not exist in the same class.
Abstract classes also must have constructors.
Default constructor is always a no-arg constructor.
No-arg constructor is not necessarily default constructor.
Default constructor access modifier is always the same as
the class modifier (public or default).
Default constructor has one line of code, a no arg call to
 super()  (parent class constructor).
*/

/*
Programmer's code /  Compiler's code

P
class Test {
	
}
C
class Test {
	Test () {
		super();
	}
}
---------------------------------------------------
P
public class Test {}
C
public class Test {
	public Test () {
		super();
	}
}
----------------------------------------------------
P
class Test {
  void Test() {}  
}
C
class Test {
	class Test () {
		super();
	}
	void Test() {}
}
----------------------------------------------------
P
class Test {
	Test () {
		
	}
}
C
class Test {
	Test () {
		super();  //1st line must be super() or this()
	}
}
--------------------------------------------------------
P
class Test {
	Test (int i) {
		this();
	}
	Test () {
		
	}
}
C
class Test {
	Test (int i) {
		this();
	}
	Test () {
		super();
	}
}
---------------------------------------------------------
P
class Test {
	Test (int i) {
		super();
	}
}
C 
//Compiler is happy. No need to generate any new code.






















