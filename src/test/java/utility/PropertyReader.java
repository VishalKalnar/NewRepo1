package utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyReader {

	public static String readPropertydata(String propTobeRead) throws IOException 
	{
		String path =System.getProperty("user.dir")+"\\src\\test\\resources\\Config.Properties";
//		System.out.println(path);
		
		
		Properties prop=new Properties ();

		FileInputStream f = new FileInputStream(path);
		
		prop.load(f);
		String value=prop.getProperty(propTobeRead);
//		System.out.println(value);
		return value;
		
	}
	public static void main(String[] args) throws IOException { // for just checking the code is working or not 
		PropertyReader p=new PropertyReader();
		String valuereturned =  p.readPropertydata("browsername");
		System.out.println(valuereturned);
	}
	
	
	
	
	
}
