package com.example;

import com.example.utils.Helpers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static com.example.utils.Helpers.removePrefix;
import static com.example.utils.Helpers.removeShoesSuffix;

public class MonthlyReleasesPage {
    private WebDriver driver;

    public MonthlyReleasesPage(WebDriver driver) {
        this.driver = driver;
        WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.urlContains("/months/"));
    }

    public String getMonthFromTitle() {
        String pageTitle = driver.getTitle();
        return removeShoesSuffix(removePrefix(pageTitle));
    }

    public String getMonth() {
        String pageHeader = driver.findElement(By.className("title")).getText();
        return removeShoesSuffix(pageHeader);
    }
}
