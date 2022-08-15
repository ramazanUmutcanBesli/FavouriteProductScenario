Feature: N11 Favourite Product
  Description:

  1:The scenario below should happen.
  2:A screenshot of the transition and validity should be taken (added in the reports).
  3:Github should be shared.
  4:A readme file should be added in the project and how it will be run should be written.

  Background: As a user, user is on the home page
    Given user is on the login page of n11.com
    And user enters username
    And user enters password
    And user clicks to login button
    Then verify that user log in successfully

  Scenario: Add Favourite Products and select most expensive of Products
    Given user see home page of N11.com
    And verify that user should see home page of N11 website
    And user search "Iphone" on the search button
    And verify that "Iphone" word is searched
    And user click second page of Search page
    And verify that second page is opened
    And user put first 3 products in favourite
    And user click My Account button
    And user click My Favourite button
    And user click My List button
    And verify that My Favourite page is opened
    And user delete 2 of favourite products which are cheaper than others from List page
    And verify that product is deleted
    Then user log out from Page

