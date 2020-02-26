
/*
	Once we create (String) Object, we can't change it's content
	If we do, a new object will be created for them
	String s1 = new String("durga");
	String s2 = s1.toUpperCase();
	String s3 = s1.toLowerCase();
	Sout(s1 == s2);
	Sout(s1 == s3);
	
	HEAP                          SCP
	----------------------------------------
	durga							durga
	DURGA
	
	s1,s3 pt to durga in the HEAP.
	(WHY NOT SCP durga?) RUNTIME!
	s2 pts to DURGA
	o/p -> false, true

*/

// another
class Test {
	public static void main(String[] args) {
		String s1 = "durga";
		String s2 = s1.toString();
		String s3 = s1.toLowerCase();
		String s4 = s1.toUpperCase();
		System.out.println(s1 == s2);
		System.out.println(s1 == s3);
		System.out.println(s1 == s4);
	}
}
/*
	HEAP                            SCP
	-----------------------------------------
	DURGA						durga
	
	s1,s2,s3 all point to SCP durga
	s4 pts to new object DURGA in HEAP
	(runtime operation)
	o/p -> true, true, false
*/