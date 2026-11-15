package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyLogin {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/");
		
		driver.findElement(By.id("user-name"))
		.sendKeys("standard_user");
		
		driver.findElement(By.id("password"))
		.sendKeys("secret_sauce");
		
		//driver.findElement(By.id("login-button"))
		//.click();
		
		//boolean result =
		//	driver.findElement(By.id("login-button"))
		//		.isDisplayed();
		
		//System.out.println(result);
		
		//boolean result =
		//		driver.findElement(By.id("login-button"))
		//		.isEnabled();
		//System.out.println("Login button enabled:" + result);
		
		driver.findElement(By.id("user-name"))
		.clear();	
	}

}
