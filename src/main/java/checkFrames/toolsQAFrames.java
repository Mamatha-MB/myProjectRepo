package checkFrames;

import java.time.LocalDate;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import utilities.PageCommonFunctions;
import utilities.pageUtils;


public class toolsQAFrames extends pageUtils {

	WebElement frame1 = driver.findElement(By.tagName("iframe"));
	WebElement frame2;
	List<WebElement> webList= driver.findElements(By.tagName("iframe"));
	WebElement menu=driver.findElement(By.xpath("//*[@id=\"primary-menu\"]/li[7]/ul/li[4]/a/span/span"));
	WebElement frameMenu=driver.switchTo().frame(0).findElement(By.xpath("//a[@href='https://www.toolsqa.com/selenium-tutorial/']"));

	public toolsQAFrames(WebDriver driver) {
		driver = pageUtils.driver;
	}

	public String getTitileQA() {
		System.out.println(driver.getTitle());
		return driver.getTitle();
	}

	public int getCountFrames() {
		return webList.size();
	}
	
	
	public void switchToFrames() {
		driver.switchTo().frame(0);
		//PageCommonFunctions.wait.until(ExpectedConditions.stalenessOf(menu));
		System.out.println("We are at frame 1");
		driver.navigate().refresh();
		System.out.println("Todays Date: "+LocalDate.now());
		
		try {
			PageCommonFunctions.fwait.until(ExpectedConditions.elementToBeClickable(frameMenu));
			PageCommonFunctions.clickElement(frameMenu);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}
