package arhs.tests;

import arhs.pages.ContactPageTest;
import arhs.pages.MainPageTest;
import arhs.pages.NewsPageTest;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import arhs.config.WebDriverProvider;
import arhs.helpers.Attach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

public class TestBase {

    MainPageTest mainPage = new MainPageTest();
    ContactPageTest contactPage = new ContactPageTest();
    NewsPageTest newsPage = new NewsPageTest();


    @BeforeAll
    static void beforeAll() {
        WebDriverProvider.config();
    }


    @BeforeEach
    public void helpersConfig() {
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
        Selenide.closeWebDriver();
    }

    @AfterEach
    public void tearDown() {
        Attach.screenShotAs("Test result");
        Attach.pageSource();
        Attach.browserConsoleLogs();
        Attach.addVideo();
    }
}