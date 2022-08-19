Feature: N11 Favourite Product
  Description:
  1:The scenario below should happen.
  2:A screenshot of the transition and validity should be taken (added in the reports).
  3:Github should be shared.
  4:A readme file should be added in the project and how it will be run should be written.
  @smoke
  Scenario: Add Favourite Products and delete product
    Given user is on Home page
    And user search "Iphone" on search box
    And verify "Iphone" word is displayed
    And user click second page of iphone page
    And verify 2 nd page is opened
    And user put 3 rd product in shopping cart
    And user move to shopping cart page
    Then user delete this product from shopping cart
