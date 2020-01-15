class Reassign_Ref_Var {
	public static void main(String[] args) {
		StringBuffer s1 = new StringBuffer("I say hello.");
		StringBuffer s2 = new StringBuffer("You say goodbye.");
		System.out.println(s1);
		// StringBuffer "I say hello" is NOT eligible at this point
		s1 = s2;  // redirects s1 to refer to the "You say goodbye" object
		// Now the StringBuffer "I say hello." is eligible for collection
	}
}


//Decoupling a reference variable to refer to another object

class Reassign_Ref_Var {
	public static void main(String[] args) {
		StringBuffer s1 = new StringBuffer();
		StringBuffer s2 = new StringBuffer();
		
		s1 = new StringBuffer();
        s2 = s1;		
	}
}
