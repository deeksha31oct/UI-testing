package October;

import Base_test.BaseClass;
import Listners.ExtentTestNGListener;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import javax.swing.*;
import javax.swing.plaf.PanelUI;
import java.security.PublicKey;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Listeners(ExtentTestNGListener.class)
public class internat_website  extends BaseClass {
    @BeforeMethod
    public void get_title() {
        driver.get("https://the-internet.herokuapp.com/");
        System.out.println(driver.getTitle());
    }

    @Test(groups = "internet link ell test", priority = 1)
    public void all_links() {
        driver.findElements(By.xpath("//div[@id='content']/ul/li")).forEach(el -> {
            System.out.println(el.getText());

        });
    }

    @Test(groups = "internet link ell test", priority = 2)
    public void ab_testinh() {
        WebElement cl = driver.findElement(By.xpath("//div[@id='content']/ul/li[1]/a"));
        cl.click();
        String tex = driver.findElement(By.xpath("//div[@class='example']/p")).getText();

        System.out.println(tex);
        driver.navigate().back();
        System.out.println(driver.getTitle());
    }

    @Test(groups = "internet link ell test", priority = 3)
    public void add_element() throws InterruptedException {
        WebElement add = driver.findElement(By.xpath("//div[@id='content']/ul/li[2]/a"));
        add.click();
        Thread.sleep(3000);
        WebElement ass = driver.findElement(By.xpath("//button[@onclick='addElement()']"));
        ass.click();
        System.out.println(ass);
        driver.navigate().back();
    }

    @Test(groups = "internet link ell test", priority = 4)
    public void basic_auth() throws InterruptedException {
        driver.findElement(By.xpath("//div[@id='content']/ul/li[3]/a")).click();
        Thread.sleep(3000);
        driver.get("https://the-internet.herokuapp.com/basic_auth");
        WebElement successMsg = driver.findElement(By.tagName("a"));
        System.out.println("Login message: " + successMsg.getText());
    }

    @Test(groups = "internet link ell test", priority = 5)
    public void broken_link() {
        driver.findElement(By.xpath("//div[@id='content']/ul/li[4]/a")).click();
        driver.findElements(By.xpath("//div[@class='example']/h3")).forEach(el -> {
            System.out.println(el.getText());
        });
        driver.navigate().back();
    }

    @Test(groups = "internet link ell test", priority = 6)
    public void checkbox() throws InterruptedException {
        WebDriverWait wt = new WebDriverWait(driver, Duration.ofSeconds(3000));
        wt.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//div[@id='content']/ul/li[6]/a"))));
        List<WebElement> clehc = driver.findElements(By.cssSelector("input[type='checkbox']"));
        for (WebElement checkbox : clehc) {
            if (!checkbox.isSelected()) {
                checkbox.click();
            }
            Thread.sleep(2000);
        }
    }

    @Test(groups = "internet link ell test", priority = 7)
    public void dropdown() throws InterruptedException {
        WebElement we = driver.findElement(By.xpath("//*[@id='content']/ul/li[11]/a"));
        we.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2000));
        WebElement dr = wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id("dropdown"))));
        Select sc = new Select(dr);
        List<WebElement> op = sc.getOptions();
        for (WebElement opti : op) {
            sc.selectByValue("1");
            Thread.sleep(2000);
            sc.selectByIndex(2);
            //sc.selectByIndex(2);
            Thread.sleep(2000);
        }
    }
    @Test(groups = "internet link ell test", priority = 8)
    public void javascript() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id='content']/ul/li[29]/a")).click();
        Thread.sleep(2000);
      WebElement at =   driver.findElement(By.xpath("//button[@onclick='jsAlert()']"));
              at.click();
        Alert con = driver.switchTo().alert();
        con.accept();
      WebElement q = driver.findElement(By.xpath("//button[@onclick='jsConfirm()']"));
      q.click();
      Alert dis= driver.switchTo().alert();
      dis.dismiss();
        Thread.sleep(2000);
      WebElement text = driver.findElement(By.xpath("//button[@onclick='jsPrompt()']"));
      text.click();
        Thread.sleep(2000);
      Alert dat= driver.switchTo().alert();
        System.out.println("Prompt Text: " + dat.getText());
      dat.sendKeys("deeksha");
        Thread.sleep(2000);
      dat.accept();
    }
    @Test(groups = "internet link ell test", priority = 9)
    public void hover_over() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id='content']/ul/li[25]/a")).click();
        List<WebElement> img = driver.findElements(By.xpath("//div[@class='figure']"));
        List<WebElement> list = driver.findElements(By.xpath("//div[@class='figcaption']/h5"));
        Actions at = new Actions(driver);
        for (int i = 0; i < img.size(); i++) {
            at.moveToElement(img.get(i)).perform();
            Thread.sleep(2000);
            System.out.println("date:" + img.get(i).getText());
        }
    }
    @Test(groups = "internet link ell test", priority = 10)
    public  void window_handle_2() throws InterruptedException {
        WebElement we=   driver.findElement(By.xpath("//div[@id='content']/ul/li[33]/a"));
        we.click();
      WebElement tt=   driver.findElement(By.xpath("//*[@id='content']/div/a"));
              tt.click();
        String per = driver.getWindowHandle();
        Set<String> chil = driver.getWindowHandles();
        for(String ch : chil)
        {
            if(!ch.equals(per))
            {
                driver.switchTo().window(ch);
                System.out.println(driver.getTitle());
            }

            Thread.sleep(2000);
            driver.switchTo().window(per);
            System.out.println(driver.getTitle());
            Thread.sleep(2000);
        }

    }
    @Test(groups = "internet link ell test", priority = 11)

        public void dynamic_element_1() {
        WebElement wet = driver.findElement(By.xpath("//div[@id='content']//li[12]/a"));
        wet.click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[@id='content']//div[@class='row']")));

        for (int i = 1; i <= 3; i++) {
            // Fetch each element fresh inside loop to avoid StaleElementReferenceException
            WebElement block = driver.findElement(By.xpath("(//div[@id='content']//div[@class='row'])[" + i + "]"));
            String text = block.getText().trim();
            if (!text.isEmpty()) {
                System.out.println("Block " + i + ": " + text);
                System.out.println("--------------");
            }
        }
    }

    }




