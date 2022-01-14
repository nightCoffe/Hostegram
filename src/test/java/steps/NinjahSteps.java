package steps;

import io.qameta.allure.Step;
import tests.TestBase;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class NinjahSteps extends TestBase {

    @Step("Открываем главную страницу")
    public void openMainPage() {
        openUrl();
    }

    @Step("Переходим в раздел Hosting")
    public void openSectionHosting() {
        $(".item-tag2").click();
    }

    @Step("Переходим в предложение HostNinjah")
    public void NinjahOffer() {
        $("[data-id='19']").click();
    }

    @Step("Проверяем наличие тарифных планов")
    public void AssertNinjahPlan() {
        $(".Post-body").shouldBe(visible)
                .shouldHave(text("BASIC PLAN"),
                        text("PREMIUM PLAN"),
                        text("DEVELOPER PLAN")
                );
    }
}
