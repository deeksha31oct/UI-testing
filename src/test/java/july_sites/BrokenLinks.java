package july_sites;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

public class BrokenLinks {
    public static void main(String[] args) throws Exception {
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");   // your test page

        // Step 1: collect all links
        List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println("Total links: " + links.size());

        // Step 2: loop each link
        for (WebElement link : links) {
            String url = link.getAttribute("href");   // Step 3: get href

            // Step 4: skip invalid hrefs
            if (url == null || url.isEmpty() || url.startsWith("mailto") || url.startsWith("javascript")) {
                continue;
            }

            // Step 5: hit the URL and check status
            try {
                HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();
                conn.setRequestMethod("HEAD");        // HEAD = no body, faster
                conn.connect();
                int code = conn.getResponseCode();

                if (code >= 400)
                    System.out.println(url + " -> BROKEN (" + code + ")");
                else
                    System.out.println(url + " -> OK (" + code + ")");

            } catch (Exception e) {
                System.out.println(url + " -> BROKEN (exception)");
            }
        }
        driver.quit();
    }
}