#this is user story
  @userstory1
Feature: Google Seacrhes

  # this is a test case
  Scenario: search apple in google.
      #Test Steps:
    Given chrome browser is set up
    When open the website
    Then go to URL
    And page opens
    But seach box is empty
    * type the keyword apple.
    Then close browser



  @samsung
    Scenario: search samsung in google.
      Given chrome browser is set up
      When open the website
      Then go to URL
      And page opens
      But seach box is empty
      * type the keyword samsung
      Then close browser