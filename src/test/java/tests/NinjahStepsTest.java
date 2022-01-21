package tests;

import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import steps.NinjahSteps;

public class NinjahStepsTest {

    private NinjahSteps steps = new NinjahSteps();

    @Test
    @Owner("nightCoffe")
    @Feature("Offer")
    @Story("testNinjahOffer")
    @Severity(SeverityLevel.CRITICAL)
    @DisplayName("Оффер от Ninjah")
    public void testNinjahOffer() {
        steps.openMainPage();
        steps.openSectionHosting();
        steps.NinjahOffer();
        steps.AssertNinjahPlan();
    }

}
