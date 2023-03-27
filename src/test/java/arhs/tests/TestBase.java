package arhs.tests;

import arhs.pages.ContactPage;
import arhs.pages.MainPage;
import arhs.pages.NewsPage;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import arhs.config.WebDriverProvider;
import arhs.helpers.Attach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

public  class TestBase {

 MainPage mainPage = new MainPage();
    ContactPage contactPage = new ContactPage();
    NewsPage newsPage = new NewsPage();


    @BeforeAll
    static void beforeAll() {
        WebDriverProvider.config();
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