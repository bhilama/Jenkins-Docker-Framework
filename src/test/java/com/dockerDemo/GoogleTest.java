package com.dockerDemo;

import org.testng.annotations.Test;

public class GoogleTest extends BaseTest{

    @Test
    public void landingPageTest() throws InterruptedException{
        driver.get("https://www.orangehrm.com/en");
        System.out.println("Page Title: " + driver.getTitle());
        Thread.sleep(15000);
        
    }
}
