package tests;

import static com.codeborne.selenide.Selenide.open;

public class TestBase {
    public void openUrl() {
        open("https://hostegram.com/");
    }
}
