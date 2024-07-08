@tag
Feature: Planning a trip

  @tag1
  Scenario: Validating a trip planning 
    Given User landed on Make my trip
    When go to hotels section and select city,dates,peoples,budget
    And click on search
    Then available hotels should displayed

  #@tag2
  #Scenario Outline: Title of your scenario outline
   # Given I want to write a step with <name>
   # When I check for the <value> in step
   # Then I verify the <status> in step

    #Examples: 
    #  | name  | value | status  |
    #  | name1 |     5 | success |
    #  | name2 |     7 | Fail    |
