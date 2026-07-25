package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ProductDetailsTest {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://test.aurazone.shop");

        Thread.sleep(3000);

        // Click Product
        driver.findElement(By.xpath("//h3[@title='Trail Blazer']")).click();

        Thread.sleep(3000);

        System.out.println("Current URL : " + driver.getCurrentUrl());

        if (driver.getCurrentUrl().contains("product")) {
            System.out.println("TEST PASSED");
        } else {
            System.out.println("TEST FAILED");
        }

        driver.quit();
    }
}
