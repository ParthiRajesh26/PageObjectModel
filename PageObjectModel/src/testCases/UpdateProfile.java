package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pageObjectModel.LoginPageObject;
import pageObjectModel.UpdateProfilePageObject;

public class UpdateProfile {

	@Test
	public void loginPage() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\selenium training\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.phptravels.net/login");

       PageFactory.initElements(driver, LoginPageObject.class);
       
		LoginPageObject.userName.sendKeys("user@phptravels.com");
		LoginPageObject.password.sendKeys("demouser");
		LoginPageObject.submit.click();
		
		
		PageFactory.initElements(driver, UpdateProfilePageObject.class);
		
		UpdateProfilePageObject.profile.click();
		UpdateProfilePageObject.phoneNumber.sendKeys("1234567890");
		UpdateProfilePageObject.city.sendKeys("coimbatore");
		UpdateProfilePageObject.submit.click();
		
		
		
		
		
		

		/*
		 * LoginPageObject.userName(driver).sendKeys("user@phptravels.com");
		 * LoginPageObject.password(driver).sendKeys("demouser");
		 * LoginPageObject.submit(driver).click();
		 * 
		 * 
		 * UpdateProfilePageObject.profile(driver).click();
		 * UpdateProfilePageObject.phonenumber(driver).sendKeys("1234567890");
		 * UpdateProfilePageObject.city(driver).sendKeys("coimbatore");
		 * Thread.sleep(5000);
		 *  UpdateProfilePageObject.submit(driver).click();
		 */










		//		  WebElement email=driver.findElement(By.name("email"));
		//		  email.sendKeys("user@phptravels.com");
		//		  
		//		  WebElement password=driver.findElement(By.name("password"));
		//		  password.sendKeys("demouser");
		//		  
		//		  WebElement loginButton=driver.findElement(By.xpath(
		//		  "/html/body/div[1]/div/div[2]/div[2]/div/form/div[3]/button"));
		//		  loginButton.click();
		//		 
		//		  WebElement
		//		  profile=driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/ul/li[4]/a"
		//		  )); 
		//		  
		//		  profile.click();
		//		  
		//		  Thread.sleep(5000);
		//		  
		//		  WebElement phoneNumber=driver.findElement(By.name("phone"));
		//		  phoneNumber.sendKeys("123456789");
		//		  
		//		  WebElement city=driver.findElement(By.name("city"));
		//		  city.sendKeys("coimbatore");
		//		  
		//		
		//		  WebElement submit= driver.findElement(By.xpath("/html/body/section[1]/div/div[2]/div/div[1]/div/div/div[2]/form/div[3]/button"
		//		  ));
		//		  
		//		  submit.click();

	}

}
