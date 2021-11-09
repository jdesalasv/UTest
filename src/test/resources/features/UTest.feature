
# Autor: Jahaziel De Salas

@stories
Feature: UTest
  A user needs to create their credentials to enter uTest

  @scenario
  Scenario Outline: Create credentials
    Given than Jahaziel needs to enter uTest link
    When he enter your data to be able to register on the uTest platform
      |strFirstName | strLastName | strEmail                   | strMonth  | strDay  | strYear | strLanguage | strZip  | strPassword |   strCity     |  strCountry |   strSO |  strSOVersion | strBrand  |     strModel    | strMovilSO  |
      |<strFirstName>|<strLastName>|<strEmail>                   |<strMonth>  | <strDay>  | <strYear> | <strLanguage> | <strZip>  | <strPassword> |   <strCity>     |  <strCountry> |   <strSO> |  <strSOVersion> | <strBrand>  |     <strModel>    | <strMovilSO>  |
    Then he see the welcome page on the uTest platform and see the message
      |strWelcomeMessage                                                      |
      |Welcome to the world's largest community of freelance software testers!|

    Examples:
      | strFirstName | strLastName | strEmail                   | strMonth  | strDay  | strYear | strLanguage | strZip  | strPassword |   strCity     |  strCountry |   strSO |  strSOVersion | strBrand  |     strModel    | strMovilSO  |
      | Jahaziel    | De Salas     |jahazieldesalas6@hotmail.com|November   |3        |1988     |Spanish      |07079    |YUidni8415*  | La Chorrera   |   Panama    | Windows |     10        | Huawei    | Y9 Prime (2019) | Android 10  |





