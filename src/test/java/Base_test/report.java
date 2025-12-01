package Base_test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.text.SimpleDateFormat;
import java.util.Date;

public class report {
    public static ExtentReports extent;
        public static ExtentTest test;

        @BeforeSuite
        public void setupReport() {
            String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
            ExtentSparkReporter sparkReporter = new ExtentSparkReporter("Reports/ExtentReport_" + timestamp + ".html");

            extent = new ExtentReports();
            extent.attachReporter(sparkReporter);

            extent.setSystemInfo("OS", "Windows");
            extent.setSystemInfo("Tester", "Deeksha");
        }

        @AfterSuite
        public void tearDownReport() {
            extent.flush(); // must be called to write the file
        }
    }


