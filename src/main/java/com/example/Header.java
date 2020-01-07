package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Header {
    private WebDriver driver;

    public Header(WebDriver driver) {
        this.driver = driver;
        WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("header")));
    }

    public StartPage clickHomeButton() {
        driver.findElement(By.id("home_link_div")).click();
        return new StartPage(driver);
    }

    public MonthlyReleasesPage clickMonthButton(String month) {
        driver.findElement(By.linkText(month)).click();
        return new MonthlyReleasesPage(driver);
    }
}
