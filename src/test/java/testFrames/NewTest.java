package testFrames;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import checkFrames.toolsQAFrames;
import utilities.ExcelUtils;

@Listeners (testFrames.ListenerClass.class)
public class NewTest extends testUtils {

	
	@Test(priority=1)
	public void testFrames() {
		toolsQAFrames tqa = new toolsQAFrames(driver);
		tqa.getTitileQA();
		System.out.println("total number of frames  "+tqa.getCountFrames());
		tqa.switchToFrames();
		}
	
	@Test(priority=0,dataProvider="readDataInDP")
	public void readData(String username,String password) throws Exception
	{
		System.out.println(username+"   "+password);
	}	
	@DataProvider
	public Object[][] readDataInDP() throws Exception
	{
		ExcelUtils ex=new ExcelUtils((System.getProperty("user.dir") + "\\src\\main\\DataDrivenExcel.xlsx"),"dataSheet");
		Object[][] data=ex.readExcel();
		return data;
	}
}
