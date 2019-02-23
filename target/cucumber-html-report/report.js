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
  "line": 7,
  "name": "User logIn as user with login as \"\u003clogin\u003e\" and password as \"\u003cpassword\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "User go to page English Premier League events",
  "keyword": "Then "
});
formatter.examples({
  "line": 10,
  "name": "",
  "description": "",
  "id": "ability-to-place-a-bet-on-a-english-premier-league-event;as-a-wh-customer-i-want-to-place-a-bet-on-a-english-premier-league-event;",
  "rows": [
    {
      "cells": [
        "login",
        "password"
      ],
      "line": 11,
      "id": "ability-to-place-a-bet-on-a-english-premier-league-event;as-a-wh-customer-i-want-to-place-a-bet-on-a-english-premier-league-event;;1"
    },
    {
      "cells": [
        "WHITA_opex7",
        "0p3x2017"
      ],
      "line": 12,
      "id": "ability-to-place-a-bet-on-a-english-premier-league-event;as-a-wh-customer-i-want-to-place-a-bet-on-a-english-premier-league-event;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 11671736034,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "As a WH Customer I want to place a bet on a English Premier League event",
  "description": "",
  "id": "ability-to-place-a-bet-on-a-english-premier-league-event;as-a-wh-customer-i-want-to-place-a-bet-on-a-english-premier-league-event;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 7,
  "name": "User logIn as user with login as \"WHITA_opex7\" and password as \"0p3x2017\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "User go to page English Premier League events",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.after({
  "duration": 1585832284,
  "status": "passed"
});
});