package july.infosys;

import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.*;
import java.security.PublicKey;


public class link {
    ChromeDriver cd = new ChromeDriver();
    @Test()
    public void launch()
    {
        cd.get("https://www.google.com/");
    cd.manage().window().maximize();
    WebElement qq = cd.findElement(By.id("APjFqb"));
    qq.sendKeys("amazon");
    WebDriverWait ww = new WebDriverWait(cd, Duration.ofSeconds(20));
    WebElement q = ww.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Amazon']")));
    q.click();


}
@Test(priority = 1)
    public void amozon()
{
    cd.get("https://www.amazon.in/");
    cd.manage().window().maximize();
    WebDriverWait yy = new WebDriverWait(cd, Duration.ofSeconds(20));
    WebElement m = yy.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Mobiles']")));
    m.click();
   List <WebElement> tt = cd.findElements(By.xpath("//span[@class='dcl-truncate dcl-product-title']"));
    for(WebElement t : tt)
    {
System.out.println(t.getText());
    }



}

}
