package arhs.pages;

import com.codeborne.selenide.WebDriverRunner;
import com.github.javafaker.Faker;
import org.openqa.selenium.Cookie;

import static com.codeborne.selenide.Condition.disabled;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.$;

public class ContactPage {


    public void fillForm(String lastName, String firstName, String userPhone, String userEmail, String message) {

        $("#firstname").setValue(firstName);
        $("#lastname").setValue(lastName);
        $("input[aria-describedby='Phone']").setValue(userPhone);
        $("#email").setValue(userEmail);
        $("#message").setValue(message);
        $("#agreed").click();

    }

    public void clickCheckBox() {
        switchTo().frame($x("//iframe[starts-with(@name, 'a-') and starts-with(@src, 'https://www.google.com/recaptcha')]"));
        $("span[id='recaptcha-anchor']").click();
        switchTo().defaultContent();
    }

    public void checkButtonSend() {
        $("#contactSubmit").shouldNotHave(disabled);
    }

    public void verifyText(String s) {
        $("div.col").shouldHave(text(s));
    }
}
