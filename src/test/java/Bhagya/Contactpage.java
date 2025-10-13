package Bhagya;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
 
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
 
public class Contactpage {
    ChromeDriver d;
 
    @BeforeClass
    public void setup() {
        d = new ChromeDriver();
        d.manage().window().maximize();
    }
 
    @Test
    public void fillContactForm() throws IOException {
        d.get("https://www.orangecrm.com/contact-orange-crm.php");
 
        d.findElement(By.id("name")).sendKeys("deeksha kashyap");
        d.findElement(By.id("phone")).sendKeys("1234567890");
        d.findElement(By.id("email")).sendKeys("deeksha.oct31@gmail.com");
        d.findElement(By.id("message")).sendKeys("I am able to do this type of testing very properly");
 
        // Take screenshot
        File screenshot = ((TakesScreenshot) d).getScreenshotAs(OutputType.FILE);
        Files.copy(screenshot.toPath(), Paths.get("C:\\Users\\user\\Pictures\\screenshot.jpg"));
    }
 
    @AfterClass
    public void tearDown() {
        if (d != null) {
            d.quit();
        }
    }
}