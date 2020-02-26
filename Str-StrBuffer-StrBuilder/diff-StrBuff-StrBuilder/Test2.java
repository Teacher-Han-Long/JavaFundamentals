class Test2 {
	
	public static void main(String[] args) {
		
		StringBuilder sb1 = new StringBuilder("Kthulu");
		String str1 = sb1.toString();
		// insert code here - line 1
		System.out.println(str1 == str2);
		
		/*
			Which code could be inserted in line 1 to produce true
			A) String str2 = str1;
			B) String str2 = new String(str1);
			C) String str2 = str1.toString();
			D) String str2 = "Durga"
			
			
			A) creates new str1 obj, points str2 at same new object created for str1
			B) creates new String obj, with contet of str1 ("Kthulu"),str2 points at that
			C) "" another new object (sb1.toString()) and str2 points at that
			D) "" an object in the SCP, str2 points at that
				original toString() object is in the HEAP area
		*/
		
	}
}