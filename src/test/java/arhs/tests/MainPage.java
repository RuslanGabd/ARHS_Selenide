package arhs.tests;


import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.List;
import java.util.stream.Stream;

import static io.qameta.allure.Allure.step;

public class MainPage extends TestBase {

    static Stream<List<String>> headerTopMenu() {
        return Stream.of(List.of("HOME", "ABOUT US",
                "EXPERTISE", "CAREERS", "ENTITIES", "NEWS", "CONTACT"));
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
    @DisplayName("Verification that the transition was made to the main page")
    @Owner("RuslanG")
    @Test
    void mainPageByLogo() {
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
