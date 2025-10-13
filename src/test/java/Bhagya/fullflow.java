package Bhagya;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.Set;

public class fullflow {
    public static void main(String[] args) throws InterruptedException {

        //disable cookies
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-popup-blocking");
        options.addArguments("--disable-notifications");
        options.addArguments("--remote-allow-origins=*");
        WebDriver dv = new ChromeDriver();
        dv.manage().window().maximize();
        dv.get("https://www.trivago.in/");
        WebDriverWait wait = new WebDriverWait(dv, Duration.ofSeconds(20));

        // Click "Sign in"
        WebElement signIn = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//span[contains(text(),'Sign in')]")));
        signIn.click();

        // Small pause to let animation finish
        Thread.sleep(1500);

        // Wait until overlay disappears (if any)
        try {
            wait.until(ExpectedConditions.invisibilityOfElementLocated(
                    By.cssSelector("div[role='presentation']")));
        } catch (Exception ignored) {}

        // Find "Create account"
        WebElement createAccount = wait.until(ExpectedConditions.presenceOfElementLocated(
                By.xpath("//button[contains(.,'Create account')]")));

        // Sometimes overlay still blocks, so click with JS if normal click fails
        try {
            wait.until(ExpectedConditions.elementToBeClickable(createAccount)).click();
        } catch (ElementClickInterceptedException e) {
            ((JavascriptExecutor) dv).executeScript("arguments[0].click();", createAccount);
            System.out.println("Clicked 'Create account' via JavaScript due to overlay issue.");
        }

        // Wait for "Google" button
        WebElement googleButton = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//button[.//span[contains(text(),'Google')]]")));
        googleButton.click();
        System.out.println("Google button clicked successfully!");

        // --- Handle new tab ---
        String originalWindow = dv.getWindowHandle();
        wait.until(d -> dv.getWindowHandles().size() > 1);

        for (String handle : dv.getWindowHandles()) {
            if (!handle.equals(originalWindow)) {
                dv.switchTo().window(handle);
                System.out.println("Switched to Google login window.");
                break;
            }
        }

        // Verify Google login field (no actual login)
        WebElement emailField = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.id("identifierId")));
        System.out.println("Google login window opened, email field visible.");

        Thread.sleep(2000);
        emailField.sendKeys("deeksha.oct31@gmail.com");
        System.out.println("Email entered successfully!");
Thread.sleep(1000);

    }
    }
