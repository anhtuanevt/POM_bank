package actions.commons;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.util.concurrent.TimeUnit;
import static actions.commons.Contants.FIREFOX_PATH;

public class AbtractTest {
    WebDriver driver;

    public WebDriver openBrowser(String browser, String url){
        if (browser.equalsIgnoreCase("firefox")){
            System.setProperty("webdriver.gecko.driver",FIREFOX_PATH);
            driver = new FirefoxDriver();
        }
        else if (browser.equalsIgnoreCase("chrome")){
            System.setProperty("webdriver.chrome.driver",FIREFOX_PATH);
            driver = new ChromeDriver();
        }
        else if (browser.equalsIgnoreCase("ie")){
            System.setProperty("webdriver.ie.driver",FIREFOX_PATH);
            driver = new InternetExplorerDriver();
        }
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        return driver;
//        /jjdjdjasj
//        /jjdjdjasj
    }
}
