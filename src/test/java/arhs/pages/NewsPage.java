package arhs.pages;

import java.util.List;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class NewsPage {

    public NewsPage verifyPageNews(List<String> list) {
        $("ul.nav.nav-tabs.dropdown-menu").$$("li.nav-item").contains(list);
        return this;
    }

    public void verifyLink(String link) {
        $("div.col-md-4.col-sm-12").shouldHave(text(link));
    }
}
