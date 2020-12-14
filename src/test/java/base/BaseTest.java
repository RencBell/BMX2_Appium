package base;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.net.MalformedURLException;
import java.net.URL;

public class BaseTest {

    public AndroidDriver driver;

    @BeforeClass
    public void setUp() throws MalformedURLException {

        // ANDROID CAPABILITIES
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("platformName", "Android");
        desiredCapabilities.setCapability("platformVersion", "11.0");
        desiredCapabilities.setCapability("deviceName", "emulator-5554"); //DeviceId from "adb devices" command
        desiredCapabilities.setCapability("appPackage", "com.turborilla.bmx2");
        desiredCapabilities.setCapability("appActivity", "com.turborilla.bmx2mainactivity.MainActivity");
        desiredCapabilities.setCapability("automationName", "UiAutomator2");
        desiredCapabilities.setCapability("avd", "Pixel_4");
        desiredCapabilities.setCapability("app", "/Users/bells/IdeaProjects/BMX2/src/test/resources/bmx2.apk");

        // Initialize driver
        AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), desiredCapabilities);
        driver.resetApp();
    }

    @AfterClass
    public void tearDown() {
        driver.quit();

    }
}