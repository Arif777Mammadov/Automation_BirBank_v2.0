package Driver;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class Driver {
    public static AndroidDriver getDriver() throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("deviceName", "R58MA5SFA7F");
        caps.setCapability("platformName", "Android");
        caps.setCapability("app", "C:/Users/USER/Downloads/az.kapitalbank.mbanking_190_apps.evozi.com.apk");
        caps.setCapability("appWaitActivity", "*");
        caps.setCapability("noReset", "true");
        caps.setCapability("fullReset", "false");
        caps.setCapability("ignoreHiddenApiPolicyError", "true");
        caps.setCapability("autoGrantPermissions", "true");
        //Not all capabilities are needed in particular case, but they may be necessary for testing bank programs (ex.: noReset)
        URL u = new URL("http://127.0.0.1:4723/wd/hub");
        AndroidDriver ad = new AndroidDriver(u, caps);
        return ad;
    }
}
