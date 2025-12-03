package Base_test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class BaseClass extends report {
    public  WebDriver driver;
@BeforeTest
    public void setupDriver() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized"); // Example option
        options.addArguments("--disable-notifications");
        options.addArguments("remote_allow_origin=*");

        driver = new ChromeDriver(options); // <-- Attach options here
}
    @AfterTest
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
    public WebDriver getDriver() {
            return driver;
        }


}

