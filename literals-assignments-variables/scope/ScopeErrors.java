class ScopeErrors {
	int x = 5;
	public static void main(String[] args) {
		//x++; /* won't compile, x is an instance var*/

		ScopeErrors s = new ScopeErrors();
		s.go();
	}

	void go() {
		int y = 5;
		go2();
		y++;  //once go() completes, y is back in scope
	}

	void go2() {
		//y++; /*won't compile. y is local to go();*/
	}

	void go3() {
		for (int z = 0; z < 5; z++) {
			boolean test = false;
			if(z == 3) {
				test = true;
				break;
			}
	
		}
	   System.out.print(test);  //'test' is an ex-variable
				    //it has ceased to be. Bereft of life!
	}
}

/*
  When go2() is executing, go() variables are alive, but out of scope.
  When complete, go2() is removed from the stack, and go() resumes exec.
  All of it's vars are back in scope.
 */
