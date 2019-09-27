package testFrames;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import checkFrames.LoginExample;
import checkFrames.toolsQAFrames;
import utilities.ExcelUtils;
import org.testng.Assert;

@Listeners (utilities.ListenerClass.class)
public class NewTest extends testUtils {

	
	@Test(priority=1)
	public void testFrames() {
		toolsQAFrames tqa = new toolsQAFrames(driver);
		tqa.getTitileQA();
		Assert.assertEquals("IFrame practice page", tqa.getTitileQA());
		System.out.println("total number of frames  "+tqa.getCountFrames());
		tqa.switchToFrames();
		}
	
	@Test(priority=0,dataProvider="readDataInDP")
	public void readData(String username,String password) throws Exception
	{
		System.out.println(username+"   "+password);
		driver.get("http://demo.guru99.com/test/newtours/");
		LoginExample le=new LoginExample();
		le.logintoPage(username,password);
		SoftAssert sf=new SoftAssert();
		sf.assertTrue(true, "True");
	}	
	@DataProvider
	public Object[][] readDataInDP() throws Exception
	{
		ExcelUtils ex=new ExcelUtils((System.getProperty("user.dir") + "\\src\\main\\DataDrivenExcel.xlsx"),"dataSheet");
		Object[][] data=ex.readExcel();
		return data;
	}
}
