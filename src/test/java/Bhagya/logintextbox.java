package Bhagya;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class logintextbox {

    public static void main(String[]args) throws InterruptedException {
        ChromeDriver d = new ChromeDriver();
        d.get("https://demoqa.com/text-box");
        d.getTitle();
        System.out.println(d.getTitle());
        d.findElement(By.id("userName")).sendKeys("deeksha kashyap");
        d.findElement(By.id("userEmail")).sendKeys("deeksha@gmail.in");

        d.findElement(By.id("currentAddress")).sendKeys("ion digital zone");
        d.findElement(By.id("permanentAddress")).sendKeys("ion digital zone");

        d.findElement(By.id("submit")).click();
        Thread.sleep(2000);
d.quit();

    }
}
