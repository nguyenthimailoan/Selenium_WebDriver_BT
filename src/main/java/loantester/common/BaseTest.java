package loantester.common;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class BaseTest {
    public static WebDriver driver;
    // khoi tao browser
    public static void creatDriver() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    //Đóng browser
    public static void closeDriver() {
        sleep(2);
        driver.quit();
    }

    public static void quitBrowser() {
        driver.quit();
    }

    public static void openURL(String url) {
        driver.get(url);
    }

    protected static void input(String xpath, String text) {
        driver.findElement(By.xpath(xpath)).sendKeys(text);
    }
    public static void click(String xpath) {
        driver.findElement(By.xpath(xpath)).click();
    }
    public static void sleep(int seconds) {
        try {
            Thread.sleep(1000 * seconds);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
