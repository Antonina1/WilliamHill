Feature: Ability to place a bet on a English Premier League event


  Scenario Outline: As a WH Customer I want to place a bet on a English Premier League event

    Given User open WilliamHill Page
    When User logIn as user with login as "<login>" and password as "<password>"
    Then User go to page English Premier League events

    Examples:
| login          | password   |
| WHITA_opex7    | 0p3x2017   |



