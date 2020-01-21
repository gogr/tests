package com.amazon;

import io.cucumber.java.en.Given;

import static com.WebDriverFactory.getDriver;

public class StartPage {

    @Given("^I open amazon start page$")
    public Header openRecruitersHomePage() {
        getDriver().get("https://www.amazon.com/");
        return new Header();
    }
}
