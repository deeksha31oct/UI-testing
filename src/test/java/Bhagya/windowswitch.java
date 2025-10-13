package Bhagya;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class windowswitch {
    public static void main(String[]args) throws InterruptedException {
        ChromeDriver d = new ChromeDriver();

        d.get("https://demoqa.com/browser-windows");

        d.manage().window().maximize();

        d.getTitle();
        System.out.println(d.getTitle());
        Thread.sleep(2000);
        WebElement w = d.findElement(By.id("windowButton"));
       w.click();
     String s =    d.getWindowHandle();
     //Thread.sleep(1000);

     System.out.println(s);
        Set<String> sw = d.getWindowHandles();
        System.out.println(sw);
        // id ilitrate from parent and child
        Iterator<String> ret = sw.iterator();
        String per = (String)ret.next();

        String child = (String)ret.next();

       d.switchTo().window(child).close();

    }

}
