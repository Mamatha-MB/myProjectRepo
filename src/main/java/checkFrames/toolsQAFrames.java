package checkFrames;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.pageUtils;

public class toolsQAFrames extends pageUtils {

	WebElement frame1 = driver.findElement(By.tagName("iframe"));
	WebElement frame2;
	List<WebElement> webList= driver.findElements(By.tagName("iframe"));

	public toolsQAFrames(WebDriver driver) {
		driver = pageUtils.driver;
	}

	public void getTitileQA() {
		System.out.println(driver.getTitle());
	}

	public int getCountFrames() {
		return webList.size();
	}
	
	public void switchToFrames() {
		driver.switchTo().frame(0);
		System.out.println("We are at frame 1");
		driver.switchTo().defaultContent();
	}
}
