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
  "duration": 158293,
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
      "val": "desktop",
      "offset": 33
    }
  ],
  "location": "StepsDefinitions.openWilliamHillPage(String)"
});
formatter.result({
  "duration": 10096738986,
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
  "duration": 46523307,
  "error_message": "org.openqa.selenium.NoSuchWindowException: no such window: target window already closed\nfrom unknown error: web view not found\n  (Session info: chrome\u003d72.0.3626.119)\n  (Driver info: chromedriver\u003d2.46.628402 (536cd7adbad73a3783fdc2cab92ab2ba7ec361e1),platform\u003dWindows NT 10.0.17134 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 10 milliseconds\nBuild info: version: \u00272.53.1\u0027, revision: \u0027a36b8b1cd5757287168e54b817830adce9b0158d\u0027, time: \u00272016-06-30 19:26:09\u0027\nSystem info: host: \u0027DESKTOP-AM2BCG8\u0027, ip: \u0027192.168.0.206\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_131\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities [{mobileEmulationEnabled\u003dfalse, timeouts\u003d{implicit\u003d0, pageLoad\u003d300000, script\u003d30000}, hasTouchScreen\u003dfalse, platform\u003dXP, acceptSslCerts\u003dfalse, goog:chromeOptions\u003d{debuggerAddress\u003dlocalhost:56062}, acceptInsecureCerts\u003dfalse, webStorageEnabled\u003dtrue, browserName\u003dchrome, takesScreenshot\u003dtrue, javascriptEnabled\u003dtrue, setWindowRect\u003dtrue, unexpectedAlertBehaviour\u003dignore, applicationCacheEnabled\u003dfalse, rotatable\u003dfalse, networkConnectionEnabled\u003dfalse, chrome\u003d{chromedriverVersion\u003d2.46.628402 (536cd7adbad73a3783fdc2cab92ab2ba7ec361e1), userDataDir\u003dC:\\Users\\Tonya\\AppData\\Local\\Temp\\scoped_dir7484_31738}, takesHeapSnapshot\u003dtrue, pageLoadStrategy\u003dnormal, strictFileInteractability\u003dfalse, databaseEnabled\u003dfalse, handlesAlerts\u003dtrue, version\u003d72.0.3626.119, browserConnectionEnabled\u003dfalse, proxy\u003d{}, nativeEvents\u003dtrue, locationContextEnabled\u003dtrue, cssSelectorsEnabled\u003dtrue}]\nSession ID: c688599126b4de37dd3053cf452e0c3a\n*** Element info: {Using\u003dxpath, value\u003d//a[@id\u003d\u0027accountTabButton\u0027]//span[text()\u003d\u0027Login\u0027]}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:206)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:158)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:678)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:363)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:500)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:361)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:355)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy21.click(Unknown Source)\r\n\tat pageObjects.BasePage.waitAndClick(BasePage.java:32)\r\n\tat pageObjects.LogInPage.login(LogInPage.java:35)\r\n\tat stepsDefinitions.StepsDefinitions.userLogInToWilliamHill(StepsDefinitions.java:85)\r\n\tat ✽.When User logIn as user with login as \"WHITA_opex7\" and password as \"0p3x2017\"(src/test/resources/features/sport.feature:7)\r\n",
  "status": "failed"
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
  "duration": 17920,
  "status": "passed"
});
});