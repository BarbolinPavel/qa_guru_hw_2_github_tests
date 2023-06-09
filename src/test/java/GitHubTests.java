import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;

public class GitHubTests {
    @Test
    void selenideSearch () {
        //Открываем GitHub
        open ("https://github.com/");

        //Вводим в поле поиска "selenide"
        $("[name=\"q\"]").setValue("selenide").pressEnter();

        $$("ul.repo-list li").first().$("a").click();


        sleep(5000);
    }
}
