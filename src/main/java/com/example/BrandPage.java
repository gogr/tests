package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static com.example.utils.Helpers.removeShoesSuffix;

public class BrandPage {
    private WebDriver driver;

    public BrandPage(WebDriver driver) {
        this.driver = driver;
        WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.urlContains("/brands/"));
    }

    public String getBrandName() {
        String pageHeader = driver.findElement(By.className("title")).getText();
        return removeShoesSuffix(pageHeader);
    }
}
