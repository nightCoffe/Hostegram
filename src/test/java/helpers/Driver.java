package helpers;

import com.codeborne.selenide.Configuration;
import config.AppConfig;
import org.openqa.selenium.remote.DesiredCapabilities;

import static java.lang.String.format;
import static tests.TestBase.credentials;

public class Driver {
    public static void configure() {

        String selenoidUrl = credentials.URL();
        String login = credentials.login();
        String password = credentials.password();
        Configuration.remote = format("https://%s:%s@", login, password, selenoidUrl);
        Configuration.browser = AppConfig.config.browser();
        Configuration.browserVersion = AppConfig.config.browserVersion();
        Configuration.browserSize = AppConfig.config.browserSize();
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("enableVNC", true);
        capabilities.setCapability("enableVideo", true);

        Configuration.browserCapabilities = capabilities;
        Configuration.timeout = 10000;
        Configuration.startMaximized = true;
    }
}
