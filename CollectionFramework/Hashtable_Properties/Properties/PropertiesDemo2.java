
// pseudo code

class Propert {
	
	public static void main(String[] args) {
		Properties p = new Properties();
		FileInputStream fis = new FileInputStream("db.properties");
		p.load(fis);
		String url = p.getProperty("url");
		String user = p.getProperty("user");
		String pwd = p.getProperty("pwd");
		Connection con = DriverManager.getConnection(url,user,pwd);
		;;;;;;;;;
	}
	
}