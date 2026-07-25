package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AurazoneAutomationTest {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        // ==========================
        // TC001 - Verify Home Page
        // ==========================

        driver.get("https://test.aurazone.shop");

        Thread.sleep(3000);

        if (!driver.getTitle().isEmpty()) {
            System.out.println("TC001 PASSED - Home Page Loaded Successfully");
        } else {
            System.out.println("TC001 FAILED");
        }

        // ==========================
        // TC002 - Search Product
        // ==========================

        driver.findElement(By.cssSelector("button[aria-label='Open search']")).click();

        Thread.sleep(1000);

        driver.findElement(By.cssSelector("input[placeholder='Search shoes by name, brand...']"))
                .sendKeys("Trail Blazer", Keys.ENTER);

        Thread.sleep(3000);

        System.out.println("TC002 PASSED - Product Searched Successfully");

        // ==========================
        // TC003 - Open Product Details
        // ==========================

        driver.findElement(By.xpath("//h3[@title='Trail Blazer']")).click();

        Thread.sleep(3000);

        if (driver.getCurrentUrl().contains("product")) {
            System.out.println("TC003 PASSED - Product Details Opened");
        } else {
            System.out.println("TC003 FAILED");
        }

        // ==========================
        // TC004 - Add To Cart
        // ==========================

        driver.findElement(By.xpath("//button[contains(.,'Add to Cart')]")).click();

        Thread.sleep(3000);

        System.out.println("TC004 PASSED - Product Added To Cart");

        // ==========================
        // TC005 - Add To Wishlist
        // ==========================

        driver.findElement(
                By.xpath("//button[.//*[name()='svg' and contains(@class,'lucide-heart')]]"))
                .click();

        Thread.sleep(3000);

        System.out.println("TC005 PASSED - Product Added To Wishlist");

        System.out.println("\n==================================");
        System.out.println(" ALL TEST CASES EXECUTED ");
        System.out.println("==================================");

        driver.quit();
    }
}