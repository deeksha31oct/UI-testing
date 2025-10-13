package Bhagya;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Crmorange {
    public static void main(String[]args) throws InterruptedException {
        ChromeDriver d = new ChromeDriver();
        d.get("https://rahulshettyacademy.com/locatorspractice/");
        d.manage().window().maximize();
       d.findElement(By.id("inputUsername")).sendKeys("Admin");
      //  d.findElement(By.className("oxd-input oxd-input--active")).sendKeys("Admin");

        d.findElement(By.name("inputPassword")).sendKeys("admin123");
        d.findElement(By.id("chkboxOne")).click();
        d.findElement(By.id("chkboxTwo")).click();

        d.findElement(By.className("submit signInBtn")).click();
        Thread.sleep(2000);
        d.quit();


    }
}
