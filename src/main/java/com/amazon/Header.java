package com.amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Header {
    private WebDriver driver;

    public Header(WebDriver driver) {
        this.driver = driver;
    }

    public Header setSearchCriteria(String searchCriteria) {
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys(searchCriteria);
//        driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys(searchCriteria);
        return this;
    }

    public SearchResultsPage clickSearchButton() {
        driver.findElement(By.xpath("//input[@value='Go']")).click();
//        driver.findElement(By.xpath("//*[@value=\"Go\"]")).click();
        return new SearchResultsPage(driver);
    }

    public String getSearchCriteria(){
        return driver.findElement(By.id("twotabsearchtextbox")).getAttribute("value");
    }
}
