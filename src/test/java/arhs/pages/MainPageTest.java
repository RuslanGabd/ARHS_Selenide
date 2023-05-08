package arhs.pages;

import java.util.List;

import static com.codeborne.selenide.CollectionCondition.texts;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class MainPageTest {

    public MainPageTest openMainPage() {
        open("https://arhs-group.com/");
        return this;
    }

    public MainPageTest openPage(String page) {
        $("#navbarMainMenu").$(byText(page)).click();
        return this;
    }


    public MainPageTest clickLogoSite() {
        $("a.navbar-brand.ms-3").click();
        return this;
    }

    public MainPageTest verifyPage(String text) {
        $("#content").shouldHave(text(text));
        return this;
    }

    public MainPageTest verifyHeaderMenuItems(List<String> buttons) {
        $("#navbarMainMenu").$$("li.nav-item.mx-3").shouldHave(texts(buttons));
        return this;
    }
}
