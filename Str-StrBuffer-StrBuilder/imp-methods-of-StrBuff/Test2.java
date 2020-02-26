class Test2 {
	
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("abcdefgh");
        sb.delete(2,5);
        System.out.println(sb); 	 
		sb.deleteCharAt(3);
		System.out.println(sb);
		sb.append(" reverse this!");
		sb.reverse();
		sb.insert(7, "what a mess!");
		System.out.println(sb);
		System.out.println(sb.length());
	}
	
}