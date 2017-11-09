package actions.page;

import actions.commons.AbtractPage;
import org.openqa.selenium.WebDriver;

import static intefaces.bankguru99.LoginPageUI.Login_Button;
import static intefaces.bankguru99.LoginPageUI.Password_Texbox;
import static intefaces.bankguru99.LoginPageUI.Username_Texbox;

public class LoginPage extends AbtractPage {
    WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void typeToUserName(String username) {
        typeToElement(driver,Username_Texbox,username);
    }

    public void typeToPassword(String password) {
        typeToElement(driver,Password_Texbox,password);
    }

    public Homepage clickToLogin() {
        clickToElement(driver,Login_Button);
        return new Homepage(driver);
    }
}
