package july_sites;

import Base_test.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class xpath
{
    @Test
    public void search () throws InterruptedException {
        ChromeDriver d = new ChromeDriver();
        d.get("https://www.google.com/");
        d.manage().window().maximize();

        WebElement box = d.findElement(By.name("q"));
        box.sendKeys("a");
        WebDriverWait wait = new WebDriverWait(d, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//ul[@role='listbox']//li")));

// "Amazon" wale suggestion pe click
        d.findElement(By.xpath("//li[.//span[text()='Amazon']]")).click();
    }

}
