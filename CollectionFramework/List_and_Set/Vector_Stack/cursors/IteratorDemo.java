import java.util.*;

class IteratorDemo {

	public static void main(String[] args) {

		ArrayList l = new ArrayList();
		for (int i= 0; i <= 10; i++) {
				l.add(i);
		}
		System.out.println(l); //--> 0,1,2,3....10

		//get Objects one by one from the Collection
		Iterator itr = l.iterator();
		while (itr.hasNext()) {
				Integer I = (Integer) itr.next();
				if (I % 2 == 0) {
						System.out.println(I);
				} else {
						itr.remove();
				}
		}
		System.out.println(l);
	}
	
	/*
		Limitiations of Iterator:
		-----------------------------
		1. SINGLE DIRECTION CURSORS(not BI)- only forward
		2. read / remove operations only 
			- no replace / addition of new objects.


				To overcome these limitations:
				----------------------------------------
				ListIterator(I)
	*/

}
