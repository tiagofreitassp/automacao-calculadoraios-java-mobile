package calculadoraMobileIOS;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.junit.Before;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class MobileDriver {
    protected static AppiumDriver<MobileElement>driver;
    private String xcodeOrgId = "3P3JYXL37U";
    private String xcodeSigningId = "iPhone 8 Plus";
    private String udid = "1ac1b2904df1922053361fdb6b3044d649e3d5fd";
    private String platformName = "iOS";
    private String deviceName = "TF-TysonSagan";
    private String platformVersion = "13.4.1";
    private String bundleId = "com.TiagoFreitas.SimpleCalculator";
    private String automationName = "XCUITest";
    private String driverApp = "/Users/user/Documents/Scripts programacao/XcodeProjects/Apps/Payload.ipa";

    public AppiumDriver<MobileElement> getDriver() throws MalformedURLException {
        if(driver == null) {
            criarDriverSmartphone();
        }
        return driver;
    }

    @Before
    public void criarDriverSmartphone() throws MalformedURLException {
        try{
            DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
            //desiredCapabilities.setCapability("xcodeOrgId", xcodeOrgId);
            desiredCapabilities.setCapability("xcodeSigningId", xcodeSigningId);
            desiredCapabilities.setCapability("udid", udid);
            desiredCapabilities.setCapability("platformName", platformName);
            desiredCapabilities.setCapability("deviceName", deviceName);
            desiredCapabilities.setCapability("platformVersion", platformVersion);
            desiredCapabilities.setCapability("bundleId", bundleId);
            desiredCapabilities.setCapability("automationName", automationName);
            desiredCapabilities.setCapability("app", driverApp);

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
        System.out.println("<<< Tiago Freitas - Versao: 1.1.280320 >>>");
        System.out.println("<<< Versao da plataforma iOS: 13.4.1 >>>");
    }
}
