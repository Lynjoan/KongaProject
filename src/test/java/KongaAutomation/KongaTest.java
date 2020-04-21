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
        Thread.sleep(1000);

        // maximize the window
        driver.manage().window().maximize();

        System.out.println(driver.getTitle());System.out.println(driver.getTitle());
        driver.get("https://www.konga.com/account/login");
        driver.findElement(By.xpath("//input[@id='username']")).sendKeys("");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("");
        driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div/div/div/div[1]/form/div[3]/button")).click();

       
    }
    public static void main(String args[]) throws InterruptedException {
        KongaTest test = new KongaTest();
                   test.setUp();
    }
}