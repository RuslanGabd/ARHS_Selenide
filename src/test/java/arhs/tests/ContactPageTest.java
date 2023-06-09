package arhs.tests;

import com.github.javafaker.Faker;
import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static io.qameta.allure.Allure.step;

@Tag("ContactPage")
@Owner("RuslanG")
public class ContactPageTest extends TestBase {


    Faker faker = new Faker();
    String firstName = faker.name().firstName();
    String lastName = faker.name().lastName();
    String userPhone = String.valueOf(faker.number().numberBetween(9370000000L, 9379999999L));
    String userEmail = faker.internet().emailAddress();
    String message = faker.lorem().sentence();

    @DisplayName("Check address, phone, email on the page Contact")
    @Test
    void companyDetails() {

        step("Open Main page", () -> {
            mainPage.openMainPage();
        });
        step("Open Contact page", () -> {
            mainPage.openPage("Contact");
        });
        step("Check address, phone, email ", () -> {
            contactPage.verifyTextContactPage("Boulevard du Jazz, 13");
            contactPage.verifyTextContactPage("Phone: +352 26 11 02 1");
            contactPage.verifyTextContactPage("info@arhs-group.com");
        });
    }


    @DisplayName("Test page with Facker library")
    @Test
    public void checkContactForm() {

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
            contactPage.fillForm(firstName, lastName, userPhone, userEmail, message);
        });
        step("click reCaptcha", () -> {
            contactPage.clickCheckBoxContactForm();
        });

//        step("Check button Send", () -> {
//            contactPage.checkButtonSend();
//        });
    }
}
