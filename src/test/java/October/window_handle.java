package October;

import Base_test.BaseClass;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Set;

public class window_handle extends BaseClass {
    @Test
    public  void handle()
    {
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.manage().window().maximize();
        driver.findElement(By.id("openwindow")).click();

        String parent = driver.getWindowHandle();
        Set<String> all_windor = driver.getWindowHandles();
        for(String child : all_windor)
        {
if(!child.equals(parent))
{
driver.switchTo().window(child);
System.out.println("new window title :"+ driver.getTitle());
driver.close();
}
        }
        driver.switchTo().window(parent);
        System.out.println("back title : "+ driver.getTitle());
        driver.quit();
    }
    @Test
    public void frame()
    {
        JavascriptExecutor JS = (JavascriptExecutor)driver;
        JS.executeScript("window.scrollBy(0,600);");
        driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[id='courses-iframe']")));
        driver.findElement(By.linkText("All Access Plan")).click();
        driver.switchTo().defaultContent();
    }

}
