package loyaltee.com;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class trigo {

    @Test
    public void login() {
        ChromeOptions co = new ChromeOptions();
        co.addArguments("--disable-popup-blocking");
        co.addArguments("--disable-notifications");
        co.addArguments("--remote-allow-origins=*");
        ChromeDriver d = new ChromeDriver();
        d.get("https://www.trivago.in/");
        d.manage().window().maximize();
        WebDriverWait wait = new WebDriverWait(d, Duration.ofSeconds(5));

    }
}
