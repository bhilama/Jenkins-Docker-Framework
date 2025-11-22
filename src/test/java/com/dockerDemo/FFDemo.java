package com.dockerDemo;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxOptions;

import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class FFDemo {

    @Test
    public void testApp() throws MalformedURLException, InterruptedException{
        FirefoxOptions options = new FirefoxOptions();

        WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), options);
        driver.get("https://www.orangehrm.com/en");
        System.out.println("FF: " + driver.getTitle());
        driver.findElement(By.xpath("//input[@id='Form_submitForm_EmailHomePage']")).sendKeys("ABCD");
        Thread.sleep(15000);
        driver.quit();


    }
}
