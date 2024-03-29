package spicejet.Basepage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class TestBase {
    public static WebDriver driver;

    public static WebDriver setDriver() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\HD273UW\\Downloads\\chromedriver_win32\\chromedriver.exe");
        /*
        For using Chrome Options, we need to create the instance of
        ChromeOptions to set ChromeDriver specific capabilities
        and then pass the ChromeOptions object to the WebDriver/RemoteWebDriver constructor.
         */
//        ChromeOptions options = new ChromeOptions();
//        options.addArguments("--disable-notifications");
//        options.addArguments("disable-infobars");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        System.out.println("opening the chrome browser");
        return driver;
    }
    /*
    public void OpenNewTab (String string) {
        driver.switchTo().newWindow(WindowType.TAB);
        driver.navigate().to(string);
        System.out.println(driver.getTitle());
    }
     */



}
