package pageObjectModel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPageObject {

	@FindBy(how=How.NAME,using="email")
	public static WebElement userName;
	
	@FindBy(name="password")
	public static WebElement password;
	
	@FindBy(xpath="/html/body/div[1]/div/div[2]/div[2]/div/form/div[3]/button")
	public static WebElement submit;
	
	
	
/*
	 * public static WebElement userName(WebDriver driver) { return
	 * driver.findElement(By.name("email")); }
	 * 
	 * 
	 * public static WebElement password(WebDriver driver) { return
	 * driver.findElement(By.name("password")); }
	 * 
	 * public static WebElement submit(WebDriver driver) { return
	 * driver.findElement(By.xpath(
	 * "/html/body/div[1]/div/div[2]/div[2]/div/form/div[3]/button")); }
	 */
}
