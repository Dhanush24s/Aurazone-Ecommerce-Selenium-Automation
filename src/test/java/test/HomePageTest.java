package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HomePageTest {

    public static void main(String[] args) {

        // Automatically downloads the correct ChromeDriver
        WebDriverManager.chromedriver().setup();

        // Launch Chrome Browser
        WebDriver driver = new ChromeDriver();

        // Maximize Browser
        driver.manage().window().maximize();

        // Open Aurazone Website
        driver.get("https://test.aurazone.shop");

        // Get Page Title
        String actualTitle = driver.getTitle();

        System.out.println("Page Title : " + actualTitle);

        // Verify Home Page
        if (!actualTitle.isEmpty()) {
            System.out.println("TEST CASE PASSED");
            System.out.println("Home Page Loaded Successfully");
        } else {
            System.out.println("TEST CASE FAILED");
        }

        // Close Browser
        driver.quit();
    }
}
