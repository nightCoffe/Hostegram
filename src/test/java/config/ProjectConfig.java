package config;

import org.aeonbits.owner.Config;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
        "system:properties",
        "classpath:chrome.properties",
        "classpath:firefox.properties",
        "classpath:credentials.properties"
})

public interface ProjectConfig extends Config {

    String login();
    String password();

    @DefaultValue("chrome")
    String browser();

    @DefaultValue("91.0")
    String browserVersion();

    @DefaultValue("1920x1080")
    String browserSize();
}
