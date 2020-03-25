import java.util.*;
import java.io.*;

class PropertiesDemo {
	
	public static void main(String[] args) {
		
		Properties p = new Properties();
		FileInputStream fis = new FileInputStream("abc.properties");
		p.load(fis);
		System.out.println(p);
		String s = p.getProperty("Pinky");
		System.out.println(s);
		p.setProperty("Brain", "NYESSSS!");
		FileOutputStream fos = new FileOutputStream("abc.properties");
		p.store(fos, "Updated by HanLong for SCJP Demo class");
		
	}
	
}

/*
abc.properties.

user=scott
pwd=tiger
Pinky=naaarf

Update values are available. No need to recompile.
*/