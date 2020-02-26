// Important Constructors of String

class Test {
	public static void main(String[] args) {
		
		//empty String
		//String s1 = new String();
		//String s2 = new String(String literal);

		// StringBuffer/Builder are brothers to String, sm diffs.
		//for a given StringBuffer, create a new String obj.
		//String s3 = new String(StringBuffer sb);
		//String s4 = new String(StringBuilder sb);
		
		// String is an array of chars
		// String s5 = new String(Char[] ch);
		char [] ch = {'j', 'a', 'v', 'a'};
		String s5  = new String(ch);
		System.out.println(s5); // o/p -> java
		
		//String s6 = new String(Byte[] b);
		// These will be converted to unicode vals, "abcd"
		byte[] b = {97, 98, 99, 100};
		String s6 = new String(b);
		System.out.println(s6);
		
	}
}