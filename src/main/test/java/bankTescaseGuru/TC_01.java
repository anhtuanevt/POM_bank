package bankTescaseGuru;

import actions.commons.AbtractPage;
import actions.commons.AbtractTest;
import actions.commons.Contants;
import actions.page.Homepage;
import actions.page.LoginPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TC_01 extends AbtractTest {
    WebDriver driver;

    @BeforeClass
    public void beforeClass(String browser, String url){
        driver = openBrowser(browser,url);

        loginPage = new LoginPage(driver);

        loginPage.typeToUserName(Contants.USERNAME);
        loginPage.typeToPassword(Contants.PASSWORD);
        homepage = loginPage.clickToLogin();
    }

    @Test
    public void TC(){

    }

    @AfterClass
    public void afterClass(){
        driver.quit();
    }

    private Homepage homepage;
    private LoginPage loginPage;
}
