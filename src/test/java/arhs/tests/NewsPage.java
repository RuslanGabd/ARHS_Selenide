package arhs.tests;

import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.List;

import static io.qameta.allure.Allure.step;

public class NewsPage extends TestBase{

    List<String> listNewsChapter = Arrays.asList("klkl", "sfs", "affds");

    String linkFacebook = "https://www.facebook.com/ArhsGroupsdfds";
    String linkLinkedin = "https://www.linkedin.com/company/arhs-group/";


    @Tag("ui")
    @DisplayName("Page News contains 3 chapter")
    @MethodSource("listNewsChapter")
    @Owner("RuslanG")
    @Test
    void newsСhapter(List<String> chapters) {
        step("Open Main page", () -> {
            mainPage.openMainPage();
        });
        step("Open News page", () -> {
            mainPage.openPage("News");
        });
        step("Check page contains 3 chapter", () -> {
            newsPage.verifyPageNews(chapters);
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
        step("Open News page", () -> {
            mainPage.openPage("News");
        });
        step("Check link on facebook", () -> {
            newsPage.verifyLink("gfdgdf");
        });
//        step("Check link on LinkedIn", () -> {
//            newsPage.verifyLink(linkLinkedin);
//        });
    }

}
