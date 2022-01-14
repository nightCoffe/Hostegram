package tests;

import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class NinjahWithListener extends TestBase {
    String basicPlan = "https://clients.hostninjah.com/order.php?step=2&product=1&paymentTerm=12";

    @Test
    void HostingNinjahOffer() {
        SelenideLogger.addListener("allure", new AllureSelenide());
        openUrl();
        $(".item-tag2").click();
        $("[data-id='19']").click();
        $(".Post-body").shouldHave(text("BASIC PLAN"),
                text("PREMIUM PLAN"),
                text("DEVELOPER PLAN")
        );
    }
}
