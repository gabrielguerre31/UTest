# Autor: Gabriel Guerrero
@stories
Feature: Utest page
  As a user, I want to be able to register on the Utest page
  @scenario1
  Scenario: sign up for Utest
    Given that Gabriel wants to register in utest
    When he enters the data on the register page
    | strFirstName | strLastName  | strEmail                             | strMonth | strDay | strYear | strLanguage | strCity | strPostal | strCountry | strComputer | strVersion | strLanguagePc | strDevice | strModel | strOs     | strPassword    |
    | Gabriel      | Guerrero     | erom@correo.udistrital.edu.co    | January  | 31     | 1997    | Spanish     | Bogota  | 1212121   | Colombia   | Windows     | 10         | Spanish       | Xiaomi    | Redmi 7  | Android 10| Universidad123*|
    Then he is able to register
    | strRegister                                                             |
    | Welcome to the world's largest community of freelance software testers! |