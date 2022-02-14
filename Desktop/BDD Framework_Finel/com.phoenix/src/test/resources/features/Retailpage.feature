Feature: Retail Page for this feature you have to have a new existing account

  Background: 
    Given User is on Retail website
    And User click  on MyAccount
    When User click on Login
    And User enter username ‘username’ and password 'password’
    And User click on Login button
    Then User should be logged in to MyAccount dashboard

  @affiliate
  Scenario: Register as an Affiliate user with Cheque Payment Method
    When User click on ‘Register for an Affiliate Account’ link
    And User fill affiliate form with below information
      | company         | website         | taxID         | paymentMethod  |
      | WeyalBrofthehr1 | www.Roejhfi.aff | teajfx2331423 | kflhanddCheque |
    And User check on About us check box
    And User click on Continue button
    Then User should see a success message

  Scenario: Edit your affiliate information from Cheque payment method to Bank Transfer
    When User click on ‘Edit your affiliate informationlink
    And user click on Bank Transfer radio button
    And User fill Bank information with below information
      | bankName   | abaNumber | swiftCode | accountName | accountNumber |
      | khan2baknk |    468889 |    560589 | ghajnjan    |  554390924830 |
    And User click on Continue button
    Then User should see a success message

  Scenario: Edit your account Information
    When User click on ‘Edit your account information’ link
    And User modify below information
      | firstname | lastName | email                   | telephone    |
      | ajkhan    | wkha7n   | ajkh7anwkhran@gmail.com | 803869998909 |
    And User click on continue button
    Then User should see a message ‘Success: Your account has been successfully updated.’
