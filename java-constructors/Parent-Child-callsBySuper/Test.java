/*
class P {
	
}

class C extends P {
	
}
//compiles fine
------------------------------

class P {
	P () {
		
	}
}

class C extends P {
	
}
//compiles fine
-------------------------------

class P {
	P (int i) {
		
	}
}

class C extends P {
	
}

//CE: 2 solutions
1.
class P {
	P (int i) {}
}

class C extends P {
	C () {
		super(10);
	}
}

2. No-Arg constructor in Parent. Highly recommended.
class P {
	P (int i) {
		
	}
	
	P () {
		
	}
	
}

class C extends P {
	C () {

	}
}

*/












