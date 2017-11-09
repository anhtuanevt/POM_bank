package actions.commons;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AbtractPage {
    public void clickToElement(WebDriver driver, String controlName) {
        WebElement element = driver.findElement(By.xpath(controlName));
        element.click();
    }

    public void typeToElement(WebDriver driver, String controlName, String value) {
        WebElement element = driver.findElement(By.xpath(controlName));
        element.clear();
        element.sendKeys(value);
    }

    public String getTextWebElement(WebDriver driver, String controlName) {
        WebElement element = driver.findElement(By.xpath(controlName));
        return element.getText();
    }
}
