package calculadoraMobileIOS.drivers;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import org.junit.Before;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class MobileDriver {
    protected static AppiumDriver<MobileElement>driver;
    public String driverApp = "";

    public AppiumDriver<MobileElement> getDriver() throws MalformedURLException {
        if(driver == null) {
            criarDriver();
        }
        return driver;
    }

    @Before
    public void criarDriver() throws MalformedURLException {
        criarDriverSimulator();
        //criarDriverSmartphone();
    }

    public void criarDriverSmartphone() throws MalformedURLException {
        try{
            DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
            //desiredCapabilities.setCapability("xcodeOrgId", "3P3JYXL37U");
            desiredCapabilities.setCapability("xcodeSigningId", "iPhone 8 Plus");
            desiredCapabilities.setCapability("udid", "1ac1b2904df1922053361fdb6b3044d649e3d5fd");
            desiredCapabilities.setCapability("platformName", "iOS");
            desiredCapabilities.setCapability("deviceName", "TF-Testador");
            desiredCapabilities.setCapability("platformVersion", "14.3");
            desiredCapabilities.setCapability("bundleId", "com.mouredev.iOS-Calculator");
            desiredCapabilities.setCapability("automationName", "XCUITest");
            //desiredCapabilities.setCapability("app", driverApp);

            URL remoteUrl = new URL("http://localhost:4723/wd/hub");

            driver = new IOSDriver(remoteUrl, desiredCapabilities);
        }catch (Exception e){
            e.getMessage();
        }
    }

    public void criarDriverSimulator() throws MalformedURLException {
        try{
            DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
            //desiredCapabilities.setCapability("xcodeOrgId", xcodeOrgId);
            desiredCapabilities.setCapability("xcodeSigningId", "iPhone SE (2nd generation)");
            desiredCapabilities.setCapability("udid", "1B86E7B3-45AA-4DFE-B5A4-446C8534D2E5");
            desiredCapabilities.setCapability("platformName", "iOS");
            desiredCapabilities.setCapability("deviceName", "iPhone SE (2nd generation)");
            desiredCapabilities.setCapability("platformVersion", "14.5");
            desiredCapabilities.setCapability("bundleId", "com.mouredev.iOS-Calculator");
            desiredCapabilities.setCapability("automationName", "XCUITest");
            //desiredCapabilities.setCapability("app", driverApp);

            URL remoteUrl = new URL("http://localhost:4723/wd/hub");

            driver = new IOSDriver(remoteUrl, desiredCapabilities);
        }catch (Exception e){
            e.getMessage();
        }
    }

    public void killDriver() {
        if(driver != null) {
            //driver.closeApp();
            driver.quit();
        }
    }

    public static void versaoApp() {
        System.out.println("<<< Tiago Freitas - Versao: 1.3.120521 >>>");
        System.out.println("<<< Versao da plataforma iOS: 14.5 >>>");
    }
}
