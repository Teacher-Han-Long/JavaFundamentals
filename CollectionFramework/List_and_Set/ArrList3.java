import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.RandomAccess;


public class ArrList3 {
	
	/*
		When is ArrayList the worst choice?
		Insertion or deletion in the middle. (LinkedList is the best choice)
		Too many shift operations to insert an element in the middle
		The same goes for removal
		-------------------------------------
		l.add(1, "m");
		l.remove(1);
		
		It's the best choice for retieval operations, because of
		RandomAccessInterface
		
		
		
	*/
	public static void main(String[] args) {
		
		
		
		System.out.println(l1 instanceof RandomAccess);
		
		
	}
	
	
}