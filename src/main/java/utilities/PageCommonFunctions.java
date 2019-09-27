package utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageCommonFunctions extends pageUtils {

	public static WebDriverWait wait = new WebDriverWait(driver, 10);
	public static Wait fwait = new FluentWait(driver).withTimeout(30, TimeUnit.SECONDS).pollingEvery(5, TimeUnit.SECONDS)
			.ignoring(NoSuchElementException.class);
	

	public static void sendKeys(WebElement w, String str) {
		w.sendKeys(str);
	}

	public static void clickElement(WebElement w) {
		w.click();
	}

	
	

}
