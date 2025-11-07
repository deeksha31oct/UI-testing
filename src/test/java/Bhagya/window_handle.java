package Bhagya;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

public class window_handle {
    public static void main(String[]args)
    {
        ChromeOptions co= new ChromeOptions();
        co.addArguments("--disable-popup-blocking");
        co.addArguments("--disable-notification");
        co.addArguments("--remote-allow-origin=*");
        ChromeDriver d = new ChromeDriver();
        d.get("https://www.cotiviti.com/");
        d.manage().window().maximize();
        d.getTitle();
        System.out.println(d.getTitle());
        JavascriptExecutor js = (JavascriptExecutor)d;
        js.executeScript("window.scrollBy(0,1200);");
        WebDriverWait W = new WebDriverWait(d, Duration.ofSeconds(5000));
        d.switchTo().alert().accept();

        W.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@title='YouTube']"))).click();

        String s = d.getWindowHandle();
        System.out.println(s);

      Set<String> sw = d.getWindowHandles();
        System.out.println(sw);
        Iterator<String>it= sw.iterator();
        String paraent = (String) it.next();
        String child = (String) it.next();
        d.switchTo().window(child).close();


    }
}
