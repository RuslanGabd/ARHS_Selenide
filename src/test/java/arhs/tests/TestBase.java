package arhs.tests;

import arhs.pages.ContactPage;
import arhs.pages.MainPage;
import arhs.pages.NewsPage;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import arhs.config.WebDriverProvider;
import arhs.helpers.Attach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;

public  class TestBase {

 MainPage mainPage = new MainPage();
    ContactPage contactPage = new ContactPage();
    NewsPage newsPage = new NewsPage();


    @BeforeAll
    static void beforeAll() {
        WebDriverProvider.config();

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--user-data-dir=./src/test/resources/Profile 2");
       // chromeOptions.addExtensions(new File("./src/test/profiles/chrome/extentions/bugmagnet.crx"));
        chromeOptions.addArguments("--start-maximized");
        chromeOptions.addArguments("disable-popup-blocking", "true");


      }


    @BeforeEach
    public void helpersConfig() {
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
 Selenide.clearBrowserCookies();

    }

    @AfterEach
    public void tearDown() {
        Attach.screenShotAs("Test result");
        Attach.pageSource();
        Attach.browserConsoleLogs();
        Attach.addVideo();
    }
}