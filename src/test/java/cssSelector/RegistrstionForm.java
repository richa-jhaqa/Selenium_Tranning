package cssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegistrstionForm {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://example.com");
		
		driver.findElement(By.cssSelector("input[name='firstname']")
				).sendKeys("Richa");
		
		driver.findElement(By.cssSelector("input[name='lastname']")
				).sendKeys("Jha");
		
		driver.findElement(By.cssSelector("input[type='email']")
				).sendKeys("richa@gmail.com");
		
		driver.findElement(By.cssSelector("input[name='phone']")
				).sendKeys("98675432214");
		
		driver.findElement(By.cssSelector("#terms")
				).click();
		
		driver.findElement(By.className("button#registerBtn")
				).click();
	}

}
