class Test {
	public static void main(String[] args) {
		
		StringBuffer s1 = new StringBuffer("Milton");
		StringBuffer s2 = new StringBuffer ("Milton");
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
		
	}
	
}

/*
class Test {
	public static void main(String[] args) {
		
		String s1 = new String("Milton");
		String s2 = new String ("Milton");
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
		
	}
	
}
*/

/*
	Equals method is inherited from Object class.
	Meant for reference (address) comparison.
	In String class equals method is overridden for content comparison.
	In StringBuffer equals method is not overridden, but inherited (Reference).
*/