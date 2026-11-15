package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeExample {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://the-internet.herokuapp.com/iframe");
		
		WebElement frame = 
				driver.findElement(By.id("mce_0_ifr"));
		
		driver.switchTo().frame(frame);
		
		WebElement body = driver.findElement(By.tagName("body"));
		
		body.clear();
		
		body.sendKeys("Hello Richa");
		
		driver.switchTo().defaultContent();
		
		
		
	}

}
