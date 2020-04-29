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

        driver.findElement(By.id("https://www.konga.com/account/login?return_url=/"));

        driver.findElement(By.id("Email or phone")).sendKeys("");

        driver.findElement(By.id("Enter your password")).sendKeys("");

        driver.findElement(By.id("Continue")).click();

        // category and subcategory

        driver.findElements(By.id("https://www.konga.com/category/konga-fashion-1259"));

        driver.findElements(By.id("Women's Fashion"));

        //Search
        driver.findElements(By.id("https://www.konga.com/search?search=detergent?mobile_menu=open"));

        driver.findElement(By.id("https://www.konga.com/product/tecno-pop2-f-b1f-dual-sim-16gb-rom-beauty-camera-face-unlock-fingerprint-black-4327429"));

        //add to cart
        driver.findElement(By.id("Add To Cart")).click();

        driver.findElement(By.id("My Cart"));

        driver.findElement(By.id("increment")).click();

        //checkout
        driver.findElement(By.id("https://www.konga.com/checkout/complete-order"));

        //Payment
        driver.findElement(By.id("https://www.konga.com/account/login?return_url=/"));

        driver.findElement(By.id("Email or phone")).sendKeys("");

        driver.findElement(By.id("Enter your password")).sendKeys("");

        driver.findElement(By.id("Continue")).click();

        driver.findElement(By.id("selectPaymentMethod")).click();

        driver.findElement(By.id("Continue to Pay")).click();

        driver.findElement(By.id("dashboard-card__button Card")).click();

        driver.findElement(By.id("card-number")).sendKeys("5001231564337721756");

        driver.findElement(By.id("expiry")).sendKeys("08/00");

        driver.findElement(By.id("cvv")).sendKeys("123");

        driver.findElement(By.id("card-pin-new")).sendKeys("");

        driver.findElement(By.id("validateCardForm")).click();

    }
    public static void main(String args[]) throws InterruptedException {
        KongaTest test = new KongaTest();
        test.setUp();
    }