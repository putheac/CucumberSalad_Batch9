Feature: HomePage Functionalities

Background:

		Given User is on HomePage	

		
  @SmokeTest
  Scenario: Navigate to Shop Page and search an Iteam
    When User navigates to shopPage
    And searchs for an item
    Then results count should be displayed with number

  @SmokeTest123
  Scenario: Navigate shopping yellow button and search for an item
    When User navigates searchPage using big yello button
    And searchs for an item
    Then results count should be displayed with number
    And user enter username "admin123" and password "adminadmin"
    Then I have added wait 3000
    
    
    

  @SmokeTest123
  Scenario Outline: Navigate shopping yellow button and search for an item123123
 
    And user enter username "<username>" and password "<password>" list

    @att
    Examples: 
      | username | password |
      | abc1      | admin1 |
      | abc2      | admin2 |
      | abc3      | admin3 |
      | abc4      | admin4 |

    @verizon
    Examples: 
      | username | password |
      | verizon  | admin321 |
