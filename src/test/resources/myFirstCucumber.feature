Feature: Login
  Scenario: LoginFacebook

    Given i have access to Facebook
    When i type the email: <email>
    And i type the password: 123
    And i click on login button
    Then i should be logged
