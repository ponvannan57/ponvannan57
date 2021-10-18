@tag
Feature: Question1

  Background: 
    Given I Configure the Browser as "Chrome" with URL "New"

  @tag1
  Scenario Outline: Title of your scenario
    Then Login with the username <Username>

    Examples: 
			       | Username |
			       |  sadmin  |
			  