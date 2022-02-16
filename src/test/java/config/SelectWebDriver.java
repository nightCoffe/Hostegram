package config;

import org.aeonbits.owner.ConfigFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.function.Supplier;
/*
public class SelectWebDriver implements Supplier<WebDriver> {

    private WebConfig config;


    public SelectWebDriver() {
        config = ConfigFactory.create(WebConfig.class, System.getProperties());
    }

    @Override
    public WebDriver get() {
        WebDriver driver = createWebDriver();
        driver.get(config.getBaseUrl());
        return driver;
    }

    private WebDriver createWebDriver() {
        if (config.browser().equals(Browser.FIREFOX)) {
            return new FirefoxDriver();
        }
        if (config.browser().equals(Browser.CHROME)) {
            return new ChromeDriver();
        }
        throw new NullPointerException("No such browser");
    }
}


 */