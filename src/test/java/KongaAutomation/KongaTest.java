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

        Thread.wait(5000);

        driver.manage().window().maximize();

        System.out.println(driver.getTitle());System.out.println(driver.getTitle());
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.findElement(By.id("https://www.konga.com/account/login?return_url=/")).click();

        driver.findElement(By.id("Email or phone")).sendKeys("08037532136");

        driver.findElement(By.id=("Enter your password")).sendKeys("kongatest");

        driver.findElement(By.id("Next")).click();

    }

    public static void main(String args[]) throws InterruptedException {
        KongaTest test = new KongaTest();
        test.setUp();
    }

