Feature: OWNER TRACKER

  @TC_01
  Scenario: Owner Tracker Check
    Given To Check Owner Tracker User is navigating to JetEdge URL is "https://preprod.flyjetedge.aero/ownerV2/login.aspx"
    When To Check Owner Tracker User Enter Valid username and Valid password are "soundharya@sankarasoftware.com" and "Soundharya@321"
    And click the login button To Check Owner Tracker
    Then Check Tail button Is Displayed Or Not To Check Owner Tracker
    And close the Owner Tracker Page

  @TC_02
  Scenario: Owner Tracker:OwnerTracker 1.0
    Given To Check Owner Tracker User is navigating to JetEdge URL is "https://preprod.flyjetedge.aero/ownerV2/login.aspx"
    When To Check Owner Tracker User Enter Valid username and Valid password are "soundharya@sankarasoftware.com" and "Soundharya@321"
    And click the login button To Check Owner Tracker
    Then Select Valid Tail To Check Owner Tracker
    And Click Continue button To Check Owner Tracker
    Then Click OwnerTracker1 In Owner Tracker
    And close the Owner Tracker Page
    
    @TC_03
  Scenario: Owner Tracker:OwnerTracker 1.0
    Given To Check Owner Tracker User is navigating to JetEdge URL is "https://preprod.flyjetedge.aero/ownerV2/login.aspx"
    When To Check Owner Tracker User Enter Valid username and Valid password are "soundharya@sankarasoftware.com" and "Soundharya@321"
    And click the login button To Check Owner Tracker
    Then Select Valid Tail To Check Owner Tracker
    And Click Continue button To Check Owner Tracker
    Then Click OwnerTracker1 In Owner Tracker
    And Click History button In Owner Tracker
    Then Click Close button In History
    And close the Owner Tracker Page
    
    @TC_04
  Scenario: Owner Tracker:OwnerTracker 2.0
    Given To Check Owner Tracker User is navigating to JetEdge URL is "https://preprod.flyjetedge.aero/ownerV2/login.aspx"
    When To Check Owner Tracker User Enter Valid username and Valid password are "soundharya@sankarasoftware.com" and "Soundharya@321"
    And click the login button To Check Owner Tracker
    Then Select Valid Tail To Check Owner Tracker
    And Click Continue button To Check Owner Tracker
    Then Click OwnerTracker2 In Owner Tracker
    And Click History button In OwnerTracker2
    Then Click Close button In History In OwnerTracker2
    And close the Owner Tracker Page

  