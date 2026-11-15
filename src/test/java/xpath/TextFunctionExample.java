package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextFunctionExample {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/login");
		
		WebElement loginButton = driver.findElement(
				By.xpath("//button[text()=' Login']")
				);
		
		System.out.println("Button Text: " + loginButton.getText());
		
		loginButton.click();
	}

}
