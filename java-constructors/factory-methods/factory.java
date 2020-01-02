class Employee {
	private Employee() {}
	
	//Static factory method, allows access to create an Employee object from an outside class
	public static Employee getEmployeeInstance() {
		return new Employee();
	}
	
	public void sayHi() {
		System.out.println("Ni hao!");
	}
}


public class factory {
	public static void main(String[] args) {
		/*throws compile time error
		Employee() has private access in Employee*/
		//Employee emp = new Employee();
		
		//access static method to create Employee object
		Employee emp1 = Employee.getEmployeeInstance();
		emp1.sayHi();
		
		Runtime r = Runtime.getRuntime();
		/* static factory methods - best examples :  Runtime/Class */
		// Runtime r = new Runtime();   invalid -> Compile time error
		// Runtime r = Runtime.getRuntime(); //valid
		// Class c = new Class();   invalid -> Compile time error
		// Class c = Class.forName(String className/InterfaceName);
		
	}
}