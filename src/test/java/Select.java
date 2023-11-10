import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class Select {
    private static WebDriver driver;
    public static void main(String[] args) {
        ChromeOptions option = new ChromeOptions();
        option.addArguments("--remote-allow-origins=*");
        option.addArguments("--disable-dev-shm-usage");
        option.addArguments("--ignore-ssl-errors=yes");
        option.addArguments("--ignore-certificate-errors");
        driver = new ChromeDriver(option);
        driver.get("https://letcode.in/slider");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        WebElement id = driver.findElement(By.id("generate"));
        Actions action = new Actions(driver);
        action.moveToElement(id).clickAndHold().moveByOffset(0,30).release().perform();

    }
}
