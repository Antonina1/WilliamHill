$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/sport.feature");
formatter.feature({
  "line": 1,
  "name": "Place a bet on a English Premier League event",
  "description": "",
  "id": "place-a-bet-on-a-english-premier-league-event",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 4,
  "name": "As a WH Customer I want to place a bet on a English Premier League event",
  "description": "",
  "id": "place-a-bet-on-a-english-premier-league-event;as-a-wh-customer-i-want-to-place-a-bet-on-a-english-premier-league-event",
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
  "id": "place-a-bet-on-a-english-premier-league-event;as-a-wh-customer-i-want-to-place-a-bet-on-a-english-premier-league-event;",
  "rows": [
    {
      "cells": [
        "device",
        "login",
        "password",
        "bet"
      ],
      "line": 13,
      "id": "place-a-bet-on-a-english-premier-league-event;as-a-wh-customer-i-want-to-place-a-bet-on-a-english-premier-league-event;;1"
    },
    {
      "cells": [
        "desktop",
        "WHITA_opex7",
        "0p3x2017",
        "0.05"
      ],
      "line": 14,
      "id": "place-a-bet-on-a-english-premier-league-event;as-a-wh-customer-i-want-to-place-a-bet-on-a-english-premier-league-event;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 171946,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "As a WH Customer I want to place a bet on a English Premier League event",
  "description": "",
  "id": "place-a-bet-on-a-english-premier-league-event;as-a-wh-customer-i-want-to-place-a-bet-on-a-english-premier-league-event;;2",
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
      "val": "desktop",
      "offset": 33
    }
  ],
  "location": "StepsDefinitions.openWilliamHillPage(String)"
});
formatter.result({
  "duration": 10814637226,
  "status": "passed"
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
  "duration": 6795622827,
  "status": "passed"
});
formatter.match({
  "location": "StepsDefinitions.UserGoToEnglishPremierLeagueEvents()"
});
formatter.result({
  "duration": 18660344747,
  "status": "passed"
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
  "duration": 7875135573,
  "status": "passed"
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
  "duration": 366285654,
  "status": "passed"
});
formatter.after({
  "duration": 1372463787,
  "status": "passed"
});
});