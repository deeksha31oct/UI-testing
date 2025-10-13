package Bhagya;

import com.google.common.io.Files;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class Contact {
    @Test
    public static void main(String[]args) throws InterruptedException, IOException {
        ChromeDriver d = new ChromeDriver();
        d.get("https://www.orangecrm.com/contact-orange-crm.php");
        d.manage().window().maximize();
        d.findElement(By.id("name")).sendKeys("deeksha kashyap");
        d.findElement(By.id("phone")).sendKeys("1234567890");

        d.findElement(By.id("email")).sendKeys("deeksha.oct31@gmail.com");
        d.findElement(By.id("message")).sendKeys(" I am able to do this type of testing very properly");
       File f = (File) d.getScreenshotAs(OutputType.FILE);
        Files.copy(f,new File("C:\\Users\\user\\Pictures\\screenshot.jpg"));

        Thread.sleep(2000);

    d.findElement(By.id("recaptcha-anchor")).click();

       d.findElement(By.id("SubmitButton")).click();
       Thread.sleep(2000);
    d.quit();
    }
}
