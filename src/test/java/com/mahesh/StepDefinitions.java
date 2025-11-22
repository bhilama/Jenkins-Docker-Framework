package com.mahesh;

import java.util.List;
import java.util.Map;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitions {

    @Given("Customer logs in to the portal with username {string} and password {string}")
    public void customer_logs_in_to_the_portal(String userName, String password) {
        System.out.println("Customer logs in to the portal with username " + userName + " and password " + password);
    }
    @When("Customer selects date from 10th Oct {int} to 15th Oct {int}")
    public void customer_selects_date_from_10th_oct_to_15th_oct(Integer int1, Integer int2) {
        System.out.println("Customer selects date from 10th Oct " + int1 + " to 15th Oct " +int2);
    }
    @When("Customer pays ${int}")
    public void customer_pays_$(Integer int1) {
        System.out.println("Customer pays $" + int1);
    }
    @Then("^Booking is ([^\"]*)$")
    public void booking_is_complete(String word) {
        System.out.println("Booking is " + word +".");
    }

    @Then("I have ${float} with me")
    public void myAmt(float amt){
        System.out.println("I have $" + amt + " with me");
    }

   @Then("^We travel to ([^\"]*) on ([^\"]*) till ([^\"]*)$")
    public void we_travel_to_destination(String destination, String from, String to) {
        System.out.println("Travel Destination: " + destination);
        System.out.println("From: " + from);
        System.out.println("To: " + to);
    }
    
    @Before("@smokeTest")
    public void build(){
        System.out.println("I am @Bfore annotaion.");
    }

    @After("@smokeTest")
    public void tear(){
        System.out.println("I am @After annotaion.");
    }
}