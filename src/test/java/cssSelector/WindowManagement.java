package cssSelector;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowManagement {

	public static void main(String[] args) throws InterruptedException{
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
		
		driver.manage().window().maximize();
		
		Dimension newSize = new Dimension(1024,768);
		
		driver.manage().window().setSize(newSize);
		
		Dimension updateSize = driver.manage().window().getSize();
		
		driver.close();	
		
		
		
		
		
	}

}
