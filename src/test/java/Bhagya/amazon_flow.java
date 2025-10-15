package Bhagya;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class amazon_flow {
    public static  void main(String[]args)
    {
        ChromeOptions co = new ChromeOptions();
        co.addArguments("--disable-popup-blocking");
        co.addArguments("--disable-notifications");
        co.addArguments("--remote-allow-origins=*");
        ChromeDriver d = new ChromeDriver();
        d.get("https://www.amazon.in/");
        d.manage().window().maximize();
        WebDriverWait wait = new WebDriverWait(d, Duration.ofSeconds(5));
    wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("span[class='nav-line-2 ']"))).click();
    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='claim-input-container']//input"))).sendKeys("deeksha.oct31@gmail.com");
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("span[id='continue']"))).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.id("intention-submit-button"))).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.id("ap_phone_number"))).sendKeys("8115669459");
        wait.until(ExpectedConditions.elementToBeClickable(By.id("ap_customer_name"))).sendKeys("deeku");
        wait.until(ExpectedConditions.elementToBeClickable(By.id("ap_password"))).sendKeys("Diksha12@");
        wait.until(ExpectedConditions.elementToBeClickable(By.id("auth-continue"))).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("html/body/div/div/div[1]/button"))).click();





    }

}
