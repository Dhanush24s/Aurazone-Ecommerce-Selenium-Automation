package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AddToCartTest {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://test.aurazone.shop");

        Thread.sleep(3000);

        // Open Product
        driver.findElement(By.xpath("//h3[@title='Trail Blazer']")).click();

        Thread.sleep(3000);

        // Click Add to Cart
        driver.findElement(By.xpath("//button[contains(.,'Add to Cart')]")).click();

        Thread.sleep(3000);

        System.out.println("Add to Cart button clicked successfully");
        System.out.println("TEST PASSED");

        driver.quit();
    }
}
