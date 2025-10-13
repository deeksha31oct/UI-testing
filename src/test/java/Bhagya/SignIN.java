package Bhagya;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SignIN {
public static void main(String[]args) throws InterruptedException {
    ChromeDriver d = new ChromeDriver();
    d.get("https://rahulshettyacademy.com/loginpagePractise/");
    d.manage().window().maximize();
    d.findElement(By.id("username")).sendKeys("deeksha31");
    Thread.sleep(2000);
    d.findElement(By.id("password")).sendKeys("Diksha12@");
   d.findElement(By.id("usertype")).click();
    Thread.sleep(2000);
   d.findElement(By.xpath("//select[@class='form-control'][1]"));
   d.findElement(By.id("terms")).click();
   d.findElement(By.id("signInBtn")).click();
    Thread.sleep(2000);


}
}
