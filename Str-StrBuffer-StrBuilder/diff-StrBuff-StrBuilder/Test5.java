class Test5 {
	
	public static void main(String[] args) {
		
		System.out.println(mask("1234-5678-9012-3456"));
		
	}
	
	public static String mask(String creditCard) {
		
		String x = "xxxx-xxxx-xxxx-";
		// Line-1
		
	}
	
}

/*
	Which 2 code fragments should be used independantly to achieve masking
	of all but the last 4 digits of the card number?
	A)
	StringBuilder sb = new StringBuilder(creditCard);
	sb.substring(15,19);
	return x + sb;
	B)
	return x + creditCard.substring(15, 19);
	C)
	StringBuilder sb = new StringBuilder(x);
	sb.append(creditCard, 15, 19);
	return sb.toString();
	D)
	StringBuilder sb = new StringBuilder(creditCard);
	StringBuilder s = sb.insert(0, x);
	return s.toString();
*/

/*
	A) we aren't reassigning sb or concatenating, so the new obj is available for GC
		sb is pointing to the original cC number
	B) concats substring to end of x
	C) similar to previous example
	D) similar to A. Complete creditCard remains after insert at 0
*/