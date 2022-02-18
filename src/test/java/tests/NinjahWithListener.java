package tests;

import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.*;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class NinjahWithListener extends TestBase {

    @Test
    @Owner("nightCoffe")
    @Feature("Offer")
    @Story("HostingNinjahOffer")
    @Severity(SeverityLevel.CRITICAL)
    @DisplayName("Оффер от Ninjah")
    void HostingNinjahOffer() {
        SelenideLogger.addListener("allure", new AllureSelenide());
        openUrl();
        $(".item-tag2").click();
        $("[data-id='19']").click();
        $(".Post-body").shouldBe(visible).shouldHave(text("BASIC PLAN"),
                text("PREMIUM PLAN"),
                text("DEVELOPER PLAN")
        );
    }
}
