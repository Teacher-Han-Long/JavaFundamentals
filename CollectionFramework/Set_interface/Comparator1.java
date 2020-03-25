import java.util.Comparator;
public class Comparator1 {
/*
Comparator<I> - java.util package
Defines 2 methods
compare() & equals()

1. public int compare(Object obj1, Object obj2)
(returns -ve iff obj1 has to come before obj2)
(returns +ve iff obj1 has to come after obj2)
(returns 0 iff obj1 & obj2 are equal)

2. public boolean equals(Object obj)


class myComparator implements Comparator 
{

    compare()
    {
    }

}

When we implement Comparator, we should only provide
implementation for compare() method.
We are not required to provide implementation for 
equals() method. It is already available to our class
via Object class through inheritance.

When to go for Comparable / Comparator

If you want natural default sorting order
java.lang package
Comparable
1 method - compareTo() 


Customized sorting order
java.util package
Comparator
2 methods - compare() & equals()

*********************************************************
IMPORTANT!!!!!!!!!

Write a program to insert Integer Objects into a TreeSet
where the sorting order is descending.

TreeSet t = new TreeSet();
t.add(10)...0, 15, 5, 20, 20;
Sout(t);
(Ascending order)

HOW DO WE GET DESCENDING?

*TreeSetDemo3.java

JVM calls compare() method
if we're not passing Comparator object, JVM will call 
compareTo() - default natural (ascending) sorting order

===============================================

Various Possible Implementations of compare() method.

What is the output?
--------------------------
public int compare(Object obj1, Object obj2) {
	
	Integer I1 = (Integer) obj1;
	Integer I2 = (Integer) obj2;
	return I1.compareTo(obj2);
	
}


So, if no Comparator obj constructor, JVM will do this...
psvm(String[] args)

	Integer I1 = (Integer)obj1;
	Integer I2 = (Integer)obj2;
	
1.	return I1.compareTo(I2);    --> Ascending order


2. return -I1.compareTo(I2);   --> Descending order

3.	return I2.compareTo(I1);   --> Descending order

4.	return -I2.compareTo(I1);  --> Ascending order

5. return +1;		   					--> Insertion order [10, 0, 5, 15, 20, 20]
(Duplicate or not, JVM is blind here)

6.	return -1;	(-1000)	   --> Reverse of Insertion [20, 20, 15, 5, 0, 10]

Most Dangerous
7.	return 0;		   --> 0 means duplicate. 
								Only the first element
								will be inserted. All remaining are
								duplicates. [0]	

*/
}