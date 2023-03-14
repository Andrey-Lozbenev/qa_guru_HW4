import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class TestGitHub {

    @BeforeAll
    static void beforeAll() {

        Configuration.browserSize = "1920x1080";
    }

        @Test
    void testJunit5(){
            //Откройте страницу Selenide в Github
        open("https://github.com/selenide/selenide");
            // Перейдите в раздел Wiki проекта
        $("#wiki-tab").click();
            //Убедитесь, что в списке страниц (Pages) есть страница SoftAssertions
        $(".js-wiki-more-pages-link").click();
        $("[data-filterable-for=wiki-pages-filter]").$(byText("SoftAssertions")).click();
            //Откройте страницу SoftAssertions, проверьте что внутри есть пример кода для JUnit5
        $("#wiki-wrapper").shouldHave(text("Using JUnit5 extend test class"));



    }




}
