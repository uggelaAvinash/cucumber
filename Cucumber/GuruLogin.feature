Feature: Login With valid Credentials

  Scenario: Login With valid Credentials
    Given Open Edge Browser
    And Open URL demo.guru99.com/v4
    When Login Id Login Password
    And Click On Submit
    Then Redirect to Bankpage
