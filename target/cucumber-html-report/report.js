$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/sport.feature");
formatter.feature({
  "line": 1,
  "name": "Ability to place a bet on a English Premier League event",
  "description": "",
  "id": "ability-to-place-a-bet-on-a-english-premier-league-event",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 4,
  "name": "As a WH Customer I want to place a bet on a English Premier League event",
  "description": "",
  "id": "ability-to-place-a-bet-on-a-english-premier-league-event;as-a-wh-customer-i-want-to-place-a-bet-on-a-english-premier-league-event",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 6,
  "name": "User open WilliamHill Page from \"\u003cdevice\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "User logIn as user with login as \"\u003clogin\u003e\" and password as \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "User go to page English Premier League events",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "User place a bet \"\u003cbet\u003e\" for home team to \u0027Win\u0027",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "User see returns based on bet \"\u003cbet\u003e\" and odds",
  "keyword": "And "
});
formatter.examples({
  "line": 12,
  "name": "",
  "description": "",
  "id": "ability-to-place-a-bet-on-a-english-premier-league-event;as-a-wh-customer-i-want-to-place-a-bet-on-a-english-premier-league-event;",
  "rows": [
    {
      "cells": [
        "device",
        "login",
        "password",
        "bet"
      ],
      "line": 13,
      "id": "ability-to-place-a-bet-on-a-english-premier-league-event;as-a-wh-customer-i-want-to-place-a-bet-on-a-english-premier-league-event;;1"
    },
    {
      "cells": [
        "desktop",
        "WHITA_opex7",
        "0p3x2017",
        "0.05"
      ],
      "line": 14,
      "id": "ability-to-place-a-bet-on-a-english-premier-league-event;as-a-wh-customer-i-want-to-place-a-bet-on-a-english-premier-league-event;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 217600,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "As a WH Customer I want to place a bet on a English Premier League event",
  "description": "",
  "id": "ability-to-place-a-bet-on-a-english-premier-league-event;as-a-wh-customer-i-want-to-place-a-bet-on-a-english-premier-league-event;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 6,
  "name": "User open WilliamHill Page from \"desktop\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "User logIn as user with login as \"WHITA_opex7\" and password as \"0p3x2017\"",
  "matchedColumns": [
    1,
    2
  ],
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "User go to page English Premier League events",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "User place a bet \"0.05\" for home team to \u0027Win\u0027",
  "matchedColumns": [
    3
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "User see returns based on bet \"0.05\" and odds",
  "matchedColumns": [
    3
  ],
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "\"desktop\"",
      "offset": 32
    }
  ],
  "location": "StepsDefinitions.openWilliamHillPage(String)"
});
formatter.result({
  "duration": 233105493,
  "error_message": "java.lang.NullPointerException\r\n\tat stepsDefinitions.StepsDefinitions.openWilliamHillPage(StepsDefinitions.java:75)\r\n\tat ✽.Given User open WilliamHill Page from \"desktop\"(src/test/resources/features/sport.feature:6)\r\n",
  "status": "failed"
});
formatter.match({
  "arguments": [
    {
      "val": "WHITA_opex7",
      "offset": 34
    },
    {
      "val": "0p3x2017",
      "offset": 64
    }
  ],
  "location": "StepsDefinitions.userLogInToWilliamHill(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepsDefinitions.UserGoToEnglishPremierLeagueEvents()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "0.05",
      "offset": 18
    }
  ],
  "location": "StepsDefinitions.userPlaceBetForHomeTeamToWin(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "0.05",
      "offset": 31
    }
  ],
  "location": "StepsDefinitions.userSeeReturnStakeAndTotalStake(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 20054,
  "status": "passed"
});
});