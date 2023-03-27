package arhs;

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

public class WebTests extends TestBase {


    static Stream<List<String>> headerTopMenu() {
        return Stream.of(List.of("HOME", "ABOUT US",
                "EXPERTISE", "CAREERS", "ENTITIES", "NEWS", "CONTACT"));
    }
    List<String> listNewsChapter = Arrays.asList("News", "IT Blog", "Culture blog");

    @Tag("ui")
    @DisplayName("Check address, phone, email on the page Contact")
    @Owner("RuslanG")
    @Test
    void companyDetails() {

        step("Open Main page", () -> {
            mainPage.openMainPage();
        });
        step("Open Contact page", () -> {
            mainPage.openPage("Contact");
        });
        step("Check address, phone, email ", () -> {
            contactPage.verifyText("Boulevard du Jazz, 13");
            contactPage.verifyText("Phone: +352 26 11 02 1");
            contactPage.verifyText("info@arhs-group.com");
        });
    }

    @Tag("ui")
    @Owner("RuslanG")
    @MethodSource("headerTopMenu")
    @ParameterizedTest(name = "Top menu display 7 buttons")
    void checkTopMenu(List<String> buttons) {
        step("Open Main page", () -> {
            mainPage.openMainPage();
        });
        step("Check top menu contains 7 buttons", () -> {
            mainPage.verifyHeaderMenuItems(buttons);
        });
    }

    @Tag("ui")
    @DisplayName("Page News contains 3 chapter")
    @Owner("RuslanG")
    @Test
    void newsСhapter() {
        step("Open Main page", () -> {
            mainPage.openMainPage();
        });
        step("Open Main page 'Career'", () -> {
            mainPage.openPage("Careers");
        });
        step("Check page contains 3 chapter", () -> {
            mainPage.verifyPageNews(listNewsChapter);
        });
    }

    @Tag("ui")
    @DisplayName("Test page with Facker library")
    public void checkPartNews(String menuItem, String productForm) {

        step("Open Main page", () -> {
            mainPage.openMainPage();
        });
        step("Open Contacts page", () -> {
            mainPage.openPage("Contact");
        });
        step("Check page contains CONTACT FORM", () -> {
            mainPage.verifyPage("CONTACT FORM");
        });
        step("fill the form", () -> {
            contactPage.fillForm();
        });
        step("Check page contains CONTACT FORM", () -> {
            contactPage.clickCheckBox();
        });
        step("Check button Send", () -> {
            contactPage.checkButtonSend();
        });
    }

    @Tag("ui")
    @DisplayName("Verification that the transition was made to the main page")
    @Owner("RuslanG")
    @Test
    void gomainPageByLogo() {
        step("Open Main page", () -> {
            mainPage.openMainPage();
        });
        step("Open Contact page", () -> {
            mainPage.openPage("Contact");
        });
        step("Click logo on the left corner", () -> {
            mainPage.logoSite();
        });
        step("Verification that the transition was made to the main page", () -> {
            mainPage.verifyPage("AT THE HEART OF YOUR IT PROJECTS");
        });
    }
}
