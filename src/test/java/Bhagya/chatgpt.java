package Bhagya;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Set;

public class chatgpt {
    public static void main(String[] args) throws InterruptedException {
            // ======== Chrome options ========
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--disable-popup-blocking");
            options.addArguments("--disable-notifications");
            // If using latest ChromeDriver you might need:
            options.addArguments("--remote-allow-origins=*");
            // Optionally reuse a real profile (be careful): options.addArguments("user-data-dir=C:\\path\\to\\profile");

            WebDriver dv = new ChromeDriver(options);
            WebDriverWait wait = new WebDriverWait(dv, Duration.ofSeconds(20));

            try {
                dv.manage().window().maximize();
                dv.get("https://www.trivago.in/");

                // Click Sign in
                WebElement signIn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(),'Sign in')]")));
                signIn.click();

                // Wait for the popup to appear and click the correct button (button that contains a span with text 'Google')
                WebElement googleButton = wait.until(ExpectedConditions.elementToBeClickable(
                        By.xpath("//button[.//span[contains(.,'Google')]]")));
                googleButton.click();

                // ===== handle new window/tab =====
                String originalWindow = dv.getWindowHandle();
                // wait for a new window handle to appear
                wait.until(d -> dv.getWindowHandles().size() > 1);

                Set<String> allWindows = dv.getWindowHandles();
                for (String handle : allWindows) {
                    if (!handle.equals(originalWindow)) {
                        dv.switchTo().window(handle);
                        break;
                    }
                }

                // Now we are (likely) on accounts.google.com window - wait for the email input
                // NOTE: replace the placeholders below with your test account details
                String testEmail = "your-test-email@gmail.com";
                String testPassword = "your-test-password";

                // email input
                WebElement emailInput = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("identifierId")));
                emailInput.sendKeys(testEmail);

                // next button
                WebElement idNext = wait.until(ExpectedConditions.elementToBeClickable(By.id("identifierNext")));
                idNext.click();

                // wait for password field - it may be inside a shadow DOM or different structure, but commonly:
                WebElement passwordInput = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password")));
                passwordInput.sendKeys(testPassword);

                WebElement passNext = wait.until(ExpectedConditions.elementToBeClickable(By.id("passwordNext")));
                passNext.click();

                // Optional: handle consent/allow page if shown
                // wait for some known element in the redirect or just wait and then switch back
                Thread.sleep(5000); // small wait for redirect (adjust or replace with proper waits)

                // Switch back to original window
                dv.switchTo().window(originalWindow);

                // Continue with assertions or further flows
                System.out.println("Returned to main window: " + dv.getTitle());

            } catch (Exception e) {
                System.err.println("Error during Google sign-in automation: " + e.getMessage());
                e.printStackTrace();
            } finally {
                // close all windows when done
                dv.quit();
            }
        }
    }


