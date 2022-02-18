package tests;

import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static io.qameta.allure.Allure.step;

public class PorkbunDomainsTest extends TestBase {
    @Test
    @Owner("nightCoffe")
    @Feature("Offer")
    @Story("PorkbunOffer")
    @Severity(SeverityLevel.CRITICAL)
    @DisplayName("Оффер от Porkbun")
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
                    .shouldHave(text("FIRST YEAR SALE"));
        });
    }
}
