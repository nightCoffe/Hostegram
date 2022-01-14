package tests;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static io.qameta.allure.Allure.step;

public class ExpertVMVPSTest extends TestBase {
    @Test
    void ExpertVMVPOffer() {
        step("Открываем главную страницу", () -> {
            openUrl();
        });
        step("Переходим в раздел VPS", () -> {
            $(".item-tag5").click();
        });
        step("Переходим в предложение ExpertVM", () -> {
            $("[data-id='26']").click();
        });
        step("Проверяем наличие тарифных планов", () -> {
            $(".Post-body").shouldBe(visible)
                    .shouldHave(text("amd1GB"))
                    .shouldHave(text("- $4.00/Month or $38.40/Year (equivalent to $3.20/Month) | "))
                    .shouldHave(text("kvm1GB"))
                    .shouldHave(text("- $4.00/Month or $38.40/Year (equivalent to $3.20/Month) | "));
        });
    }
}
