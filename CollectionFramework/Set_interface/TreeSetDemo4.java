import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetDemo4 {
	
	
	public static void main(String[] args) {
		
		TreeSet t = new TreeSet(new MyComparator());
		
		t.add(new StringBuffer("Larry"));
		t.add(new StringBuffer("Larry Fine"));
		t.add(new StringBuffer("Curly"));
		t.add(new StringBuffer("Curly Joe"));
		t.add(new StringBuffer("Moe"));
		t.add(new StringBuffer("Moses"));
		t.add("Larry F");
		t.add(76);
		
		
		System.out.println(t);
	
	}
	
}

class MyComparator implements Comparator {
	
	public int compare(Object obj1, Object obj2) {
		String s1 = obj1.toString();
		String s2 = obj2.toString();
		int I1 = s1.length();
		int I2 = s2.length();
		
		if(I1 < I2)
		{
			return -1;
		}
		else if(I1 > I2)
		{
			return 1;
		}
		else
		{
			//return s1.compareTo(s2);
			return 0;
		}	
		
		
		
	}
}