Feature: Search criteria

  Background:
    Given I open amazon start page

  @teapotTests
  Scenario Outline: Verify search criteria are displayed on search results page on search by <keyword>
    When I set <keyword> as search criteria on header
    And I click search button on header
    Then Search criteria <keyword> is set on header
    And Title is Amazon.com: <keyword> on search results page
    And Search results criteria is <keyword> on search results page

    Examples:
      | keyword |
      | teapot  |
      | hummer  |

 @teapotTests @smoke
 Scenario: Teapot search
    When I set teapot as search criteria on header
    And I click search button on header
    Then Search criteria teapot is set on header
    And Title is Amazon.com: teapot on search results page
    And Search results criteria is teapot on search results page