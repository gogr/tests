package com.amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchResultsPage {
    private WebDriver driver;

    public SearchResultsPage(WebDriver driver) {
        this.driver = driver;
        new WebDriverWait(driver,15).until(ExpectedConditions.titleContains("Amazon.com:"));
    }

    public String getTitle() {
        return driver.getTitle();
    }

    public String getSearchResultCriteria() {
        String searchCriteria = driver.findElement(By.className("a-color-state")).getText();
//        in order to remove double quotes from the found text, e.g. "teapot" > teapot
        searchCriteria = searchCriteria.substring(1, searchCriteria.length() - 1);
        return searchCriteria;
    }
}
