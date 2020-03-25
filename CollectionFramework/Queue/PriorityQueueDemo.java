import java.util.PriorityQueue;
import java.util.Queue;


public class PriorityQueueDemo {
	public static void main(String[] args) {
		
		PriorityQueue pq = new PriorityQueue();
		System.out.println(pq.peek()); // null
		//System.out.println(pq.element()); // RE: NoSuchElementException
		
		for (int i = 0; i <= 10; i++) {
			pq.offer(i);
		}
		
		System.out.println(pq);
		System.out.println(pq.poll());
		System.out.println(pq);
		System.out.println(pq.poll());
		System.out.println(pq);
		System.out.println(pq.add(12));
		System.out.println(pq);
		System.out.println(pq.offer(13));
		System.out.println(pq);
	}
	/*
	Some operating systems/platforms
	won't provide proper support for thread priorities / PriorityQueue.
	That's why I'm getting unexpected output. A patch could be installed.
	*/
}