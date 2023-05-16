package arhs.tests;

import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static io.qameta.allure.Allure.step;

@Tag("NewsPage")
@Owner("RuslanG")
public class NewsPageTest extends TestBase {


    static Stream<List<String>> listNewsChapter() {
        return Stream.of(List.of("NEWS", "IT Blog", "Culture blog"));
    }

    static Stream<List<String>> articleTitle() {
        return Stream.of(List.of("Arηs Technology Celebrates Two Milestones", "Arηs Spikeseed achieves AWS competency status",
                "New entity – Finartix", "New entity – Arηs Portugal", "Arηs Spikeseed achieves the “AWS Advanced Consulting Partner” accreditation."));
    }


    @MethodSource("listNewsChapter")
    @ParameterizedTest(name = "Page News contains 3 chapter")
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


    @ParameterizedTest(name = "Page News contains article")
    @MethodSource("articleTitle")
    void checkArticleTitle(List<String> article) {
        step("Open Main page", () -> {
            mainPage.openMainPage();
        });
        step("Open News page", () -> {
            mainPage.openPage("News");
        });
        step("Check article title", () -> {
            newsPage.verifyLinks(article);
        });
    }
}
