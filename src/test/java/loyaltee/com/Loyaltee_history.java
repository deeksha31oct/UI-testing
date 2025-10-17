package loyaltee.com;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class Loyaltee_history {
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
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[@aria-label='Settings']"))).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[contains(text(),'View your stamp collection')]"))).click();
    }
 @Test(dependsOnMethods = {"history"})
        public void redeemed()
        {
 WebDriverWait re = new WebDriverWait(d , Duration.ofSeconds(6));
            //JavascriptExecutor js = new JavascriptExecutor() ;


 WebElement redeemed = re.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//P[contains(text(),'Redeemed')]")));
         redeemed.click();


 System.out.println("print redeemed data : "+ redeemed);
 //d.findElement(By.xpath("//span[contains(text(),'View your stamp collection')]")).click();
    }}

