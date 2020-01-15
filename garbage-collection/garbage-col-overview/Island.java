/*
ISLAND OF ISOLATION
---------------------------------
Objects can become eligible for GC, even if they still have valid references.

A simple example is a class that has an instance variable that is a reference
variable to another instance of the same class.
Now imagine that two such instances exist and that they refer to each other. If 
all other instances of these 2 objects are removed, then even though each object 
still has a valid reference, there will be no way for any live thread to access either object.

When the garbage collector runs, it can usually discover any such islands of objects
and remove them. As you can imagine, such islands can become quite large, theoretically containing hundreds of objects. Examine the following code:
*/

public class Island {    
	
	Island i;
	
	public static void main(String[] args) {
		
		Island i2 = new Island();
		Island i3 = new Island();
		Island i4 = new Island();
	
		i2.i = i3;  // i2 refers to i3
		i3.i = i4;  // i3 refers to i4
		i4.i = i2;  // i4 refers to i2
		
		i2 = null;
		i3 = null;
		i4 = null;
		
		// do complicated, memory intensive stuff
	}
}

/*
When the code reaches " do complicated ", the three Island objects (previously 
known as i2, i3, and i4) have instance variables so that they refer to each other, 
but their links to the outside world (i2, i3, i4) have been nulled. These three objects
are eligible for garbage collection.

This covers everything you will need to know about making objects eligible for GC.
Study Figure 3-2 pg 216 in the study guide to reinforce the concepts of objects
without references and islands of isolation.
*/


/*
	Test i;
	public static void main(String[] args) {
		Test t1 = new Test();
		Test t2 = new Test();
		Test t3 = new Test();
	}
	// no objects available for GC
	t1.i = t2;
	t2.i = t3;
	t3.i = t1;
	// no objects available for GC
	t1 = null;   // no objects availalble for GC
	t2 = null;   // no objects available for GC
	t3 = null;   //  3 objects availalble for GC
	
	Imagine a sinking ship where only the passengers are supporting each other
*/
	
	
	
	
	
	
	