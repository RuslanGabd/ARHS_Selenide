package arhs.pages;

import org.openqa.selenium.By;

import java.util.List;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static org.openqa.selenium.By.linkText;

public class NewsPage {

    public NewsPage verifyPageNews(List<String> list) {
        System.out.println( $("ul.nav.nav-tabs.dropdown-menu").$$("li.nav-item"));
        $("ul.nav.nav-tabs.dropdown-menu").$$("li.nav-item").contains(list);
        return this;
    }

    public NewsPage verifyLink(String link) {
    //  $("div.row.mx-0.mb-3").$(linkText("hjkhk"));
       $("div.col-md-4dfdscol-sm-12").$("a[href='"+link+"']");
        return this;
    }
}
