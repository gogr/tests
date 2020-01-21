package com.amazon;

import io.cucumber.java.en.And;
import org.openqa.selenium.By;

import static com.WebDriverFactory.getDriver;
import static org.junit.Assert.assertEquals;

public class Header {
    private final By searchCriteriaInput = By.id("twotabsearchtextbox");

    @And("^I set (.*) as search criteria on header$")
    public Header setSearchCriteria(String searchCriteria) {
        getDriver().findElement(searchCriteriaInput).sendKeys(searchCriteria);
        return this;
    }

    @And("^I click search button on header$")
    public SearchResultsPage clickSearchButton() {
        getDriver().findElement(By.xpath("//input[@value='Go']")).click();
        return new SearchResultsPage();
    }

    @And("^Search criteria (.*) is set on header$")
    public void verifySearchCriteria(String searchCriteria) {
        assertEquals(searchCriteria, getDriver().findElement(searchCriteriaInput).getAttribute("value"));
    }
}
