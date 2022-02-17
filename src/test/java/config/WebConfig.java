package config;

import org.aeonbits.owner.Config;


@Config.Sources("classpath:${environment}.properties")
public interface WebConfig extends Config {

    @Key("browser")
    @DefaultValue("CHROME")
    String browser();

    @Key("browserVersion")
    @DefaultValue("96.0")
    String browserVersion();

    @Key("browserSize")
    @DefaultValue("1920x1080")
    String browserSize();

}
