
Feature: Login facebook and verify the logged user
@Log
Scenario: Login to the application with valid login
Given User is able to login with valid "username" and "password"
Then click on submit button
@Verify
Scenario: Verify the logged in user
Given Goto the account setting and click the settings
Then verify the logged in user name


