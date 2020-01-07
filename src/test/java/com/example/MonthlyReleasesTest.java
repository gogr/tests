package com.example;

import com.example.utils.Constants;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.text.DateFormatSymbols;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;

public class MonthlyReleasesTest {
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
    public void verifyMonthlyReleasesTitle() {
        List<String> months = Arrays.asList("January", "February", "March", "April", "May", "June", "July",
                "August", "September", "October", "November", "December");
        for (String month : months) {
            MonthlyReleasesPage monthlyReleasesPage = new Header(driver).clickMonthButton(month);
            assertEquals("Title ", month, monthlyReleasesPage.getMonthFromTitle());
            assertEquals("Header", month, monthlyReleasesPage.getMonth());
        }
    }
}
