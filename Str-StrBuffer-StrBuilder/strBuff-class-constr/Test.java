/*
	lenth()
	capacity();
	a classroom with 20 people - length
	classroom can hold 100 - capacity
	Does not apply to String, because you can't alter the object
*/
class Test {
	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer(); 
		System.out.println(sb.capacity()); // 16
		sb.append("abcdefghijklmnop");
		System.out.println(sb.capacity()); // 16
		sb.append("q");
		System.out.println(sb.capacity()); // 34
		sb.append("1234567890123456");
		System.out.println(sb.capacity()); 
		sb.append("17");
		System.out.println(sb.capacity()); 
	}
	
	/*
		1. StringBuffer sb  = new StringBuffer();
			16 characters (default capacity)
			Once the 17th element is added, a new SB object will be created(internally)
			sb will point to that object, old object available for GC
			
			new capacity = (currCapacity + 1) * 2
									(16 + 1) * 2 = 34
									(34 + 1) * 2 = 70
	*/
	
}