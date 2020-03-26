import java.util.Arrays;
import java.util.List;

public class ArraysAsListDemo {

	public static void main(String[] args) {
		
		String[] s = { "A", "Z", "B" };
		System.out.println(Arrays.toString(s));
		List l = Arrays.asList(s);
		System.out.println(l);
		
		s[0] = "K";
		System.out.print(l);
		System.out.println();
		
		l.set(1, "L");
		for (String s1 : s) System.out.println(s1);
		
		// l.add("Mel");	// UsOE
		// l.remove(2);	// UsOE
		// l.set(1, new Integer(10)); // ASE
	}
		

}