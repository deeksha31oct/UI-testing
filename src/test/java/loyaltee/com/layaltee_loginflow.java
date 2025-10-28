package loyaltee.com;

import com.google.common.collect.Table;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

public class layaltee_loginflow {
    ChromeDriver d;
   @BeforeClass
           public void popup() {
       ChromeOptions co = new ChromeOptions();
       co.addArguments("disable_popup_block");
       co.addArguments("disable_notification");
       co.addArguments("remote_allow_origin=*");
        d = new ChromeDriver(co);
   }
    @Test
    public void login() throws InterruptedException, IOException {

        d.get("https://web.loyaltee.co/login/");
        d.manage().window().maximize();
        d.findElement(By.name("email")).sendKeys("deeksha.oct31@gmail.com");
        d.findElement(By.name("password")).sendKeys("Testing12@");
        d.findElement(By.xpath("//button[@type='submit']")).click();
        //Thread.sleep(5000);
        //select store and nevigate to add to wallet page
        String aaddToWalletXpath = "//div[@class='absolute inset-0 bg-gradient-to-t from-black/50 via-transparent to-transparent opacity-0 group-hover:opacity-100 transition-opacity duration-300']";

//wait to load the window
        WebDriverWait wait = new WebDriverWait(d, Duration.ofSeconds(5));
        WebElement click =   wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(aaddToWalletXpath)));
     click.click();
     //click to add to wallet to download the pass
   wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[@class='font-semibold']"))).click();

   File s = ((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
        FileHandler.copy(s, new File("C:\\Users\\user\\Desktop\\sct_1.jpg"));
        System.out.println("scr"+s.getAbsolutePath());
         }
}
