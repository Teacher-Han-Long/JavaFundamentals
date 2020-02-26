class Test2 {
	public static void main(String[] args) {
		System.out.println();
		String s5 = "";
		System.out.println(s5.isEmpty()); // true
		String s5a = " ";
		System.out.println(s5a.isEmpty()); // false
		
		String s6 = "Harold and Maude Go To White Castle";
		System.out.println(s6.length()); // -> 35
		String s6a = " ";                        // -> 1
		String s6b = "";							// -> 0
		System.out.println(s6a.length());
		System.out.println(s6b.length());
		
		String s7 = "ababab";
		System.out.println(s7.replace('a', 'b')); // -> bbbbbb
		
		String s8 = "abcdefg";
		System.out.println(s8.substring(3)); // -> defg
		String s9 = s8;
		System.out.println(s9.substring(3, 6)); // -> def
		
		String s10 = "Red Stapler";
		System.out.println(s10.indexOf('S')); // -> 4
		
		String s11 = "It's Red's Stapler";
		System.out.println(s11.lastIndexOf('s')); // -> 9
		
		System.out.println();
	}
}