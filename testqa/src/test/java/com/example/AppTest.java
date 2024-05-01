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
	
        // Open the web page
        driver.get("http://13.201.74.133:8080/demo/");

        // Get and print the page title
        String pageTitle = driver.getTitle();
        System.out.println("Page Title: " + pageTitle);

        // Close the browser
        driver.quit();
    }
  }

