package arhs.pages;

import com.github.javafaker.Faker;

import static com.codeborne.selenide.Condition.disabled;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.$;

public class ContactPage {

    Faker faker = new Faker();
    String firstName = faker.name().firstName();
    String lastName = faker.name().lastName();
    String userPhone = String.valueOf(faker.number().numberBetween(9370000000L, 9379999999L));
    String userEmail = faker.internet().emailAddress();
    String message = faker.lorem().sentence();




    public void fillForm() {

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

    public void checkButtonSend()  {
        $("#contactSubmit").shouldNotHave(disabled);
    }

    public void verifyText(String s) {
        $("div.col").shouldHave(text(s));
    }
}
