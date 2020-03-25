import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PassWrd {
	
	public static void main(String[] args) {
		
		HashMap<String, String> pwrds = new HashMap<>();
		pwrds.put("Chen Hanlong", "Joshua");
		pwrds.put("Ma Jinping", "0620");
		pwrds.put("Summer Zheng", "badasscoffee82");
		pwrds.put("Larry David", "pri-t-good123");
		
		System.out.println(pwrds);
		pwrds.remove("Larry David");
		System.out.println(pwrds);
	
		System.out.println(pwrds.containsValue("badasscoffee82"));
		System.out.println(pwrds.size());
		System.out.println(pwrds.replace("Ma Jinping", "rubiksMaster82"));
		System.out.println(pwrds);
	}
	
	
}

class Logic {
	public String resetPassword(String name, String pWord) {
		
	
	}
	
}

// BLACK HACKER APP - "You have hacked into ~~~ Savings and Loan..what would..
// you like to do?   steal passwords, change a password(lock out user), withdraw....

// WRITE METHODS OUT FIRST

// refer to Karaoke app and create prompter (ATM Menu) - HashMaps, other Maps
// set passwords, retrieve passwords, and check if a user is there