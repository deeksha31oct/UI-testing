
package Listners;
 import com.aventstack.extentreports.ExtentReports;
 import com.aventstack.extentreports.ExtentTest;

import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
 import utilites.ScreenshotUtil;

public class ExtentTestNGListener implements ITestListener {
    private static ExtentReports extent;
    private static ThreadLocal<ExtentTest> test = new ThreadLocal<>();

    @Override
    public void onStart(ITestContext context) {
        String outDir = System.getProperty("user.dir") + "/test-output/extent";
        ExtentSparkReporter spark = new ExtentSparkReporter(outDir + "/index.html");
        spark.config().setReportName("My TestNG Suite Report");
        extent = new ExtentReports();
        extent.attachReporter(spark);
        extent.setSystemInfo("OS", System.getProperty("os.name"));
        extent.setSystemInfo("Environment", System.getProperty("env", "local"));
    }

    @Override
    public void onFinish(ITestContext context) {
        extent.flush();
    }

    @Override
    public void onTestStart(ITestResult result) {
        String testName = result.getMethod().getMethodName();
        ExtentTest extentTest = extent.createTest(testName);
        test.set(extentTest);
        extentTest.info("Test started: " + testName);
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        test.get().pass("Test passed");
    }

    @Override
    public void onTestFailure(ITestResult result) {
        // Log exception
        test.get().fail(result.getThrowable());

        // Try to take screenshot if driver available
        Object instance = result.getInstance();
        try {
            // Assuming your test base exposes a getDriver() method
            java.lang.reflect.Method m = instance.getClass().getMethod("getDriver");
            Object driverObj = m.invoke(instance);
            if (driverObj instanceof org.openqa.selenium.WebDriver) {
                org.openqa.selenium.WebDriver driver = (org.openqa.selenium.WebDriver) driverObj;
                String screenshotPath = ScreenshotUtil.takeScreenshot(driver, result.getMethod().getMethodName());
                // Attach screenshot to report
                test.get().addScreenCaptureFromPath(screenshotPath);
            }
        } catch (NoSuchMethodException e) {
            test.get().info("No getDriver() method found in test class, skipping screenshot.");
        } catch (Exception e) {
            test.get().info("Failed to capture screenshot: " + e.getMessage());
        }
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        test.get().skip("Test skipped");
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        // optional
    }
}
