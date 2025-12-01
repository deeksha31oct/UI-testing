package utilites;

import org.openqa.selenium.OutputType;import org.openqa.selenium.TakesScreenshot;import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.Augmenter;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;import java.text.SimpleDateFormat;import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ScreenshotUtil {
    private static final Logger LOGGER = Logger.getLogger(ScreenshotUtil.class.getName());

    /**
     * Takes a screenshot and returns absolute path of created file.
     * Throws RuntimeException on irrecoverable errors to make problems visible.
     */
    public static String takeScreenshot(WebDriver driver, String namePrefix) {
        if (driver == null) {
            LOGGER.warning("ScreenshotUtil.takeScreenshot called with null driver");
            throw new IllegalArgumentException("WebDriver is null");
        }

        // Try to get a TakesScreenshot-capable driver
        TakesScreenshot tsDriver = null;
        try {
            if (driver instanceof TakesScreenshot) {
                tsDriver = (TakesScreenshot) driver;
                LOGGER.fine("Driver implements TakesScreenshot: " + driver.getClass().getName());
            } else if (driver instanceof RemoteWebDriver) {
                // Augment remote driver so it supports screenshots when using Selenium Grid / RemoteWebDriver
                LOGGER.fine("Attempting to augment RemoteWebDriver for screenshots: " + driver.getClass().getName());
                RemoteWebDriver remote = (RemoteWebDriver) driver;
                Object maybeAugmented = new Augmenter().augment(remote);
                if (maybeAugmented instanceof TakesScreenshot) {
                    tsDriver = (TakesScreenshot) maybeAugmented;
                    LOGGER.fine("Augmented driver supports TakesScreenshot");
                } else {
                    LOGGER.warning("Augmented RemoteWebDriver still doesn't implement TakesScreenshot");
                }
            } else {
                LOGGER.warning("Driver does not implement TakesScreenshot: " + driver.getClass().getName());
            }
        } catch (Exception e) {
            LOGGER.log(Level.WARNING, "Error while checking/augmenting driver for screenshots", e);
        }

        if (tsDriver == null) {
            throw new RuntimeException("Driver does not support screenshots (TakesScreenshot not available)");
        }

        // Build destination path
        String ts = new SimpleDateFormat("yyyyMMdd_HHmmssSSS").format(new Date());
        String filename = sanitizeFileName(namePrefix + "_" + ts + ".png");
        Path destDir = Paths.get(System.getProperty("user.dir"), "test-output", "screenshots");
        try {
            Files.createDirectories(destDir);
        } catch (IOException e) {
            LOGGER.log(Level.SEVERE, "Failed to create screenshot directory: " + destDir, e);
            throw new RuntimeException(e);
        }

        Path dest = destDir.resolve(filename);

        // Take screenshot and copy
        try {
            File tmp = tsDriver.getScreenshotAs(OutputType.FILE);
            Files.copy(tmp.toPath(), dest, StandardCopyOption.REPLACE_EXISTING);
            LOGGER.info("Screenshot saved to: " + dest.toAbsolutePath());
            return dest.toAbsolutePath().toString();
        } catch (IOException e) {
            LOGGER.log(Level.SEVERE, "IO error saving screenshot to " + dest, e);
            throw new RuntimeException(e);
        } catch (Exception e) {
            LOGGER.log(Level.SEVERE, "Unexpected error taking screenshot", e);
            throw new RuntimeException(e);
        }
    }

    private static String sanitizeFileName(String input) {
        return input.replaceAll("[^a-zA-Z0-9.-]", "");
    }
}