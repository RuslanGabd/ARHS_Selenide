package arhs.config;

import com.codeborne.selenide.Configuration;
import arhs.tests.TestBase;
import com.codeborne.selenide.WebDriverRunner;
import org.aeonbits.owner.ConfigFactory;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;


public class WebDriverProvider extends TestBase {

    static WebDriverConfig config = ConfigFactory.create(WebDriverConfig.class, System.getProperties());


    public static void config() {
        Configuration.baseUrl = WebDriverProvider.config.getBaseUrl();
        Configuration.browserSize = WebDriverProvider.config.getBrowserSize();
        Configuration.browser = WebDriverProvider.config.getBrowserName();
        Configuration.browserVersion = WebDriverProvider.config.getBrowserVersion();
        Configuration.pageLoadStrategy = WebDriverProvider.config.getPageLoadStrategy();



        String remoteUrl = WebDriverProvider.config.getRemoteUrl();
        if (remoteUrl != null) {
            Configuration.remote = remoteUrl;
        }

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("enableVNC", true);
        capabilities.setCapability("enableVideo", true);
       // capabilities.setCapability(ChromeOptions.CAPABILITY, chromeOptions);
        Configuration.browserCapabilities = capabilities;
    }
}
