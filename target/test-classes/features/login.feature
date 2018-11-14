Feature: login application

Scenario: Home page desfault login
Given User is on Net Banking landing page
When User enters valid username and passsword
Then Homepage should populated 
And Cards are displayed
