import java.util.Vector;


public class VectorDemo1 {
	
	public static void main(String[] args) {
		
		Vector v = new Vector();
		System.out.println(v.capacity());
		for (int i = 0; i < 10; i++) {
			v.addElement(i+1);
		}
		System.out.println(v);
		System.out.println(v.capacity());
		v.addElement("A");
		System.out.println(v.capacity());
		
		System.out.println(v);
		
		// Vector v = new Vector(int initialCapacity, int incrementalCapacity)
		Vector v2 = new Vector(10, 5);		//-->  capacity is 10
		System.out.println(v2.capacity());	//-->  10
		System.out.println(v2);					//-->  []
		for (int i = 0; i < 15; i++) {
			v2.addElement(i+1);
		}
		System.out.println(v2.capacity());	//--> 15
		System.out.println(v2);					//--> [1....15]
		v2.addElement("UhOH");				//--> increases capacity by 5
		System.out.println(v2.capacity());	//--> 20
		System.out.println(v2);					//--> [1.......UhOH]
		
	}
	
}