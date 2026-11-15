package ui;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

//Write a Script to open and close the browser based on user input
public class Demo {

	public static void main(String[] args) throws InterruptedException
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a browser name");
		
		String browser = sc.nextLine();
		
		WebDriver driver = null;
		
		if(browser.equals("Firefox")) {
			System.setProperty("webdriver.gecko.driver",
          "./drivers/geckodriver.exe");
			
			driver = new FirefoxDriver();
			
		}
		else
			if(browser.equals("Chrome")) {
				System.setProperty( "webdriver.chrome.driver",
						"./drivers/chromedriver.exe"  );
				driver = new ChromeDriver();
				
			}
			else {
				System.out.println("Invalid browser");
			}
		Thread.sleep(2000);
		

	}

}
