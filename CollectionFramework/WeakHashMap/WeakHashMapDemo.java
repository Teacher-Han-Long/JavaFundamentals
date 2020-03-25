import java.util.HashMap;
import java.util.WeakHashMap;


public class WeakHashMapDemo {
	
	public static void main(String[] args) throws InterruptedException {
		
		WeakHashMap m = new WeakHashMap();
		Temp t = new Temp();
		m.put(t, "Powdered Toast Man");
		System.out.println(m);
		t = null;
		System.gc();
		Thread.sleep(5000);
		System.out.println(m);
		
	}
	
}

class Temp {
	public String toString() {
		return "Temp";
	}
	
	public void finalize() {
		System.out.println("Finalize() method called");
	}
}

/*
	Before destroying an Object, GarbageCollection calls finalize method() to perform
	cleanup activities.
	BUT HashMap dominates Garbage Collection
	Thread sleeps for some time - GC can't destroy the object because it's assoc.
	with HashMap
	
	public class WeakHashMapDemo {
	
	public static void main(String[] args) throws InterruptedException {
		
		HashMap m = new HashMap();
		Temp t = new Temp();
		m.put(t, "Powdered Toast Man");
		System.out.println(m);
		t = null;
		System.gc();
		Thread.sleep(5000);
		System.out.println(m);
		
	}
	
}

class Temp {
	public String toString() {
		return "Temp";
	}
	
	public void finalize() {
		System.out.println("Finalize() method called");
	}
}
*/