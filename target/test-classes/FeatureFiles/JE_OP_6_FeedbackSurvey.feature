Feature: FEEDBACK SURVEY

  @TC_01
  Scenario: Feedback Survey Check
    Given To Check Feedback Survey User is navigating to JetEdge URL is "https://preprod.flyjetedge.aero/ownerV2/login.aspx"
    When To Check Feedback Survey User Enter Valid username and Valid password are "soundharya@sankarasoftware.com" and "Soundharya@321"
    And click the login button To Check Feedback Survey
    Then Check Tail button Is Displayed Or Not To Check Feedback Survey
    And close the Feedback Survey Page

  @TC_02
  Scenario: Feedback Survey Check
    Given To Check Feedback Survey User is navigating to JetEdge URL is "https://preprod.flyjetedge.aero/ownerV2/login.aspx"
    When To Check Feedback Survey User Enter Valid username and Valid password are "soundharya@sankarasoftware.com" and "Soundharya@321"
    And click the login button To Check Feedback Survey
    Then Select Valid Tail To Check Feedback Survey
    And Click Continue button To Check Feedback Survey
    Then Click Feedback Survey button
    And Enter Valid Details In Feedback Survey
    Then Click Clear button In Feedback Survey
    And close the Feedback Survey Page

  