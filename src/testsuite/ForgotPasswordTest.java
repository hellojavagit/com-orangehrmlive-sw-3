package testsuite;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.Utility;

public class ForgotPasswordTest extends Utility {
    String baseUrl = "https://opensource-demo.orangehrmlive.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }
    @Test
    public void userShouldNavigateToForgotPasswordPageSuccessfully() {

        clickOnElement(By.xpath("//a[contains(text(),'Forgot your password?')]"));
        verifyTextMessages("Password Forgot","Forgot your password?", By.xpath("//a[contains(text(),'Forgot your password?')]"));
    }
    @After
    public void tearDown(){
        closeBrowser();
    }
}

