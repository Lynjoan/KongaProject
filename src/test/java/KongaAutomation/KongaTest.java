package KongaAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class KongaTest {
    private WebDriver driver;

    public void setUp() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.konga.com/");

        Thread.sleep(5000);

        driver.manage().window().maximize();

        System.out.println(driver.getTitle());System.out.println(driver.getTitle());
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.findElement(By.id("https://www.konga.com/account/login?return_url=/")).click();

        driver.findElement(By.id("Email or phone")).sendKeys("");

        driver.findElement(By.id("Enter your password")).sendKeys("");

        driver.findElement(By.id("Next")).click();

        // category and subcategory

        driver.findElements(By.id("https://www.konga.com/category/konga-fashion-1259")).click();

        driver. findElements(By.id(https://www.konga.com/category/konga-fashion-1259?menu=Konga%20Fashion%20%3E%20Women%27s%20Fashion));









    }
    public static void main(String args[]) throws InterruptedException {
        KongaTest test = new KongaTest();
        test.setUp();
    }