Feature: PROFILE

  @TC_01
  Scenario: Profile:Owner Profile
    Given To Check Profile User is navigating to JetEdge URL is "http://192.168.1.33/OWNERV2/login.aspx"
    When To Check Profile User Enter Valid username and Valid password are "soundharya@sankarasoftware.com" and "Soundharya@123"
    And click the login button To Check Profile
    Then Select Valid Tail To Check Profile
    And Click Continue button To Check Profile
    Then Click Owner Profile button in profile
    And Check page landed to Owner Profile page or not
    And close the Profile Page

  @TC_02
  Scenario: Profile:Contact Us
   Given To Check Profile User is navigating to JetEdge URL is "http://192.168.1.33/OWNERV2/login.aspx"
    When To Check Profile User Enter Valid username and Valid password are "soundharya@sankarasoftware.com" and "Soundharya@123"
    And click the login button To Check Profile
     Then Select Valid Tail To Check Profile
    And Click Continue button To Check Profile
    Then Click Contact Us button in profile
    And Check page landed to contact us page or not
    And close the Profile Page
    
    

  