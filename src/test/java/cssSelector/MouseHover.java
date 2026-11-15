package cssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("\"https://the-internet.herokuapp.com/hovers\"");
		
		WebElement image = driver.findElement(
                By.xpath("(//div[@class='figure'])[1]")
						);
		
		Actions actions = new Actions(driver);
		
		actions.moveToElement(image).perform();
		
		WebElement text = driver.findElement(
                By.xpath("(//div[@class='figcaption']/h5)[1]")
            );
	}

}
