Feature: Ability to place a bet on a English Premier League event


  Scenario Outline: As a WH Customer I want to place a bet on a English Premier League event

    Given User open WilliamHill Page from "<device>"
    When User logIn as user with login as "<login>" and password as "<password>"
    And User go to page English Premier League events
    Then User place a bet "<bet>" for home team to 'Win'
    And User see returns based on bet "<bet>" and odds

    Examples:
|device    | login          | password   | bet    |
|desktop    | WHITA_opex7    | 0p3x2017   | 0.05   |



