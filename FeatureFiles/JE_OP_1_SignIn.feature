Feature: Signin

  @TC_01
  Scenario: Sign In:Valid Check
    Given To Check Signin User is navigating to JetEdge URL is "https://preprod.flyjetedge.aero/ownerV2/login.aspx"
    When To Check Signin User Enter username and password are "soundharya@sankarasoftware.com" and "Soundharya@321"
    And click the login button To Check Signin
    Then Check Tail button Is Displayed Or Not
    And close the Signin Page
    
    @TC_02
  Scenario: Sign In:Valid Check
    Given To Check Signin User is navigating to JetEdge URL is "https://preprod.flyjetedge.aero/ownerV2/login.aspx"
    When To Check Signin User Enter username and password are "soundharya@sankarasoftware.com" and "Soundharya@321"
    And click the login button To Check Signin
    Then Select Valid Tail To Check Signin
    And Check home page is displayed To Check Signin
    And close the Signin Page
    
    @TC_03
  Scenario: Sign In:Valid Check
    Given To Check Signin User is navigating to JetEdge URL is "https://preprod.flyjetedge.aero/ownerV2/login.aspx"
    When To Check Signin User Enter Valid username and Invalid password are "soundharya@sankarasoftware.com" and "Admin"
    And click the login button To Check Signin
    Then Check Page Behaviour To Check Signin
    And close the Signin Page
    
    @TC_04
  Scenario: Sign In:Valid Check
    Given To Check Signin User is navigating to JetEdge URL is "https://preprod.flyjetedge.aero/ownerV2/login.aspx"
    When To Check Signin User Enter Invalid username and Valid password are "sound@sankarasoftware.com" and "Soundharya@321"
    And click the login button To Check Signin
    Then Check Page Behaviour To Check Signin
    And close the Signin Page
    
    @TC_05
  Scenario: Sign In:Valid Check
    Given To Check Signin User is navigating to JetEdge URL is "https://preprod.flyjetedge.aero/ownerV2/login.aspx"
    When To Check Signin User Enter username and password are "soundharya@sankarasoftware.com" and "Soundharya@321"
    And click the login button To Check Signin
    Then Select Valid Tail To Check Signin
    And Click Menu Icon In Home Page
    Then Click Signout button In Home Page
    And close the Signin Page
  