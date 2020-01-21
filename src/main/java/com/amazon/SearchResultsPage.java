package com.amazon;

import io.cucumber.java.en.Given;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static com.WebDriverFactory.getDriver;
import static org.junit.Assert.assertEquals;

public class SearchResultsPage {

    public SearchResultsPage() {
        new WebDriverWait(getDriver(), 15).until(ExpectedConditions.titleContains("Amazon.com:"));
    }

    @Given("^Title is (.*) on search results page$")
    public void verifyTitle(String title) {
        assertEquals(title, getDriver().getTitle());
    }

    @Given("^Search results criteria is (.*) on search results page$")
    public void verifySearchResultCriteria(String searchCriteria) {
        String actualSearchCriteria = getDriver().findElement(By.className("a-color-state")).getText();
//        in order to remove double quotes from the found text, e.g. "teapot" > teapot
        actualSearchCriteria = actualSearchCriteria.substring(1, actualSearchCriteria.length() - 1);
        assertEquals(searchCriteria, actualSearchCriteria);
    }
}

