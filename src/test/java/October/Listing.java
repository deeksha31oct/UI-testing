package October;

import Base_test.BaseClass;
import Listners.ExtentTestNGListener;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import javax.swing.*;
import java.sql.Driver;
import java.time.Duration;
import java.util.List;
import java.util.Set;
@Listeners(ExtentTestNGListener.class)
public class Listing extends BaseClass {
    @BeforeMethod
    public void setup() throws InterruptedException {
driver.get("https://www.amazon.in/");
        System.out.println(driver.getTitle());
        Thread.sleep(2000);
    }
    @Test
    public void list_of_toys_2() throws InterruptedException {
        WebElement lists = driver.findElement(By.xpath("//input[@type='text']"));
        lists.sendKeys("toys");
        Thread.sleep(2000);

        WebElement TR = driver.findElement(By.xpath("//div[@aria-label='toys for boys 7-14 years']"));

        TR.click();
        List<WebElement> allProducts = driver.findElements(By.xpath("//div[@data-component-type='s-search-result']"));
        System.out.println("Total products listed: " + allProducts.size());

       driver.findElements(By.xpath("//div[@data-component-type='s-search-result']")).forEach(w->{
           //System.out.println(w.findElement(By.xpath(".//a[@class='a-link-normal s-line-clamp-4 s-link-style a-text-normal']")).getSize();
           System.out.println(w.findElement(By.xpath(".//a[@class='a-link-normal s-line-clamp-4 s-link-style a-text-normal']")).getText());
       });
    }
    @Test
    public void tablet() throws InterruptedException {
        WebElement price = driver.findElement(By.id("twotabsearchtextbox"));
        price.sendKeys("tablet");
        Thread.sleep(2000);
        WebElement se = driver.findElement(By.xpath("//div[@aria-label='tablets under 20000']"));
        se.click();
        List<WebElement> all = driver.findElements(By.xpath("//span[@data-component-type='s-search-results']"));
        System.out.println("Total products listed: " + all.size());
driver.findElements(By.xpath("//div[@class='s-main-slot s-result-list s-search-results sg-row']")).forEach(q->
{
    System.out.println(q.findElement(By.xpath("//a[@class='a-link-normal s-line-clamp-2 s-line-clamp-3-for-col-12 s-link-style a-text-normal']/h2/span")).getText());
});
    }
}
