package com.sample.cucumber;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CalcStepDefinnition {
    
    private int num1;
    private int num2;
    private int sum;
    private Calculator calc = new Calculator();
    
    @Given("^I want to add two numbers$")
    public void i_want_to_add_two_numbers() {
        System.out.println("Adding 2 numbers");
    }
    @When("^I have two numbers$")
    public void i_have_two_numbers() {
        num1 = 14;
        num2 = 28;
    }
    @Then("^I add them and print the sum$")
    public void i_add_them_and_print_the_sum() {
        sum = calc.add(num2, num1);
        System.out.println("Sum of 2 numbers is: " + sum);
    }



}
