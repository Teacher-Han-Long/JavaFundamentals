public class Test {
	
	public static void main(String[] args) {
		
		String ta = "A";
		ta = ta.concat("B");
		String tb = "C";
		ta=ta.concat(tb);
		ta.replace('C', 'D');
		ta = ta.concat(tb);
		System.out.println(ta);
		
	}
	
	/*
	What is the result?
	1.ABCD
	2.ACD
	3.ABCC
	4.ABD
	5.ABDC
	*/
	
}