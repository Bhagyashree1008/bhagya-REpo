package Datadriven;



	import java.io.FileInputStream;
	import java.io.IOException;
	import java.util.Properties;

	public class ReadTheDataFromPropertiesFile {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("./src/test/resources/commondataregularonline.properties");
		Properties pobj = new Properties();
		pobj.load(fis);
		String browsername = pobj.getProperty("browsername");
		System.out.println("browsername = " + browsername);
		String url = pobj.getProperty("url");
		System.out.println("url = " + url);
		String username = pobj.getProperty("username");
		System.out.println("username = " + username);
		String password = pobj.getProperty("password");
		System.out.println("password = " + password);
		
	}
}
