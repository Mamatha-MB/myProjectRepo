package testFrames;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import utilities.pageUtils;

public class testUtils extends pageUtils {
	public static String baseURL; 

	@BeforeSuite
	public void setDriver() {
		setWebDriver();
		baseURL= config.getProperty("baseurl");
		driver.get(baseURL);
	}

	@AfterSuite
	public void closeDriver() throws InterruptedException {
		if (driver != null) {
			Thread.sleep(2000);
			driver.close();
		}
	}

}
