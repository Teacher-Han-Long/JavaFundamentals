Write a program to insert String objects into a TreeSet where all elements
should be inserted according to reverse of alphabetical order

DEFAULT:
TreeSet t = new TreeSet();
t.add("Roja");
t.add("Shobha Rani");
t.add("Rajakumari");
t.add("Ganga Bhavari");
t.add("Ramulamma");
Sout(t);

[Ganga Bhavari, Rahakumari, Ramulamma, Roja, ShokhaRavi]

CUSTOM:
TreeSet t = new TreeSet(new myComparator());

class myComparator implements Comparator
{
	public int compare(Object obj1, Object obj2)
	{
		String s1 = obj1.toString();  *not required to perform TC.
		String s2 = (String)obj2;  
		return s2.compareTo(s1);
		//return -s1.compareTo(s2);
	}
}

*adding only string objects, typecasting ok, but for String there is another
way. 
1. If internal objects are only String type, typecasting ok.
2. If internal objects are something like StringBuffer, and we want to convert
   to String, we can call toString() method.

******************************************************************************

Write a program to insert StringBuffer objects into a TreeSet where sorting
order is alphabetical order

StringBuffer default natural sorting order is not there.

TreeSet t = new TreeSet();
{
	t.add(new StringBuffer("A"));
	t.add(new StringBuffer("Z"));
	t.add(new StringBuffer("K"));
	t.add(new StringBuffer("L"));
	Sout(t);
}
This produces a classCastException. We have to go for Comparator

1. convert StringBuffer objects to Strings.
String Buffer can't cast to String.
TreeSet t = new TreeSet(new myComparator());

class MyComparator implements Comparator
{
	public int compare(Object obj1, Object obj2)
	{
		String s1 = obj1.toString();
		String s2 = obj2.toString();
		return s1.compartTo(s2);
	}
}

We are not adding String objects. We're adding StringBuffer objects,
inserted based on String alphabetical sorting. SB objects are
 non-comparable.

If we are defining our own sorting, objects need not be comparable.

If we are depending on default natural sorting order. Objects must be 
homogenous and comparable.
Non-comparable objects will throw a RE: classCastException
but if we are defining our own sorting by Comparator then objects need
not be comparable and homogenous.
We can add heterogenous non-comparable objects like StringBuffer, also.

**************************************************************************

Write a program to insert and String AND StringBuffer objects into TreeSet
WHERE sorting order is increasing length order.
If 2 objects have the same length, then consider their alphabetical order.
psvm(String[] args)
TreeSet t = new TreeSet(new myComparator());   //try with and without arguments
t.add("A");
t.add(new StringBuffer("ABC"));
t.add(new StringBuffer("AA"));
t.add("XX");
t.add("ABCD");
t.add("A");
System.out.println(t);  O/P --> [A,AA,XX,ABC,ABCD] 

//Adding Strings and SBuffers. Convert both to String type.

class myComarator implements Comparator      
{
	public int compare(Object obj1, Object2)
	{
		String s1 = obj1.toString();
		String s2 = obj2.toString();
		int I1 = s1.length();
		int I2 = s2.length();
		
		if(I1 < I2)
		{
			return -1;
		}
		else if(I1 > I2)
		{
			return 1;
		}
		else
		{
			return s1.compareTo(s2);
		}	
	}
}
If we make the else return 0;  O/P --> XX is gone. Considered a duplicate.

*****************************************************************************

When to use Comparable and Comparator

1) PRE-DEFINED COMPARABLE CLASSES	
ex. String
already implement Comparable. compareTo() 
Default natural sorting order already available.
If not satisfied with that, we can go for Comparator to define our own sorting,
by using Comparator.
Why not override CompareTo() method?
JVM will call compareTo() method. String class is a pre-defined class. Not our own class. We should not override it.


2) PRE-DEFINED NON-COMPARABLE CLASSES
ex. StringBuffer
Default NatSortOrder not there. If we want any sorting we must define
our own with  Comparator.
StringBuffer is also a pre-defined class. We can't provide any sorting method.


3) OUR OWN CLASSES
ex. Employee, Student, etc........
Maybe one programmer writing, another using it.
Writer of class is responsible for defining natural default sorting order by 
implementing Comparable <I> and compareTo() method.
If someone didn't want to use the more common sorting by ID number for Employees,
and chose to sort by name, could us Comparable

Person USING Employee class - if not satisfied with default sorting order, then he
 can define his own sorting by using Comparator concept (for customized sorting).
*******************************************************************************
*********************************************************************************

If we're not passing any Comparator Object, it must be default sorting order.
The person writing the Employee class must implement Comparable and implement
public int compareTo(Object obj)


import java.util.*;
class Employee implements Comparable
{
	String name;
	int eid;
	Employee(String name, int eid)
	{
		this.name = name;
		this.eid = eid;
	}

	public String toString()
	{
		return name + "--" + eid;
	}

	public int compareTo(Object obj)
	{
		//current object obj1(this)
		int eid1 = this.eid;
		//2nd obj coming in Object form. You can't ask Object for id.
		//Ask Employee.
		Employee e = (Employee)obj;
		int eid2 = e.eid;
		if(eid1 < eid2)
		{
			return -1;
		}
		else if(eid1 > eid2)
		{
			return 1;
		}
		else 
		{
			return 0;
		}
	}
}


class CompComp
{
	public static void main(String[] args)
	{
		Employee e1 = new Employee("nag", 100);
		Employee e2 = new Employee("balaiah", 20);
		Employee e3 = new Employee("chiru", 50);
		Employee e4 = new Employee("venki", 150);
		Employee e5 = new Employee("nag", 100);
		/*we want to add these to the Set, according to
		id. No Comparator, so default. Internally, compareTo
		method is called on these objects.	
		*/
		TreeSet t = new TreeSet();
		t.add(e1);
		t.add(e2);
		t.add(e3);
		t.add(e4);
		t.add(e5);
		System.out.println(t);
		TreeSet t1 = new TreeSet(new MyComparator());
		t1.add(e1);
		t1.add(e2);
		t1.add(e3);
		t1.add(e4);
		t1.add(e5);
		System.out.println(t1);
	}
}

class MyComparator implements Comparator
{
	public int compare(Object obj1, Object obj2)
	{
		//Employee Object cast to employee form
		Employee e1 = (Employee)obj1;
		Employee e2 = (Employee)obj2;
		String s1 = e1.name;
		String s2 = e2.name;
		return s1.compareTo(s2);
	}
}
*************************************************************************
*************************************************************************

COMPARISON OF COMPARABLE AND COMPARATOR

COMPARABLE                                COMPARATOR
______________________________________________________

1. DNSO											Customized SO

2. java.lang										java.util

3. Only 1 method								2 methods
  -compareTo()									-compare()
														-equals()

4.String and All Wrapper Classes		Collator
														RuleBasedCollater 
															(GUI-based App)

*Which classes implement Comparable?
A: String and ALL Wrapper classes implement Comparable<I>
Which classes implement Comparator?
A: We are responsible for implementing it. Pre-defined classes usually
won't implement Comparator. Search carefully in the API. 2 classes implement it.
-Collator
-RuleBasedCollator

*******************************************************************************

COMPARISON OF SET IMPLEMENTED CLASSES

Property                          HashSet              LinkedHashSet              TreeSet
________________________________________________________________

1.underlying DS		      HashTable	         LL + HashTable	       Balanced Tree

2.Duplicate Objects		  NotAllowed	         NotAllowed		            NotAllowed

3.Insertion Order	         NotPreserved	         Preserved		   	   Not Preserved

4.Sorting Order					N/A						   N/A			   			Applicable

5.Heterogeneous				Allowed	          		 ""		                   NotAllowed
    Objects						           

6.null insertion			     Allowed once	             ""			        OK for MT TreeSet-1st
																							  element, until 1.6v  
