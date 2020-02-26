class Test3 {
	
	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder("Kthulu");
		sb.delete(0, sb.length());
		System.out.println(sb);
		
	    sb = new StringBuilder("Kthulu");
		sb.delete(0, sb.length());
		System.out.println(sb.length());
		/*
			Which statement will emtpy the contents of a StringBuilder var named sb?
			(length() should be zero)
			
			A) sb.deleteAll();                  // cannot find symbol (SB has no such method)
			B) sb.delete(0, sb.size);		// ""  Only length and capacity, no size(Collect.)
			C) sb.delete(0, sb.length());	// ding ding ding
			D) sb.removeAll();				// "" (Collections)
			
			
			delete(begin, end minus 1)
					(0, length())  =  0 to length -1      "Kthulu" (0, 5)
		*/
		
	}
}