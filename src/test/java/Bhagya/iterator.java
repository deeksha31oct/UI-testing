package Bhagya;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Iterator;
import java.util.Set;


public class iterator {
    public static void main (String[]args) throws InterruptedException , IOException{
        ChromeDriver dv = new ChromeDriver();
        dv.get("https://rahulshettyacademy.com/locatorspractice/#");
        dv.manage().window().maximize();
        dv.getTitle();
        System.out.println(dv.getTitle());
        WebElement wev= dv.findElement(By.xpath("//button[@id='visitUsTwo']"));

        wev.click();
        Thread.sleep(2000);
        String st= dv.getWindowHandle();
        System.out.println(st);

        Set<String> mt = dv.getWindowHandles();
        System.out.println(mt);
        Iterator<String> it = mt.iterator();

        String per = (String)it.next();
        String chil = (String)it.next();

        dv.switchTo().window(chil).close();
        //File screenshot = ((TakesScreenshot) dv).getScreenshotAs(OutputType.FILE);
      //  File f= (File) ((File)dv.getScreenshotAs(OutputType.FILE));

       // Files.copy(f , new File("C:\\Users\\user\\Desktop\\screenshot\\ITERATOR2.jpg"));
        dv.close();


       // Files.copy(screenshot,new File("C:\\Users\\user\\Desktop\\screenshot\\ITERATOR2.jpg"));
        dv.close();

    }
}
