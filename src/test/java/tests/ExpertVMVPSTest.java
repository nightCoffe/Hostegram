package tests;

import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static io.qameta.allure.Allure.step;

public class ExpertVMVPSTest extends TestBase {
    @Test
    @Owner("nightCoffe")
    @Feature("Offer")
    @Story("ExpertVMVPOffer")
    @Severity(SeverityLevel.CRITICAL)
    @DisplayName("Оффер от ExpertVMVP")
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
                    .shouldHave(text("amd1GB\n" +
                            "- 1GB RAM\n" +
                            "- 1x vCPU\n" +
                            "- 20GB NVMe SSD space\n" +
                            "- 750GB Transfer\n" +
                            "- 1Gbps Uplink\n" +
                            "- 1x IPv4\n" +
                            "- KVM/Proxmox"))
                    .shouldHave(text("- $4.00/Month or $38.40/Year (equivalent to $3.20/Month) | "))
                    .shouldHave(text("kvm1GB"))
                    .shouldHave(text("- $4.00/Month or $38.40/Year (equivalent to $3.20/Month) | "));
        });
    }
}
