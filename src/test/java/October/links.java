package October;

import Base_test.BaseClass;
import Listners.ExtentTestNGListener;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;

import javax.net.ssl.HttpsURLConnection;
import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
@Listeners(ExtentTestNGListener.class)
public class links extends BaseClass {
    @BeforeMethod()
    public void titel() {
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        //System.out.println( driver.getTitle());
    }

    @Test(groups = "regression", priority = 0)
    public void dropdown() throws InterruptedException {
        // driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5000));
        WebElement el = wait.until(ExpectedConditions.elementToBeClickable(By.id("dropdown-class-example")));


        Select s = new Select(el);
        s.selectByVisibleText("Option1");
        Thread.sleep(2000);
        s.selectByVisibleText("Option2");
        Thread.sleep(2000);
        s.selectByVisibleText("Option3");
        Thread.sleep(2000);
    }

    @Test(groups = "regresstion ", priority = 1)
    public void checkbox() throws InterruptedException {
        // driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        List<WebElement> check = driver.findElements(By.cssSelector("input[type='checkbox']"));
        for (WebElement select : check) {

            if (!select.isSelected()) {
                select.click();
            }
            Thread.sleep(2000);
        }
    }

    @Test(groups = "regression", priority = 3)
    public void drop_short() throws InterruptedException {
        // driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        WebDriverWait wa = new WebDriverWait(driver, Duration.ofSeconds(5000));
        WebElement dr = wa.until(ExpectedConditions.elementToBeClickable(By.id("dropdown-class-example")));
        Select st = new Select(dr);
        List<WebElement> option = st.getOptions();
        for (WebElement opt : option) {
            st.selectByVisibleText(opt.getText());
            Thread.sleep(2000);
        }
    }

    @Test
    public void switchtab() throws InterruptedException {

        WebElement tt = driver.findElement(By.id("opentab"));
        tt.click();
        Thread.sleep(2000);
        String per = driver.getWindowHandle();
        Set<String> chi = driver.getWindowHandles();
        for (String win : chi) {
            if (!win.equals(per)) {
                driver.switchTo().window(win);
                System.out.println(driver.getTitle());
                driver.close();
            }

            Thread.sleep(2000);

        }
        driver.switchTo().window(per);
        System.out.println(driver.getTitle());
        driver.quit();
    }

    @Test
    public void switchtab2() throws InterruptedException {
        WebElement tt = driver.findElement(By.id("opentab"));
        tt.click();
        List<String> tab = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tab.get(1));
        System.out.println(driver.getTitle());
        Thread.sleep(2000);
        driver.switchTo().window(tab.get(0));
        System.out.println(driver.getTitle());
        Thread.sleep(2000);
    }

    @Test
    public void text() throws InterruptedException {
        driver.findElement(By.xpath("//legend[text()='Suggession Class Example']"));
        System.out.println(driver.getTitle());
        WebDriverWait wt = new WebDriverWait(driver, Duration.ofSeconds(5000));
        //  wt.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id("autocomplete"))));
        //wt.withMessage("aumation");

        WebElement qt = driver.findElement(By.id("autocomplete"));
        Thread.sleep(2000);
        qt.sendKeys("ind");
        List<WebElement> we = wt.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("input[class='inputs ui-autocomplete-input']")));
        for (WebElement nt : we) {
            if (nt.getText().equalsIgnoreCase("india")) {
                nt.click();
                break;
            }
        }
        Thread.sleep(2000);
    }

    @Test(groups = "regression", priority = 4)
    public void suggesstion_text() throws InterruptedException {
        driver.findElement(By.xpath("//legend[text()='Suggession Class Example']"));
        WebElement ww = driver.findElement(By.id("autocomplete"));
        ww.sendKeys("usa");
        Thread.sleep(2000);
        WebDriverWait wq = new WebDriverWait(driver, Duration.ofSeconds(4000));
        List<WebElement> text = wq.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("input[class='inputs ui-autocomplete-input']")));
        for (WebElement suggest : text) {
            if (suggest.getText().equalsIgnoreCase("usa")) {
                suggest.click();
                break;
            }
        }
        Thread.sleep(2000);
    }

    @Test(groups = "regression", priority = 5)
    public void hoverover() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,800);");
        Thread.sleep(2000);
        Actions at = new Actions(driver);
        at.moveToElement(driver.findElement(By.xpath("//button[@id= 'mousehover']"))).perform();
        Thread.sleep(2000);
        at.contextClick();

    }

    @Test
    public void broken() throws InterruptedException, IOException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,900);");
        Thread.sleep(2000);
        WebElement link = driver.findElement(By.xpath("//a[text()='Broken Link']"));
        // link.click();
        Thread.sleep(2000);
        String ut = link.getAttribute("href");
        // Use HttpURLConnection to check the response code
        HttpURLConnection conn = (HttpURLConnection) new URL(ut).openConnection();
        conn.setRequestMethod("HEAD");
        conn.connect();
        int res = conn.getResponseCode();
        System.out.println("respone " + ut + "=" + res);
        if (res >= 400) {
            System.out.println("link detectd");
        } else {
            System.out.println("link active");
        }
    }

    @Test
    public void right_table_text() {
     List< WebElement> we =   driver.findElements(By.xpath("//div[@class='right-align']//table[@id='product']//tbody/tr"));
      for(WebElement ri : we)
      {
          List<WebElement> data = ri.findElements(By.tagName("td"));
          if (data.size() >= 2) {
              String position = data.get(1).getText();
              System.out.println("Position: " + position);
              String amount = data.get(3).getText();
              System.out.println("amount:"+ amount);}
      }

    }
    @Test
    public void texttable() {
        // Locate all rows inside the table body
        List<WebElement> rows = driver.findElements(By.xpath("//table[@id='product']//tbody/tr"));

        // Loop through each row
        for (WebElement row : rows) {
            // Try to extract second <td> (course name), skip if not present


            List<WebElement> cells = row.findElements(By.tagName("td"));
            if (cells.size() >= 2) {
                String courseName = cells.get(1).getText();
                System.out.println("Course: " + courseName);
            }
        }
    }


}





