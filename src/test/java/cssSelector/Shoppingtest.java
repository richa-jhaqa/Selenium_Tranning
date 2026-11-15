package cssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Shoppingtest {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://example.com");
		
		driver.findElement(By.cssSelector("#searchbox"))
		.sendKeys("Laptop");
		
		driver.findElement(By.cssSelector("#[data-product='laptop']")
				).click();
	}

}
