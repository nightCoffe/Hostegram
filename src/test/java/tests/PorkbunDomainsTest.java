package tests;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static io.qameta.allure.Allure.step;

public class PorkbunDomainsTest extends TestBase {
    @Test
    void PorkbunOffer() {
        step("Открываем главную страницу", () -> {
            openUrl();
        });
        step("Переходим в раздел Domains", () -> {
            $(".item-tag11").click();
        });
        step("Переходим в предложение Porkbun", () -> {
            $("[data-id='6']").click();
        });
        step("Проверяем наличие предложений", () -> {
            $(".Post-body").shouldBe(visible)
                    .shouldHave(text("The gifts just keep on coming! End the year with a bang (for your buck) and" +
                            " a few more festive Buns. Check out our current best deals" +
                            " on regular and premium domains, plus powerful hosting to push" +
                            " those sites live. Cheers!"))
                    .shouldHave(text(".shop"))
                    .shouldHave(text("FIRST YEAR SALE "))
                    .shouldHave(text(".eu"))
                    .shouldHave(text(".bar"))
                    .shouldHave(text(".co"))
                    .shouldHave(text("SHOP REGULAR DOMAINS "))
                    .shouldHave(text(".wiki"))
                    .shouldHave(text(".vegas"))
                    .shouldHave(text(".blog"))
                    .shouldHave(text("75% off"))
                    .shouldHave(text(".buzz"))
                    .shouldHave(text("20% off"))
                    .shouldHave(text("SHOP PREMIUM DOMAINS"))
                    .shouldHave(text("SHOP 75% OFF WORDPRESS HOSTING"));
        });
    }
}
