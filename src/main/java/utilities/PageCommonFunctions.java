package utilities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageCommonFunctions extends pageUtils {

	public static WebDriverWait wait=new WebDriverWait(driver,10);
	public static void sendKeys(WebElement w,String str){
		w.sendKeys(str);
	}
	
	public static void clickElement(WebElement w) {
		w.click();
	}
	
}
