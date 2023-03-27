package arhs.tests;

import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static io.qameta.allure.Allure.step;

public class NewsPage extends TestBase{

    List<String> listNewsChapter = Arrays.asList("News", "IT Blog", "Culture blog");

    String linkFacebook = "https://www.facebook.com/ArhsGroup";
    String linkLinkedin = "https://www.linkedin.com/company/arhs-group/";


    @Tag("ui")
    @DisplayName("Page News contains 3 chapter")
    @Owner("RuslanG")
    @Test
    void newsСhapter() {
        step("Open Main page", () -> {
            mainPage.openMainPage();
        });
        step("Open Career page", () -> {
            mainPage.openPage("Careers");
        });
        step("Check page contains 3 chapter", () -> {
            newsPage.verifyPageNews(listNewsChapter);
        });
    }

    @Tag("ui")
    @DisplayName("Page News links of social networks")
    @Owner("RuslanG")
    @Test
    void checkSocialMediaLink() {
        step("Open Main page", () -> {
            mainPage.openMainPage();
        });
        step("Open Career page", () -> {
            mainPage.openPage("Careers");
        });
        step("Check link on facebook", () -> {
            newsPage.verifyLink(linkFacebook);
        });
        step("Check link on LinkedIn", () -> {
            newsPage.verifyLink(linkLinkedin);
        });
    }

}
