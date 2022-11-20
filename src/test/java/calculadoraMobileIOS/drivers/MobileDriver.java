package calculadoraMobileIOS.drivers;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.ios.IOSDriver;
import org.junit.Before;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class MobileDriver {
    protected static AppiumDriver driver;
    public String driverApp = "";

    public AppiumDriver getDriver() throws MalformedURLException {
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
            desiredCapabilities.setCapability("xcodeSigningId", "iPhone 14");
            desiredCapabilities.setCapability("udid", "3F7A19AE-CF02-4732-B19B-3A54D3909EB8");
            desiredCapabilities.setCapability("platformName", "iOS");
            desiredCapabilities.setCapability("deviceName", "iPhone 14");
            desiredCapabilities.setCapability("platformVersion", "16.1");
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
        System.out.println("<<< Tiago Freitas - Versao: 1.4.201122 >>>");
        System.out.println("<<< Versao da plataforma iOS: 16.1 >>>");
    }
}
