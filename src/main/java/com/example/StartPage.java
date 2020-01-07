package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class StartPage {
    private WebDriver driver;

    public StartPage(WebDriver driver) {
        this.driver = driver;
        WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.titleIs("Shoe Store: Welcome to the Shoe Store"));
        wait.until(ExpectedConditions.textToBe(By.tagName("h2"), "Welcome to Shoe Store!"));
    }

    public StartPage selectBrand(String brand) {
        Select brandSelect = new Select(driver.findElement(By.id("brand")));
        brandSelect.selectByVisibleText(brand);
        return this;
    }

    public BrandPage clickSearch() {
        driver.findElement(By.id("search_button")).click();
        return new BrandPage(driver);
    }
}
