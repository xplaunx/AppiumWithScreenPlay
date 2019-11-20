#Author: ssaldarriaga@qvision.com.co


Feature: Login eribank app
			As a user
			I want to enter to app with user and password
			to have access to the application
 

  Scenario: Login eribank valid
    Given that sebas open the app
    When he enters with valid user data
    Then he can see the main menu


