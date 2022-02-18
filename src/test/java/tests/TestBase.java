package tests;

import com.codeborne.selenide.logevents.SelenideLogger;
import config.ProjectConfig;
import helpers.Attach;
import helpers.Driver;
import io.qameta.allure.selenide.AllureSelenide;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;

import static com.codeborne.selenide.Selenide.open;


public class TestBase {
    public void openUrl() {
        open("https://hostegram.com/");
    }

    public static ProjectConfig credentials =
            ConfigFactory.create(ProjectConfig.class);


    @BeforeAll
    static void setup() {

        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());

        Driver.configure();
    }

    @AfterEach
    public void tearDown() {
        Attach.screenshotAs("Last screenshot");
        Attach.pageSource();
        Attach.browserConsoleLogs();
        Attach.addVideo();
    }
}
