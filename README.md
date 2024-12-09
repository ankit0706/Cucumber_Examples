# Cucumber_Examples
A project that details the fundamental steps required in writing cucumber tests


Cucumber is a BDD tool. BDD stands for Behavior Driven Development. It's not very different from what we already do with JUnit and Mockito.

To understand BDD, first let's talk about its predecessor TDD or Test Driven Development. TDD says, before writing any code, first write its tests. At first, all the tests will fails because there is no code. Then write code and make the tests pass one-by-one. This way, we ensure full coverage of our code through automated tests.

BDD also follows the same approach, only that it has some components which can be understood by non-technical people too. For example for any particular feature in our code, we define its different behaviors. For example behavior 1: a valid user requests for account details to your rest controller. behavior 2: an invalid user requests for account details.

In above lines, we defined 2 behaviors for our rest controller. This will be written in easily readable format called Gherkin, which anyone can understand. Later, we write tests to cover the same behavior traits, and finally the code that implements the feature.

That's BDD.


=============================
Technical Details
=============================

First of all, to use cucumber in our Java/Spring project, we need to add the relevant dependencies in our pom.xml
These dependencies are cucumber-java, cucumber-junit and the junit maven dependencies. In this code you can find them in the pom.xml file.

This will give us all the cucumber functionality, we need.

With Cucumber, first we take a feature (for example, a controller) and then define one or more scenarios in it. 
These scenarios are written in cucumber's Gherkin language. It is nothing but plaintext file in english which anyone can read and understand. For example:

**Feature**: Controller
  I want to use this template for my controller code

  **Scenario**: Getting User Details
    **Given** A valid user sends the request
    **When** user's details are present in the database
    **Then** return the details in json format

This simple test file is called the feature file and it will saved like this _XYZControler.feature_

The Given, When, Then are called steps. We write java code with methods having simple annotations like @Given, @When, @Then which will map these scenarios with actual testing code. This java file is called StepDefinition file, though we can have any name for it.

Finally, there will be a test class which will have the configuration telling the code where is feature file located and where the StepDefinitions can be found.

That's it. Once we run 'mvn test' our step definitions are executed.
