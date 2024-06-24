Feature: REPORTS

  @TC_01
  Scenario: Reports Check
    Given To Check Reports User is navigating to JetEdge URL is "https://preprod.flyjetedge.aero/ownerV2/login.aspx"
    When To Check Reports User Enter Valid username and Valid password are "soundharya@sankarasoftware.com" and "Soundharya@321"
    And click the login button To Check Reports
    Then Check Tail button Is Displayed Or Not To Check Reports
    And close the Reports Page

  @TC_02
  Scenario: Reports:Piolt Roster
    Given To Check Reports User is navigating to JetEdge URL is "https://preprod.flyjetedge.aero/ownerV2/login.aspx"
    When To Check Reports User Enter Valid username and Valid password are "soundharya@sankarasoftware.com" and "Soundharya@321"
    And click the login button To Check Reports
    Then Select Valid Tail To Check Reports
    And Click Continue button To Check Reports
    Then Click Piolt Roster In Reports
    And Select Valid Month In Calendar In Piolt Roster
    Then Click Excel button In Piolt Roster
    And close the Reports Page

  @TC_03
  Scenario: Reports:Piolt Roster
    Given To Check Reports User is navigating to JetEdge URL is "https://preprod.flyjetedge.aero/ownerV2/login.aspx"
    When To Check Reports User Enter Valid username and Valid password are "soundharya@sankarasoftware.com" and "Soundharya@321"
    And click the login button To Check Reports
    Then Select Valid Tail To Check Reports
    And Click Continue button To Check Reports
    Then Click Piolt Roster In Reports
    And Click Duty button In Piolt Roster
    And close the Reports Page

  @TC_04
  Scenario: Reports:Flight Activity
    Given To Check Reports User is navigating to JetEdge URL is "https://preprod.flyjetedge.aero/ownerV2/login.aspx"
    When To Check Reports User Enter Valid username and Valid password are "soundharya@sankarasoftware.com" and "Soundharya@321"
    And click the login button To Check Reports
    Then Select Valid Tail To Check Reports
    And Click Continue button To Check Reports
    Then Click Flight Activity In Reports
    And Click Excel button In Flight Activity
    And close the Reports Page

  @TC_05
  Scenario: Reports:Flight Activity
    Given To Check Reports User is navigating to JetEdge URL is "https://preprod.flyjetedge.aero/ownerV2/login.aspx"
    When To Check Reports User Enter Valid username and Valid password are "soundharya@sankarasoftware.com" and "Soundharya@321"
    And click the login button To Check Reports
    Then Select Valid Tail To Check Reports
    And Click Continue button To Check Reports
    Then Click Flight Activity In Reports
    And Select Valid From and To Month In Flight Activity
    Then Click View button In Flight Activity
    And close the Reports Page

  @TC_06
  Scenario: Reports:Flight Activity
    Given To Check Reports User is navigating to JetEdge URL is "https://preprod.flyjetedge.aero/ownerV2/login.aspx"
    When To Check Reports User Enter Valid username and Valid password are "soundharya@sankarasoftware.com" and "Soundharya@321"
    And click the login button To Check Reports
    Then Select Valid Tail To Check Reports
    And Click Continue button To Check Reports
    Then Click Flight Activity In Reports
    And Select Valid From and To Month In Flight Activity
    Then Click Leg Radio button In Flight Activity
    Then Click View button In Flight Activity
    And close the Reports Page

  @TC_07
  Scenario: Reports:Flight Activity
    Given To Check Reports User is navigating to JetEdge URL is "https://preprod.flyjetedge.aero/ownerV2/login.aspx"
    When To Check Reports User Enter Valid username and Valid password are "soundharya@sankarasoftware.com" and "Soundharya@321"
    And click the login button To Check Reports
    Then Select Valid Tail To Check Reports
    And Click Continue button To Check Reports
    Then Click Flight Activity 1.0 In Reports
    And Click Excel button In Flight Activity 1.0
    And close the Reports Page

  @TC_08
  Scenario: Reports:Flight Activity
    Given To Check Reports User is navigating to JetEdge URL is "https://preprod.flyjetedge.aero/ownerV2/login.aspx"
    When To Check Reports User Enter Valid username and Valid password are "soundharya@sankarasoftware.com" and "Soundharya@321"
    And click the login button To Check Reports
    Then Select Valid Tail To Check Reports
    And Click Continue button To Check Reports
    Then Click Flight Activity 1.0 In Reports
    And Select Valid From and To Month In Flight Activity 1.0
    Then Click View button In Flight Activity 1.0
    And close the Reports Page

  @TC_09
  Scenario: Reports:Flight Activity
    Given To Check Reports User is navigating to JetEdge URL is "https://preprod.flyjetedge.aero/ownerV2/login.aspx"
    When To Check Reports User Enter Valid username and Valid password are "soundharya@sankarasoftware.com" and "Soundharya@321"
    And click the login button To Check Reports
    Then Select Valid Tail To Check Reports
    And Click Continue button To Check Reports
    Then Click Flight Activity 1.0 In Reports
    And Select Valid From and To Month In Flight Activity 1.0
    Then Click Leg Radio button In Flight Activity 1.0
    Then Click View button In Flight Activity 1.0
    And close the Reports Page

  @TC_10
  Scenario: Reports:Owner Trip Expense
    Given To Check Reports User is navigating to JetEdge URL is "https://preprod.flyjetedge.aero/ownerV2/login.aspx"
    When To Check Reports User Enter Valid username and Valid password are "soundharya@sankarasoftware.com" and "Soundharya@321"
    And click the login button To Check Reports
    Then Select Valid Tail To Check Reports
    And Click Continue button To Check Reports
    Then Click Owner Trip Expense In Reports
   # And Select Valid From and To Month In Owner Trip Expense
    Then Enter Valid Trip Number In Owner Trip Expense
    And Click View button In Owner Trip Expense
    And close the Reports Page
    
    @TC_11
  Scenario: Reports:Owner Trip Expense
    Given To Check Reports User is navigating to JetEdge URL is "https://preprod.flyjetedge.aero/ownerV2/login.aspx"
    When To Check Reports User Enter Valid username and Valid password are "soundharya@sankarasoftware.com" and "Soundharya@321"
    And click the login button To Check Reports
    Then Select Valid Tail To Check Reports
    And Click Continue button To Check Reports
    Then Click Owner Trip Expense In Reports
    #And Select Valid From and To Month In Owner Trip Expense
    And Click View button In Owner Trip Expense
    Then Click Any View button In Owner Trip Expense
    And Click Back button In Owner Trip Expense
    And close the Reports Page
    
    @TC_12
  Scenario: Reports:Owner Trip Expense
    Given To Check Reports User is navigating to JetEdge URL is "https://preprod.flyjetedge.aero/ownerV2/login.aspx"
    When To Check Reports User Enter Valid username and Valid password are "soundharya@sankarasoftware.com" and "Soundharya@321"
    And click the login button To Check Reports
    Then Select Valid Tail To Check Reports
    And Click Continue button To Check Reports
    Then Click Owner Trip Expense In Reports
    #And Select Valid From and To Month In Owner Trip Expense
    And Click View button In Owner Trip Expense
    Then Click Any View button In Owner Trip Expense
    And Click Excel button In Owner Trip Expense
    And close the Reports Page
    
    @TC_13
  Scenario: Reports:380 Trip Expense
    Given To Check Reports User is navigating to JetEdge URL is "https://preprod.flyjetedge.aero/ownerV2/login.aspx"
    When To Check Reports User Enter Valid username and Valid password are "soundharya@sankarasoftware.com" and "Soundharya@321"
    And click the login button To Check Reports
    Then Select Valid Tail To Check Reports
    And Click Continue button To Check Reports
    Then Click 380 Trip Expense In Reports
    #And Select Valid From and To Month In 380 Trip Expense
    And Click View button In 380 Trip Expense
    And close the Reports Page
    
    @TC_14
  Scenario: Reports:Charter Trip Expense
    Given To Check Reports User is navigating to JetEdge URL is "https://preprod.flyjetedge.aero/ownerV2/login.aspx"
    When To Check Reports User Enter Valid username and Valid password are "soundharya@sankarasoftware.com" and "Soundharya@321"
    And click the login button To Check Reports
    Then Select Valid Tail To Check Reports
    And Click Continue button To Check Reports
    Then Click Charter Trip Expense In Reports
    And Select Valid From and To Month In Charter Trip Expense
    And Click View button In Charter Trip Expense
    And close the Reports Page

    @TC_15
  Scenario: Reports:GL Wise Expense
    Given To Check Reports User is navigating to JetEdge URL is "https://preprod.flyjetedge.aero/ownerV2/login.aspx"
    When To Check Reports User Enter Valid username and Valid password are "soundharya@sankarasoftware.com" and "Soundharya@321"
    And click the login button To Check Reports
    Then Select Valid Tail To Check Reports
    And Click Continue button To Check Reports
    Then Click GL Wise Expense In Reports
    And Select Valid From and To Month In GL Wise Expense
    Then Select Single Expense Checkbox In GL Wise Expense
    And Click View button In GL Wise Expense
    And close the Reports Page
    
    @TC_16
  Scenario: Reports:GL Wise Expense
    Given To Check Reports User is navigating to JetEdge URL is "https://preprod.flyjetedge.aero/ownerV2/login.aspx"
    When To Check Reports User Enter Valid username and Valid password are "soundharya@sankarasoftware.com" and "Soundharya@321"
    And click the login button To Check Reports
    Then Select Valid Tail To Check Reports
    And Click Continue button To Check Reports
    Then Click GL Wise Expense In Reports
    And Select Valid From and To Month In GL Wise Expense
    Then Select Multiple Expense Checkbox In GL Wise Expense
    And Click View button In GL Wise Expense
    And close the Reports Page
    
    @TC_17
  Scenario: Reports:GL Wise Expense
    Given To Check Reports User is navigating to JetEdge URL is "https://preprod.flyjetedge.aero/ownerV2/login.aspx"
    When To Check Reports User Enter Valid username and Valid password are "soundharya@sankarasoftware.com" and "Soundharya@321"
    And click the login button To Check Reports
    Then Select Valid Tail To Check Reports
    And Click Continue button To Check Reports
    Then Click GL Wise Expense In Reports
    And Select Valid From and To Month In GL Wise Expense
    Then Select All Expense Checkbox In GL Wise Expense
    And Click View button In GL Wise Expense
    Then Click Excel button In GL Wise Expense
    And close the Reports Page
   
    @TC_18
  Scenario: Reports:Owner Revenue Payable
    Given To Check Reports User is navigating to JetEdge URL is "https://preprod.flyjetedge.aero/ownerV2/login.aspx"
    When To Check Reports User Enter Valid username and Valid password are "soundharya@sankarasoftware.com" and "Soundharya@321"
    And click the login button To Check Reports
    Then Select Valid Tail To Check Reports
    And Click Continue button To Check Reports
    Then Click Owner Revenue Payable In Reports
    Then Click Excel button In Owner Revenue Payable
    And close the Reports Page
    
     @TC_19
  Scenario: Reports:Payment History
    Given To Check Reports User is navigating to JetEdge URL is "https://preprod.flyjetedge.aero/ownerV2/login.aspx"
    When To Check Reports User Enter Valid username and Valid password are "soundharya@sankarasoftware.com" and "Soundharya@321"
    And click the login button To Check Reports
    Then Select Valid Tail To Check Reports
    And Click Continue button To Check Reports
    Then Click Payment History In Reports
    And Select Valid From and To Month In Payment History
    And Click View button In Payment History
    Then Click Excel button In Payment History
    And close the Reports Page
    
    @TC_20
  Scenario: Reports:Fuel Uplift
    Given To Check Reports User is navigating to JetEdge URL is "https://preprod.flyjetedge.aero/ownerV2/login.aspx"
    When To Check Reports User Enter Valid username and Valid password are "soundharya@sankarasoftware.com" and "Soundharya@321"
    And click the login button To Check Reports
    Then Select Valid Tail To Check Reports
    And Click Continue button To Check Reports
    Then Click Fuel Uplift In Reports
    And Select Valid From and To Month In Fuel Uplift
    And Click View button In Fuel Uplift
    Then Click View button In The Table
    Then Click Back button In Fuel Uplift
    And close the Reports Page
    
    @TC_21
  Scenario: Reports:Pilot Salary
    Given To Check Reports User is navigating to JetEdge URL is "https://preprod.flyjetedge.aero/ownerV2/login.aspx"
    When To Check Reports User Enter Valid username and Valid password are "soundharya@sankarasoftware.com" and "Soundharya@321"
    And click the login button To Check Reports
    Then Select Valid Tail To Check Reports
    And Click Continue button To Check Reports
    Then Click Pilot Salary In Reports
    And Select Valid Year In Pilot Salary
    Then Click View button In Pilot Salary
    And Click View button In The Table In Pilot Salary
    Then Click Back button In Pilot Salary
    And close the Reports Page
    
    @TC_22
  Scenario: Reports:Major Events
    Given To Check Reports User is navigating to JetEdge URL is "https://preprod.flyjetedge.aero/ownerV2/login.aspx"
    When To Check Reports User Enter Valid username and Valid password are "soundharya@sankarasoftware.com" and "Soundharya@321"
    And click the login button To Check Reports
    Then Select Valid Tail To Check Reports
    And Click Continue button To Check Reports
    Then Click Major Events In Reports
    And Select Valid From and To Month In Major Events
    Then Click View button In Major Events
    And close the Reports Page
    
    @TC_23
  Scenario: Reports:Lost Revenue
    Given To Check Reports User is navigating to JetEdge URL is "https://preprod.flyjetedge.aero/ownerV2/login.aspx"
    When To Check Reports User Enter Valid username and Valid password are "soundharya@sankarasoftware.com" and "Soundharya@321"
    And click the login button To Check Reports
    Then Select Valid Tail To Check Reports
    And Click Continue button To Check Reports
    Then Click Lost Revenue In Reports
    And Select Valid From and To Month In Lost Revenue
    Then Click View button In Lost Revenue
    And close the Reports Page