/*
This program lets us know how much total memory the JVM has available to it
and how much memory is left and then calls the GC(which if it decides to run, 
should halt the program until all unused objects are removed). 
The final free memory result should indicate wheter it has run. 
*/

import java.util.Date;
public class CheckGC {
	public static void main(String[] args) {
		Runtime rt = Runtime.getRuntime();
		System.out.println("Total JVM memory: " + rt.totalMemory());
		System.out.println("Before Memory = " + rt.freeMemory());
		
		Date d = null;
		for (int i = 0; i<10000;i++) {
			d = new Date();
			d = null;
		}
		System.out.println("After available memory: " + rt.freeMemory());
		rt.gc();
		System.out.println("After GC memory: " + rt.freeMemory());
		
	}
}

/*
 DID the JVM decide to garbage collect (that is, delete) the eligible objects?
This program has only one thread running, so there was nothing else going on 
when rt.gc() was called. Keep in mind also that the behavior when gc() is called 
may be differeent for different JVMs. No guarantee that unused objects will be 
removed from memory. About the ONLY guarantee is that if you are running low 
on memory, the GC will run before it throws an OutOfMemoryException.

TRY changing the CheckGC program- put lines 20 and 21 inside of a loop 
Comment out line 21
Play play play
*/