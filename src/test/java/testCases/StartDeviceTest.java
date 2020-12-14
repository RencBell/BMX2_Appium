package testCases;

import base.BaseTest;
import pageObject.Bmx2StartPage;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class StartDeviceTest extends BaseTest {

    public AndroidDriver<AndroidElement> driver;

    @Test
    public void clickOnElement() {

        //Initialise page class
        // Bmx2StartPage bmx2StartPagepage = PageFactory.initElements(driver, Bmx2StartPage.class);

      Bmx2StartPage bmx2StartPage = new Bmx2StartPage(driver);

        //Initialise tests
        bmx2StartPage.selectIconfirmBox();
        bmx2StartPage.pressSubmit();
        bmx2StartPage.startRace();
    }
}
