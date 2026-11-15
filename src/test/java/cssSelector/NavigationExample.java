package cssSelector;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationExample {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		// Open Google
		driver.get("https://www.google.com");
		
		System.out.println("Title:" + driver.getTitle());
		
		// Navigate to Amazon
		driver.navigate().to("https://www.amazon.in");
		
		System.out.println("CurrentUrl:" + driver.getCurrentUrl());
		
		 // Go back
		driver.navigate().back();
		
		// Go forward
		driver.navigate().forward();
		
		// Refresh page
		driver.navigate().refresh();
		
		// Close browser
		driver.quit();


	}

}
