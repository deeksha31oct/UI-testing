package july_sites;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class amozone {
    WebDriver cd ;
    @BeforeClass
    public void launch_browsers()
    {
         cd = new ChromeDriver();
        cd.get("https://www.amazon.in/");
        cd.manage().window().maximize();
        System.out.println(cd.getTitle());

    }
    @BeforeMethod
    public void search_mouse()
    {
        WebDriverWait q = new WebDriverWait(cd,Duration.ofSeconds(10));
       WebElement se =  q.until(ExpectedConditions.elementToBeClickable((By.id("twotabsearchtextbox"))));
       se.sendKeys("mouse", Keys.ENTER);
    }
    @Test
    public void mobile_list() {
        WebDriverWait t = new WebDriverWait(cd, Duration.ofSeconds(10));
        List<WebElement> wq = t.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//div[@data-component-type='s-search-result']//h2//span")));
        for (WebElement gt : wq) {
            System.out.println(gt.getText());
        }
    }
    @Test
    public void best_sellecr_CLICK()
    {
        WebDriverWait b = new WebDriverWait(cd, Duration.ofSeconds(10));
       WebElement bb = b.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'Bestsellers')]")));
        bb.click();

    }
    @Test
    public void bext_seller_result()
    {

    }
    @AfterTest
    public void close ()
    {
        cd.close();
    }
}