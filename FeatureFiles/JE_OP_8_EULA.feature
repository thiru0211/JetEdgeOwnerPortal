Feature: EULA

  @TC_01
  Scenario: EULA Check
    Given To Check EULA User is navigating to JetEdge URL is "https://preprod.flyjetedge.aero/ownerV2/login.aspx"
    When To Check EULA User Enter Valid username and Valid password are "soundharya@sankarasoftware.com" and "Soundharya@321"
    And click the login button To Check EULA
    Then Check Tail button Is Displayed Or Not To Check EULA
    And close the EULA Page

  @TC_02
  Scenario: EULA Check
    Given To Check EULA User is navigating to JetEdge URL is "https://preprod.flyjetedge.aero/ownerV2/login.aspx"
    When To Check EULA User Enter Valid username and Valid password are "soundharya@sankarasoftware.com" and "Soundharya@321"
    And click the login button To Check EULA
    Then Select Valid Tail To Check EULA
    And Click Continue button To Check EULA
    Then Click EULA button
    And Select The Owner In Dropdown In EULA
    And close the EULA Page
    
    

  