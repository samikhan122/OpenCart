Feature: login to NOP Commerce and validate registration

  Scenario: Login and validate
    Given Open Browser "https://demo.nopcommerce.com/"
    Then Enter the information to register
    Then assert the data
    And close the browser


#crtl+shift+f- align data


  Scenario Outline: Login data driven
    Given User launches browswer
    Given login to nop Ecommerce "https://demo.nopcommerce.com/"
    When User navigates to my Account menu
    And click on Login
    And User enters Email as "<email>" amd Password "<password>"

    Examples:
      | email                 | password    |
      | loruBasheer@gmail.com | test@123    |
      | alikhan@gmail.com     | test@45678  |
      | khaninloru            | alikhan0786 |