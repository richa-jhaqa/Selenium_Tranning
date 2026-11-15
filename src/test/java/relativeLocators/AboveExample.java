package relativeLocators;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class AboveExample {

    public static void main(String[] args) {

        // Open Chrome
        WebDriver driver = new ChromeDriver();

        // Open webpage
        driver.get("https://www.example.com");

        // Find the password field
        WebElement password = driver.findElement(By.id("password"));

        // Find the input field above the password field
        WebElement username = driver.findElement(
                RelativeLocator.with(By.tagName("input"))
                               .above(password)
        );

        // Enter username
        username.sendKeys("Richa");

        // Enter password
        password.sendKeys("12345");

        // Close browser
        driver.quit();
    }
}
