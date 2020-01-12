class Collar { }

class Dog {
	Collar c;		//instance variable
	String name;		//instance variable

	public static void main(String[] args) {

		Dog d;		//local variable: d
		d = new Dog();
		d.go(d);
	}
	
	void go(Dog dog) {		//local variable: dog
		c = new Collar();
		dog.setName("Kazan");
	}
	void setName(String dogName) {	//local var: dogName
		name = dogName;
		//do more stuff
	}
}

/*
Quick overview of stack and heap
-------------------------------------
Line 
7   - main() is placed on the stack
9   - Reference variable d is created on the stack, but no Dog obj. yet
10 - A new Dog obj is created on the heap and is assigned to d ref. var.
11 - A copy of the reference variable d is passed to the go() method
13 - The go() method is placed on the stack, w/the dog param. as a local var.
14 - A new Collar obj. is created on the heap and assigned to Dog's instance var.
17 - setName() is added to the stack, w/the dogName param. as it's local var.
18 - The 'name' instance var. now also refers to the String object
*Notice that 2 different local variables refer to the same Dog object
*Notice that 1 local var. and 1 instance var. both refer to the same String Kazan
*After line 19 completes, setName() completes and is removed from the stack.
At this point the local variable dogName disappears, too, although the String object
it referred to is still on the heap.
*/

