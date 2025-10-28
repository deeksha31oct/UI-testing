package DSA.interview;
import org.openqa.selenium.io.FileHandler;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.reporters.Files;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;


public class asending_deseinding {
    public static void main(String[]args) throws IOException {
       WebDriver d = new ChromeDriver();
        Integer[]a ={1,2,4,2,5,2,76,36,86,32,88,222};
        //orign arrays
        System.out.println("orgin:"+ Arrays.toString(a));
        //desesnding
        Arrays.sort(a, Collections.reverseOrder());
        System.out.println("desending:"+ Arrays.toString(a));
        //asending
        Arrays.sort(a);
        System.out.println("asending:"+ Arrays.toString(a));


    }
}
