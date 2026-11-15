package ui;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CurrentURL {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
		
		String url = driver.getCurrentUrl();
		
		System.out.println("Current url: " + url);
		
		driver.quit();
	}

}
