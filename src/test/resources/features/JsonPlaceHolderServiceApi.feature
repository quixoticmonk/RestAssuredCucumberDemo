Feature:
  Background:
    Given I am on the api url "https://jsonplaceholder.typicode.com/"
    When I send a get request on "posts/1"

  Scenario: Validate the "GET" requests
    Then I get the "userId" as "1"
    And I get the "id" as "1"
    And I get the "title" as "sunt aut facere repellat provident occaecati excepturi optio reprehenderit"
    And I get the "body" as "quia et suscipit\nsuscipit recusandae consequuntur expedita et cum\nreprehenderit molestiae ut ut quas totam\nnostrum rerum est autem sunt rem eveniet architecto"

  Scenario: Validate the "GET" requests
    Then I get a ststus of "200"