package pageObject;

import base.BaseTest;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

public class Bmx2StartPage extends BaseTest {

    private final AndroidDriver<AndroidElement> driver;
  //  private static int DEFAULT_WAIT_TIME = 20;

    public Bmx2StartPage(AndroidDriver<AndroidElement> driver) {
        this.driver = driver;
      //  PageFactory.initElements(new AppiumFieldDecorator(driver), this);
     //   PageFactory.initElements(new AppiumFieldDecorator(driver, Duration.ofSeconds(DEFAULT_WAIT_TIME)), this);
    }

    public void selectIconfirmBox() {

        TouchAction action = new TouchAction(driver);
        action.press(PointOption.point(696, 749)).release().perform();

        // Check the "I confirm" box
       /* TouchAction touchAction = new TouchAction(driver);
        touchAction.press(PointOption.point(696, 749)).perform();*/
    }

    public void pressSubmit() {

        // Press the "Submit" button
        TouchAction touchAction = new TouchAction(driver);
        touchAction.tap(PointOption.point(1534, 807)).perform();
    }

    public void startRace() {

        // Start a Race
        TouchAction touchAction = new TouchAction(driver);
        touchAction.tap(PointOption.point(811, 882)).perform();
    }
}

/*    public void selectTheButton() {
       // driver.findElementByXPath("com.turborilla.bmx2:id/unitySurfaceView").click();
        confirmButton.click();
    }*/

 /*   public AndroidDriver<MobileElement> driver;
    public WebDriverWait wait;

    MobileElement selectButton = (MobileElement) driver.findElementById("com.turborilla.bmx2:id/unitySurfaceView");


    private final By iConfirmButton = By.id("com.turborilla.bmx2:id/unitySurfaceView");

    public AndroidDriver<MobileElement> getDriver() {
        return driver;
    }

    public void clickIconfirmButton (){
        driver.findElement(iConfirmButton).click();
    }*/

