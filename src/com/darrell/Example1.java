package com.darrell;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example1 {
    WebDriver driver;

    @Before
    public void setUp() {
        driver = new ChromeDriver();
    }

    @Test
    public void example_test() {
        driver.get("https://www.google.com");
        System.out.println(driver.getTitle());
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}
