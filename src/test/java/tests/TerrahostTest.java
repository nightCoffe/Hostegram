package tests;

import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static io.qameta.allure.Allure.step;

public class TerrahostTest extends TestBase {

    @Test
    @Owner("nightCoffe")
    @Feature("Offer")
    @Story("PorkbunOffer")
    @Severity(SeverityLevel.CRITICAL)
    @DisplayName("Оффер от Porkbun")
    void ExpertVMVPOffer() {
        step("Открываем главную страницу", () -> {
            openUrl();
        });
        step("Переходим в раздел VPS", () -> {
            $(".item-tag5").click();
        });
        step("Переходим в предложение Terrahost", () -> {
            $("[data-id='47']").click();
        });
        step("Проверяем наличие тарифных планов", () -> {
            $(".Post-body").shouldBe(visible)
                    .shouldHave(text("KVM 2G\n" +
                            "1 vCore (AMD Ryzen 5950X)\n" +
                            "2GB RAM\n" +
                            "40GB NVMe SSD\n" +
                            "50TB @ 1Gbps"));
        });
    }
}

