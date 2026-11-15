package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class IsDisplayed {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:/Users/siva/workspace/Selenium/\r\n"
				+ "driver/geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		
		  boolean 
		  logo=driver.findElement(By.xpath("//*[@id='blueBarDOMInspector']/div/div/div/div[1]/h
		  1/a/i")).isDisplayed

	}

}
