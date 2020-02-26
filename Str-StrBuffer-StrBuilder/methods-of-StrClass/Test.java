class Test {
	public static void main(String[] args) {
		
		String s = "Jelly Roll";
		System.out.println(s.charAt(3)); 
		//System.out.println(s.charAt(30)); // RE: StringIndexOutOfBoundsException
		
		String s2 = "Me and ";
		s2 = s.concat("My Gal"); 
		//s2 = s2 + "My Gal"; 
		//s2 += "My Gal"; 
		System.out.println(s2); // -> Me and My Gal
		
		String s3 = "Ebony";
		System.out.println(s3.equals("ebony"); //-> false
		System.out.println(s3.equals("Ebony"); //-> true
		System.out.println(s3.equals("Ivory");  //-> false
		// check content including case
		
		String s4 = "Ebony";
		System.out.println(s4.equalsIgnoreCase(ebony)); //-> true
	}
}