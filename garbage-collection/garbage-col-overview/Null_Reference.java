import java.util.Date;
/*
public class NullingGarbageTruck {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Hello");
		System.out.println(sb);
		//StringBuffer object is not eligible for GC
		sb = null;
		//Now it is
	}
}
*/

/*
Objects created in a method also need to be considered. When a method is invoked,
any local variables created exist only for the duration of the method. Once the method 
has returned, teh objects created in the method are eligible for garbage collection.
EXCEPTION: if an object is returned from the method, it's reference might be assigned 
to a reference variable in the method that called it; hence, it will not be eligible for GC.
*/

public class NullingGarbageTruck {
	public static void main(String[] args) {
		Date d = getDate();
		doComplicatedStuff();
		System.out.println("d = " + d);
	}
	public static Date getDate() {
		Date d2 = new Date();
		StringBuffer now = new StringBuffer(d2.toString());
		System.out.println(now);
		return d2;
	}
}

/*
getDate() returns a Date object. This method creates 2 objects: a Date and a 
StringBuffer containing the containing the Date information.   Since the method
returns a reference to the Date object and this reference is assigned to a local 
variable, it will not be eligible for GC even after the getDate() method has completed.
The StringBuffer object WILL be eligible, even though we didn't set it to null.
*/
public static void main(String[] args) {
	m1();
}
public static void m1() {
	Student s1 = new Student();
	Student s2 = new Student();
}
// m1 completes, 2 objects available for GC

public static  void main(String[] args) {
	Student s = m1();
}
public static Student m1() {
	Student s1 = new Student();
	Student s2 = new Student();
	return s1;
}
// we're providing a new reference variable - only one object available for GC

public static void main(String[] args) {
	m1();
}
public static Student m1() {
	Student s1 = new Student();
	Student s2 = new Student();
	return s1;
}
// 2 objects available for GC

static Student s;
public static void main(String[] args) {
	m1();
}
public static Student m1() {
	s = new Student();
	Student s1 = new Student();
}
// 1 object available for GC



