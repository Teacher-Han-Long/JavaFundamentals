
public class Test5 {
	
	public static void main(String[] args) {
		
		String s1 = "Java";
		String s2 = new String("Java");
		// Line -1
		{
			System.out.println("Equal");
		} 
		else 
		{
			System.out.println("Not Equal");
		}
	}
	
	/*
	To print "Equal", which line should be inserted in Line-1?
	a. String s3 = s2
		if (s1 == s3)
	b. if (s1.equalsIgnoreCase(s2))
	c. String s3 = s2;
		if (s1.equals(s3))
	d. if (s1.toLowerCase() == s2.toLowerCase())
	
	Because of toLowerCase(), a new object will be created in the heap,
	can't be == to s2
	*/
	
}