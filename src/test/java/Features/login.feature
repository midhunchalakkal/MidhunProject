@regression
Feature: Github login

@TestData 
Scenario: Github Test data setup
Given Create the test data

@sanity
Scenario: Github Login Test Scenario
Given user is already on Login Page
When title of login page is Git hub
Then loginpage is displayed