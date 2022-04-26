package testsuite;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.Utility;

public class LoginTest extends Utility {
    String baseUrl = "https://opensource-demo.orangehrmlive.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }
    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials() {

        sendTextToElement(By.id("txtUsername"),"Admin");
        //sending password fields
        sendTextToElement(By.name("txtPassword"),"admin123");
        //clicking the login button
        clickOnElement(By.id("btnLogin"));
        //verify the welcome text element and get text
        verifyTextMessages("Verifying","welcome",By.xpath("//a[@id='welcome"));
        //validate actual and expected message
       verifyTextMessages("ErrorMessage", "Welcome Fathi",By.xpath("//a[@id='welcome']"));
    }
    //closing the browser
    @After
    public void tearDown() {
        closeBrowser();
    }

}

