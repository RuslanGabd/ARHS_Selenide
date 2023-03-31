package arhs.tests;

import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static io.qameta.allure.Allure.step;
@Tag("arhs")
public class NewsPage extends TestBase{


    String linkFacebook = "https://www.facebook.com/ArhsGroupsdfds";
    String linkLinkedin = "https://www.linkedin.com/company/arhs-group/";
    static Stream<List<String>> listNewsChapter() {
        return Stream.of(List.of("NEWS", "IT Blog","Culture blog"));
    }

    @Tag("NewsPage")
    @DisplayName("Page News contains 3 chapter")
    @MethodSource("listNewsChapter")
    @ParameterizedTest(name = "Top menu display 7 buttons")

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

    @Tag("NewsPage")
    @DisplayName("Page News links of social networks")
    @Owner("RuslanG")
    @Test()
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
