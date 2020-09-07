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
    public String driverApp = "/Users/testador/Documents/Scripts programacao/XcodeProjects/Apps/SimpleCalculator.ipa";

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
            desiredCapabilities.setCapability("platformVersion", "13.7");
            desiredCapabilities.setCapability("bundleId", "com.TiagoFreitas.SimpleCalculator");
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
            desiredCapabilities.setCapability("xcodeSigningId", "iPhone 8");
            desiredCapabilities.setCapability("udid", "C1671298-B5D4-48CD-B70A-BC1D8FF8324D");
            desiredCapabilities.setCapability("platformName", "iOS");
            desiredCapabilities.setCapability("deviceName", "iPhone 8");
            desiredCapabilities.setCapability("platformVersion", "13.6");
            desiredCapabilities.setCapability("bundleId", "com.TiagoFreitas.SimpleCalculator");
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
            driver.closeApp();
        }
    }

    public static void versaoApp() {
        System.out.println("<<< Tiago Freitas - Versao: 1.3.070920 >>>");
        System.out.println("<<< Versao da plataforma iOS: 13.6 >>>");
    }
}
