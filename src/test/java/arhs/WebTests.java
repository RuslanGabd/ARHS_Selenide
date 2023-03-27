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
            mainPage.verifyButtons("Boulevard du Jazz, 13");
            mainPage.verifyButtons( "Phone: +352 26 11 02 1");
            mainPage.verifyButtons("info@arhs-group.com");
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
        step("Проверка, что страница содержит меню на 5 разделов страницы", () -> {
            mainPage.verifyPageNews(listNewsChapter);
        });
    }

//    @Tag("ui")
//    @CsvSource({"Ruslan, Gabdrakhimov"})
//    @ParameterizedTest(name = "В разделе {0} есть строка {1}")
//    public void checkPartNews(String menuItem, String productForm) {
//        step("Перейти на главную страницу", () -> {
//            mainPage.openMainPage();
//        });
//        step("Навести курсор на раздел {0}", () -> {
//            mainPage.hoverMenuItem(menuItem);
//        });
//        step("Проверить, что в каталоге есть формат {1}", () -> {
//            mainPage.verifyProduct(productForm);
//        });
//    }

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
