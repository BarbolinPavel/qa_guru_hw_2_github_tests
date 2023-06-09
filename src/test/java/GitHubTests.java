import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class GitHubTests {
    @Test
    void selenideSearch () {
        //Открываем GitHub
        open ("https://github.com/");

        $("[name='q']").click();
        $("[name='q']").setValue("selenide").pressEnter();
        $$("ul.repo-list li").first().$("a").click();
        $("#wiki-tab").click();

        $(".markdown-body").shouldHave(text("Welcome to the selenide wiki"));

        $("li.wiki-more-pages-link [type='button']").click();
        $("ul li.wiki-more-pages [href='/selenide/selenide/wiki/SoftAssertions']").click();

        $("#user-content-3-using-junit5-extend-test-class").ancestor("h4").shouldHave(text("JUnit5 extend test class"));
    }
}
