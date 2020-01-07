package com.example;

import com.example.utils.Constants;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;

public class BrandsTest {
    private WebDriver driver;

    @Before
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        driver.get(Constants.baseUrl);
    }

    @After
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void openBrandPageFromStartPage() {
        String brandName = "Sergio Rossi";
        BrandPage brandPage = new StartPage(driver).selectBrand(brandName).clickSearch();
        assertEquals("Brand name", brandName, brandPage.getBrandName());
    }
}
