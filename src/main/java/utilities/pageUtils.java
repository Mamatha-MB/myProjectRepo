package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class pageUtils {

	public static WebDriver driver;
	public static FileInputStream fis;
	public static Properties config = new Properties();

	public static void setWebDriver() {
		try {
			fis = new FileInputStream(System.getProperty("user.dir") + "\\src\\main\\config.properties");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			config.load(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (config.getProperty("browser").equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "M:\\chrome\\chromedriver.exe");
			driver = new ChromeDriver();
		}
	}
}
