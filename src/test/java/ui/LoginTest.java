package ui;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest{
public static void main(String[] args) {

    WebDriverManager.firefoxdriver().setup();

    FirefoxOptions options = new FirefoxOptions();

    options.setBinary("C:\\Users\\intel\\.cache\\selenium\\firefox\\win64\\156.0.1\\firefox.exe");

    FirefoxDriver driver = new FirefoxDriver(options);

    driver.get("https://www.flipkart.com");
}

}