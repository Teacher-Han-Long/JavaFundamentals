interface FrogBoilable {
	static int getCtoF (int cTemp) {
		return (cTemp * 9 / 5) + 32;		        //interface static method
	}
	default String hop() { return "Hopping"; }  //interface default metho
}

public class DontBoilFrogs implements FrogBoilable {
	public static void main(String[] args) {
		new DontBoilFrogs().go();
	}
	
	void go() {
		System.out.println(hop());                  				// 1. works for default method
		//System.out.println(getCtoF(100));     				// 2. cannot find symbol
		System.out.println(FrogBoilable.getCtoF(100));  // 3. works for static method
		DontBoilFrogs dbf = new DontBoilFrogs();
		//System.out.println(dbf.getCtoF(100));                // 4. cannot find symbol
	}
}

// 1. a legal invocation of default method
// 2. illegal attempt to invoke the interface's static method
// 3. the ONLY legal way to invoke an interface's static method
// 4. is another illegal attempt to invoke an interface's static method

