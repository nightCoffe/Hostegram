package tests;

import org.junit.jupiter.api.Test;
import steps.NinjahSteps;

public class NinjahStepsTest {

    private NinjahSteps steps = new NinjahSteps();

    @Test
    public void testNinjahOffer() {
        steps.openMainPage();
        steps.openSectionHosting();
        steps.NinjahOffer();
        steps.AssertNinjahPlan();
    }

}
