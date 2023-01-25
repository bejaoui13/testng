package regiter_Utile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class R_LoadProperties {

	public static Properties userdata = loadproperties(System.getProperty("user.dir")+"/src/test/java/data/userdata.properties");

	private static Properties loadproperties(String path) {

		Properties prop = new Properties();
		try {
			FileInputStream filesrc = new FileInputStream(path);
			prop.load(filesrc);
		}

		catch (FileNotFoundException e) {
			System.out.println("Error occurred 1 : " + e.getMessage());
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Error occurred 2 : " + e.getMessage());
		} catch (NullPointerException e) {
			System.out.println("Error 3  : " + e.getMessage());
		}
		return prop;
	}

}
