Feature: Login
  Background: #se utiliza al inicio de cada scenario, evita la duplicidad de codigo
    Given i have access to Facebook

  Scenario: LoginFacebook

    When i type the email: <email>
    And i type the password: 123
    And i click on login button
    Then i should be logged

  Scenario: LoginFacebook2

    When i type the email: <email>
    And i click on login button

  Scenario: LoginFacebook3

    And i click on login button
    Then i should be logged