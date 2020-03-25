import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetDemo3 {
	
	
	public static void main(String[] args) {
		TreeSet t = new TreeSet(new MyComparator());
		t.add(30);
		t.add(55);
		t.add(393);
		t.add(17);
		System.out.println(t);
	}
	
}

class MyComparator implements Comparator {
	
	public int compare(Object obj1, Object obj2) {
		
		Integer int1 = (Integer) obj1;
		Integer int2 = (Integer) obj2;
		
	    if (int1 < int2) {
			return +1;		
		} else if (int1 > int2) {
			return -1;		
		} else {
			return 0;
		}
		
	}
	
}

/*
	public int compare(Object obj1, Object obj2) {
	
		Integer I1 = (Integer) obj1;
		Integer I2 = (Integer) obj2;
		
		return I1.compareTo(I2);
		
		return -I1.compareTo(I2);
		
		return I2.compareTo(I1);
		
		return -I2.compareTo(I1);
		
		return +1;		  
		
		return -1;		 	
		
		return 0;		   
					

*/


