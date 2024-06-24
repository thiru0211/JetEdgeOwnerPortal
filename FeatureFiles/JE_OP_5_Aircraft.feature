Feature: AIRCRAFT DETAILS

  @TC_01
  Scenario: Aircraft Check
    Given To Check Aircraft User is navigating to JetEdge URL is "https://preprod.flyjetedge.aero/ownerV2/login.aspx"
    When To Check Aircraft User Enter Valid username and Valid password are "soundharya@sankarasoftware.com" and "Soundharya@321"
    And click the login button To Check Aircraft
    Then Check Tail button Is Displayed Or Not To Check Aircraft
    And close the Aircraft Page

  @TC_02
  Scenario: Aircraft:Tail Details
    Given To Check Aircraft User is navigating to JetEdge URL is "https://preprod.flyjetedge.aero/ownerV2/login.aspx"
    When To Check Aircraft User Enter Valid username and Valid password are "soundharya@sankarasoftware.com" and "Soundharya@321"
    And click the login button To Check Aircraft
    Then Select Valid Tail To Check Aircraft
    And Click Continue button To Check Aircraft
    Then Click Tail Details In Aircraft
    And Click Aircraft Details button In Tail Details
    And close the Aircraft Page

  @TC_03
  Scenario: Aircraft:Tail Gallery
    Given To Check Aircraft User is navigating to JetEdge URL is "https://preprod.flyjetedge.aero/ownerV2/login.aspx"
    When To Check Aircraft User Enter Valid username and Valid password are "soundharya@sankarasoftware.com" and "Soundharya@321"
    And click the login button To Check Aircraft
    Then Select Valid Tail To Check Aircraft
    And Click Continue button To Check Aircraft
    Then Click Tail Gallery In Aircraft
    And Check Data Displayed Or Not In Tail Gallery
    And close the Aircraft Page
    
    @TC_04
  Scenario: Aircraft:Specs Sheet
    Given To Check Aircraft User is navigating to JetEdge URL is "https://preprod.flyjetedge.aero/ownerV2/login.aspx"
    When To Check Aircraft User Enter Valid username and Valid password are "soundharya@sankarasoftware.com" and "Soundharya@321"
    And click the login button To Check Aircraft
    Then Select Valid Tail To Check Aircraft
    And Click Continue button To Check Aircraft
    Then Click Specs Sheet In Aircraft
    And Click Print button In Specs Sheet
    And close the Aircraft Page
