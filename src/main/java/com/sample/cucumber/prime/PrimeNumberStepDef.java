package com.sample.cucumber.prime;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PrimeNumberStepDef {
    private int numToCheck;
        
        @Given("I want to check prime number")
        public void i_want_to_check_prime_number() {
            System.out.println("Enter The number");
        }
        @When("I have a number")
        public void i_have_a_number() {
            numToCheck = 31;
            System.out.println("The number is: " + numToCheck);
        }
        @Then("I validate the outcome")
        public void i_validate_the_outcome() {
            // Write code here that turns the phrase above into concrete actions
            System.out.println(testPrime(numToCheck));
        }
    
        private String testPrime(int number) {
            
            if(number <= 1) {
                    return number + " is a not a valid input";
            } 
            
            for(int i = 2; i < number; i++) {
                    if(number % i == 0) {
                            return number + " is divisible by " + i;
                    }
            }       
            
            return number + " is Prime number";
}
        
}

