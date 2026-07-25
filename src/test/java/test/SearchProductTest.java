package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SearchProductTest {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://test.aurazone.shop");

        Thread.sleep(2000);

        // Click Search Icon
        driver.findElement(By.cssSelector("button[aria-label='Open search']")).click();

        Thread.sleep(1000);

        // Enter Product Name
        driver.findElement(By.cssSelector("input[placeholder='Search shoes by name, brand...']"))
                .sendKeys("Nike", Keys.ENTER);

        Thread.sleep(3000);

        System.out.println("Current URL : " + driver.getCurrentUrl());

        System.out.println("Search Test Passed");

        driver.quit();
    }
}