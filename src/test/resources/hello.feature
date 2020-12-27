Feature: Get a simple hello
  I want call the webservice on the /hello endpoint and I'll get a simple hello from it

  Scenario: I get the Hello string
    When I open the /hello endpoint
    Then the client receives status code of 200
    And The server returns with a "Hello!" string