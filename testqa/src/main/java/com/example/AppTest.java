package com.example;

/**
 * Hello world!
 *
 */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AppTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chrome-linux64");

        System.out.println("HELLO WORLD");

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        driver.findElement(By.name("q")).sendKeys("Hello World");
        driver.findElement(By.name("q")).submit();
        String title = driver.getTitle();
        if (title.contains("Hello World")) {
            System.out.println("Test Passed: Page title contains 'Hello World'");
        } else {
            System.out.println("Test Failed: Page title does not contain 'Hello World'");
        }
        driver.quit();
    }
}

