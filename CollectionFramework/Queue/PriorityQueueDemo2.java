import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;


public class PriorityQueueDemo2 {
	
	//DEMO FOR CUSTOMIZED PRIORITY
	public static void main(String[] args) {
		
		PriorityQueue<String> pq = new PriorityQueue<>(15, new MyComparator());
		pq.offer("A");
		pq.offer("Z");
		pq.offer("L");
		pq.offer("B");
		System.out.println(pq);
	}
	/*
		Some operating systems/platforms
		won't provide proper support for thread priorities / PriorityQueue.
		That's why I'm getting unexpected output. A patch could be installed.
	*/
}

class MyComparator implements Comparator {
	
	public int compare(Object obj1, Object obj2) {
		String s1 = (String) obj1;
		String s2 = obj2.toString();
		return s2.compareTo(s1);
	}
	
}