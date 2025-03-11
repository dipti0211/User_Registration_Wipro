@RegistrationTest
Feature: User Registration

  Scenario: User registers with valid details
    Given User is on the signup page
    When User enters a unique username and password
    And User clicks on the Sign-up button
    Then User should see a successful registration message
