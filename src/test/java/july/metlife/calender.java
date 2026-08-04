package july.metlife;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class calender
{
    WebDriver cd;
    @BeforeMethod
            public void browser() {
        ChromeOptions op = new ChromeOptions();
        op.addArguments("--remote-allow-origins=*");
        //op.addArguments("--headless");
        op.addArguments("unhandledexpectedalertbehaviour=ignore");
         cd = new ChromeDriver(op);
    }
@Test
    public void date ()
{
    cd.get("https://www.makemytrip.com/flights/?cmp=SEM|D|DF|G|Brand|Brand-BrandExact_DT|B_M_Makemytrip_Search_Exact|Brand_Flight_Exact|RSA&gad_source=1&gad_campaignid=13978388&gbraid=0AAAAAD5Az1RQOCOJQvReYkNpFFPSmUjZg&gclid=CjwKCAjw7KvTBhA6EiwAWnutYRWKU9A2ExYeGNOtliSbDUki3v1C6CzicIrUw_KL8_l5jZZC95eX9xoCcSwQAvD_BwE");
   cd.manage().window().maximize();
   WebElement l = cd.findElement(By.xpath("//span[contains(text(),'Departure')]"));
   l.click();
  WebElement w=  cd.findElement(By.xpath("//div[@aria-label='Sat Aug 01 2026']"));
  w.click();
}
}
