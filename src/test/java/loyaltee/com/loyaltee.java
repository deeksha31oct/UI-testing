package loyaltee.com;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class loyaltee
{
    public static void main(String[]args) throws InterruptedException, IOException {
        ChromeDriver d = new ChromeDriver();
        ChromeOptions c = new ChromeOptions();
        c.addArguments("enable");
        c.addArguments("disavle");
        c.addArguments("remote_allow_origin=*");
        d.get("https://frontend.assessment.ind.in/admin-login");
        d.manage().window().maximize();
        WebDriverWait WA = new WebDriverWait(d, Duration.ofSeconds(4));
        WA.until(ExpectedConditions.elementToBeClickable(By.id("email"))).sendKeys("sivewav972@exitbit.com");
        //wad.findElement(By.id("email")).sendKeys("sivewav972@exitbit.com");
        WA.until(ExpectedConditions.presenceOfElementLocated(By.id("password"))).sendKeys("Testing12@");
        File tt = ((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
        FileHandler.copy(tt , new File("C:\\Users\\user\\Desktop\\31oct11.jpg"));
        System.out.println("scr : "+ tt.getAbsolutePath());
       WA.until(ExpectedConditions.visibilityOfElementLocated(By.id("login")));
        WA.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[contains(text(),Login)]"))).click();
        Thread.sleep(2000);
 //WA.until(ExpectedConditions.)

   }

}
