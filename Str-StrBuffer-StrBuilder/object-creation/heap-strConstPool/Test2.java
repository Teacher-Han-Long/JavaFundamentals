class Test2 {
	public static void main(String[] args) {
		
		String s1 = new String("Spring");
		s1.concat("Fall");
		String s2  = s1.concat("Winter");
		s2.concat("Summer");
		
		System.out.println(s1);
		System.out.println(s2);
		
	}
}

/*
			Heap                        	    SCP
	============				============
	s1 -> Spring						Spring
	SpringFall							Fall
	s2 -> SpringWinter			Winter
	SpringSummerWinter		Summer
	
	o/p -> Spring
	o/p -> SpringWinter
*/