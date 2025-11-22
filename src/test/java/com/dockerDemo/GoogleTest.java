package com.dockerDemo;

public class GoogleTest extends BaseTest{

    public void landingPageTest() throws InterruptedException{
        driver.get("https://www.orangehrm.com/en");
        System.out.println("Page Title: " + driver.getTitle());
        Thread.sleep(15000);
    }
}
