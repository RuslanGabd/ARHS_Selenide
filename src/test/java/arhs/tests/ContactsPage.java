package arhs.tests;

import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static io.qameta.allure.Allure.step;

public class ContactsPage extends TestBase {



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
    @DisplayName("Test page with Facker library")
    @Test
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


}
