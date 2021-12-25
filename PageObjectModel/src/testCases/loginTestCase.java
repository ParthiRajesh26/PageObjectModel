package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pageObjectModel.LoginPageObject;

public class loginTestCase {
	@Test
	public void loginPage() {

		System.setProperty("webdriver.chrome.driver", "C:\\selenium training\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.phptravels.net/login");
		
		
		PageFactory.initElements(driver, LoginPageObject.class);
		
		LoginPageObject.userName.sendKeys("user@phptravels.com");
		LoginPageObject.password.sendKeys("demouser");
		LoginPageObject.submit.click();
	
	
		
		/*
		 * LoginPageObject.userName(driver).sendKeys("user@phptravels.com");
		 * LoginPageObject.password(driver).sendKeys("demouser");
		 * LoginPageObject.submit(driver).click();
		 */


		
        
        
        
		/*
		 * WebElement email=driver.findElement(By.name("email"));
		 * email.sendKeys("user@phptravels.com");
		 * 
		 * WebElement password=driver.findElement(By.name("password"));
		 * password.sendKeys("demouser");
		 * 
		 * 
		 * 
		 * WebElement loginButton=driver.findElement(By.xpath(
		 * "/html/body/div[1]/div/div[2]/div[2]/div/form/div[3]/button"));
		 * loginButton.click();
		 * 
		 * driver.quit();
		 */
	}

}








