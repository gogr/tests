package com.amazon;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;
import java.util.concurrent.TimeUnit;

public class SearchCriteriaTest {
    private WebDriver driver;

    @Before
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        driver.get("https://www.amazon.com/");
    }

    @After
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void verifySearchCriteriaIsDisplayedProperly() {
        Header header = new Header(driver);
        Assert.assertEquals("", header.getSearchCriteria());
        String searchCriteria = "teapot";
        header.setSearchCriteria(searchCriteria);
        SearchResultsPage searchResultsPage = header.clickSearchButton();
        Assert.assertEquals(searchCriteria, searchResultsPage.getSearchResultCriteria());
        Assert.assertTrue("Title ends with search keyword " + searchCriteria,
                searchResultsPage.getTitle().endsWith(searchCriteria));
        Assert.assertEquals(searchCriteria, header.getSearchCriteria());
    }
}
