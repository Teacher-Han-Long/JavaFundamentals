import java.util.Scanner;


class Trim {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your country name: ");
		
		String name = sc.nextLine().toLowerCase().trim();
		if (name.equals("usa")) {
			System.out.println("Stop watching TV");
		} else if (name.equals("thailand")) {
			System.out.println("Sa wat dtee, krap!");
		} else if (name.equals("cambodia")) {
			System.out.println("suasadey!");
		} else { 
			System.out.println("Enter a valid country name:  ");
		}
		
		// trims a blank, just checking
		// trims space at front or back of input
		String sample  = " ";
		System.out.println(sample.trim().length());
		
		String s = "Yeeaah, HI";
		System.out.println(s.trim().length());
		// spaces are only removed at beg and end
		
	}
}