package com.darrell;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertEquals;

public class Example1 {
    WebDriver driver;

    @Before
    public void setUp() {
        driver = new ChromeDriver();
    }

    @Test
    public void example_test() {
        driver.get("https://www.google.com");
        WebElement input = driver.findElement(By.cssSelector("[name='q']"));
        input.sendKeys("Selenium\n");
        String title = driver.getTitle();
        assertEquals("Selenium - Google Search", title);
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}
