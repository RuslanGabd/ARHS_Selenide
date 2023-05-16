package arhs.pages;

import com.codeborne.selenide.CollectionCondition;
import org.openqa.selenium.By;

import java.util.List;

import static com.codeborne.selenide.CollectionCondition.texts;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static org.openqa.selenium.By.linkText;

public class NewsPage {

    public NewsPage verifyPageNews(List<String> list) {
        $("ul.nav.nav-tabs.dropdown-menu").$$("li.nav-item").shouldHave(texts(list));
        return this;
    }

    public NewsPage verifyLinks(List<String> list) {
        $$("h2[class='thin mb-4']").shouldHave(texts(list));
        return this;
    }
}
