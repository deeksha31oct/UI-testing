package loyaltee.com;
import Listners.ExtentTestNGListener;
import org.openqa.selenium.io.FileHandler;
import org.jspecify.annotations.Nullable;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.time.Duration;

@Listeners(ExtentTestNGListener.class)
public class Loyaltee_history {
   WebDriver  d  ;
    //ChromeDriver d;


    public WebDriver getDriver() {
        return d;
    }

    @BeforeClass
    public void popup() {
        ChromeOptions co = new ChromeOptions();
        co.addArguments("disable_popup_block");
        co.addArguments("disable_notification");
        co.addArguments("remote_allow_origin=*");
        co.addArguments("--window-size=1920,1080");
        d = new ChromeDriver(co);
    }

    @Test
    public void login() throws InterruptedException {

        d.get("https://web.loyaltee.co/login/");
        d.manage().window().maximize();
        d.findElement(By.name("email")).sendKeys("deeksha.oct31@gmail.com");
        d.findElement(By.name("password")).sendKeys("Testing12@");
        d.findElement(By.xpath("//button[@type='submit']")).click();
    }
    @Test(dependsOnMethods = {"login"})
    public void history() {
        WebDriverWait wait = new WebDriverWait(d, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[@aria-label='Settings[]']"))).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[contains(text(),'View your stamp collection')]"))).click();
    }

   //  @Test(dependsOnMethods = {"history"})
        public void redeemed() throws IOException {
             WebDriverWait re = new WebDriverWait(d, Duration.ofSeconds(6));
             //JavascriptExecutor js = new JavascriptExecutor() ;

             try {
                 WebElement redeemed = re.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//P[contains(text(),'Redeemed')]")));
                 redeemed.click();


                 System.out.println("print redeemed data : " + redeemed);

                 //d.findElement(By.xpath("//span[contains(text(),'View your stamp collection')]")).click();

                      File take = ((TakesScreenshot) d).getScreenshotAs(OutputType.FILE);
                 File dest = new File("C:\\Users\\user\\Desktop\\loyaltee_screenshot_1.jpg");
             FileHandler.copy(take, dest);
             System.out.println("save:"+ dest.getAbsolutePath());
             } catch (Exception e ){
                 System.out.println("Redeemed click pass. Taking screenshot...");
            }
    }
    //@AfterClass
    public void tearDown() {
        if (d != null) d.quit();
    }

}

