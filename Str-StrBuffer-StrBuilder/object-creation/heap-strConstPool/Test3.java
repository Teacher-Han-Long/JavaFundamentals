class Test3 {
	public static void main(String[] args) {
		
		String s1 = new String("You cannot change me");
		String s2 = new String("You cannot change me");
		System.out.println(s1 == s2);
		// false
		String s3 = "You cannot change me";
		System.out.println(s1 == s3);
		// false
		String s4 = "You cannot change me";
		System.out.println(s3 == s4);
		// true
		String s5 = "You cannot " + "change me";
		System.out.println(s4 == s5);
		/*
			If both are constants, compiler will perform operation
			ex. sout(10+20)  After compilation -> sout(30) no wait for RT
			true 
		*/
		String s6 = "You cannot ";
		String s7 = s6 + "change me";
		/* 
			If at least one is a var, operation will be performed at RT
			s6 -> scp, s7 -> heap
			false
		*/
		final String s8 = "You cannot ";
		String s9 = s8 + "Change me";
		System.out.println(s4 == s9);
		/*
			Final vars will be replaced by value at compile time only.
			Now, it's indentical to s5
			s9 points to "You cannot change me" in the scp
			true
		*/
	}
}