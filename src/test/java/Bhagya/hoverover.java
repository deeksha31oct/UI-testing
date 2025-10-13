package Bhagya;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class hoverover {
    public static void main(String[]args) throws InterruptedException, IOException {
        ChromeDriver dv = new ChromeDriver();
        dv.get("https://rahulshettyacademy.com/dropdownsPractise/");

        dv.manage().window().maximize();

         dv.findElement(By.xpath("//input[@name='ctl00_mainContent_ddl_originStation1_CTXT']")).click();

       WebElement web = dv.findElement(By.xpath("//a[@value='BHO']"));

        Thread.sleep(2000);

       WebElement ele = dv.findElement(By.xpath("//a[@value='GWL']"));

        Actions a = new Actions(dv);
        a.moveToElement(ele).contextClick().build().perform();
        File f = ((TakesScreenshot)dv).getScreenshotAs(OutputType.FILE);
        Files.copy(f.toPath(), new File("C:\\Users\\user\\Desktop\\screenshot\\move2.jpg").toPath());
    }
}
