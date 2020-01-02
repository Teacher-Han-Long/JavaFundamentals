class Student {
	String name;
	int rollNo;
	
	Student(String name, int rollNo) {
		this.name = name;
		this.rollNo = rollNo;
	}
	
	public static void main(String[] args) {
		Student s1 = new Student("Jeff Spicolli", 1);
		Student s2 = new Student("Juan Epstein", 2);
		Student s3 = new Student("Arnold Horshack", 3);
		System.out.println(s1.name + "..." + s1.rollNo);
		System.out.println(s2.name + "..." + s2.rollNo);
		System.out.println(s3.name + "..." + s3.rollNo);
	}
	
}

// Without constructor, JVM provides default values (null, 0);
// Purpose of constructor is to perform initialization of an object

