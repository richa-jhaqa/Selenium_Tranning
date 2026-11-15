package cssSelector;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenWebsite {

	public static void main(String[] args) {
		
	     WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
		
		System.out.println("page title:" + driver.getTitle());
		
		System.out.println("Current URL: " + driver.getCurrentUrl());
		
		driver.quit();
	}

}
