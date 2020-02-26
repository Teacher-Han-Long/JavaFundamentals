
public class Test2 {
	
	public static void main(String[] args) {
		
		String str = " ";
		str.trim();
		System.out.println(str.equals("")+" " + str.isEmpty());
		
	}
	
	/*
	Result?
	a. true false
	b. true true
	c. false true
	d. false false
	
	Only a new object will be created, but no reference var, so it's
	available for Garbage Collection
	*/
	
}