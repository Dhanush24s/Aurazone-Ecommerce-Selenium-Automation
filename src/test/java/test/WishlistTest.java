package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WishlistTest {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://test.aurazone.shop");

        Thread.sleep(3000);

        // Open Product
        driver.findElement(By.xpath("//h3[@title='Trail Blazer']")).click();

        Thread.sleep(3000);

        // Click Wishlist (Heart Icon)
        driver.findElement(
                By.xpath("//button[.//*[name()='svg' and contains(@class,'lucide-heart')]]"))
                .click();

        Thread.sleep(2000);

        System.out.println("Wishlist button clicked successfully");
        System.out.println("TEST PASSED");

        driver.quit();
    }
}
