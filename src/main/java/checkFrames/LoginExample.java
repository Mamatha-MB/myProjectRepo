package checkFrames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utilities.PageCommonFunctions;
import utilities.pageUtils;

public class LoginExample extends pageUtils {

	WebElement userName=driver.findElement(By.xpath("//input[@name='userName']"));
	WebElement userPwd=driver.findElement(By.xpath("//input[@name='password']"));
	WebElement loginBtn=driver.findElement(By.xpath("//input[@name='submit']"));
	
	public void logintoPage(String name, String pwd)
	{
		PageCommonFunctions.sendKeys(userName, name);
		PageCommonFunctions.sendKeys(userPwd, pwd);
		PageCommonFunctions.clickElement(loginBtn);
	}
}
