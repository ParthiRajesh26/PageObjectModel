package pageObjectModel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UpdateProfilePageObject {

	
	@FindBy(xpath="/html/body/div[1]/div/div[3]/ul/li[4]/a")
	public static WebElement profile;
	
	@FindBy(name="phone")
	public static WebElement phoneNumber;
	
	@FindBy(name="city")
	public static WebElement city;
	
	@FindBy(xpath="/html/body/section[1]/div/div[2]/div/div[1]/div/div/div[2]/form/div[3]/button")
	public static WebElement submit;
	
	
	
	
	
	
	
	
	/*public static WebElement profile(WebDriver driver) {
		return driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/ul/li[4]/a"));
	}


	public static WebElement phonenumber(WebDriver driver) {

		return driver.findElement(By.name("phone"));
	}

	public static WebElement city(WebDriver driver) {
		return driver.findElement(By.name("city"));	}

	public static WebElement submit(WebDriver driver) {

		return driver.findElement(By.xpath(
				"/html/body/section[1]/div/div[2]/div/div[1]/div/div/div[2]/form/div[3]/button"));
*/
	}






