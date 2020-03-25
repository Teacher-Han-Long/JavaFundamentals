import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class HashMapConcept {
	
	public static void main(String[] args) {
		
		HashMap<Integer, Employee> empMap = new HashMap<>();
		
		Employee emp1 = new Employee("Samir Naga....", 27, "Java Programmer");
		Employee emp2 = new Employee("Michael Bolton", 28, "Breaking equiptment");
		Employee emp4 = new Employee("Peter", 29, "Fishing/office redecoration");
		Employee emp3 = new Employee("Milton Waddams", 33, "Collating");
		empMap.put(1, emp1);
		empMap.put(3, emp3);
		empMap.put(2, emp2);
		empMap.put(4, emp4);
		
		for (Entry<Integer, Employee> emp : empMap.entrySet()) {
			int key = emp.getKey();
			Employee e = emp.getValue();
			System.out.printf("%d: %s - %d - %s %n", key, e.name, e.age, e.skill);
		}
		
	}
	
}