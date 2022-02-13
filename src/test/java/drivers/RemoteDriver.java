package drivers;

import com.codeborne.selenide.WebDriverProvider;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import javax.annotation.Nonnull;
import java.net.MalformedURLException;
import java.net.URL;

import static config.AppRemote.userRemoteConfig;

public class RemoteDriver implements WebDriverProvider {
    public static URL getRemoteUrl() {
        try {
            return new URL(
                    "https://" + userRemoteConfig.remoteLogin() + ":" + userRemoteConfig.remotePassword()
                            + "@selenoid.autotests.cloud/wd/hub");
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }

    @Nonnull
    @Override
    public WebDriver createDriver(@Nonnull DesiredCapabilities desiredCapabilities) {
        return null;
    }
}


