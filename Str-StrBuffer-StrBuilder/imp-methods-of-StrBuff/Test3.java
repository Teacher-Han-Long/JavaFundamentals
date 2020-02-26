class Test3 {
	
	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer("biryani plate");
        sb.setLength(8);
        System.out.println(sb); 	 
		StringBuffer sb2 = new StringBuffer();
		System.out.println(sb2.capacity());
		sb2.ensureCapacity(1000);
		System.out.println(sb2.capacity());
		sb2.append("XYZ");
		sb2.trimToSize();
		System.out.println(sb2.capacity());
	
	}
	
}