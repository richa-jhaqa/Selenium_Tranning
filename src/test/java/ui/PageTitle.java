package ui;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageTitle {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
		
		String title = driver.getTitle();
		
		System.out.println("Page Title: " + title);
		
		driver.quit();
		
	}

}
