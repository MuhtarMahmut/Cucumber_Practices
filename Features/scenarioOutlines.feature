@UserStory3
  Feature: data search in google.

    Scenario Outline: search 20 datas from google
        Given user should go the website 'https://www.google.com'
        When User Searches '<Data>'
        Then the data will dispay and browser closes

            Examples:
      |   Data      |
      | Apple       |
      | Samsung     |
      | Motorolla   |
      | Nokia       |
      | LG          |
      | Sony        |
      | BlackBerry  |
