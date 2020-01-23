$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("D:/My Study/cucumberdemo/src/test/java/com/tyss/cucumberdemo/test/Features.feature");
formatter.feature({
  "line": 1,
  "name": "Login Action",
  "description": "",
  "id": "login-action",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "Successful login with valid credentials",
  "description": "",
  "id": "login-action;successful-login-with-valid-credentials",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "User navigate to login page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User enters \"\u003cusers\u003e\" and \"\u003cpass\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "Login should be successful",
  "keyword": "Then "
});
formatter.examples({
  "line": 7,
  "name": "",
  "description": "",
  "id": "login-action;successful-login-with-valid-credentials;",
  "rows": [
    {
      "cells": [
        "users",
        "pass"
      ],
      "line": 8,
      "id": "login-action;successful-login-with-valid-credentials;;1"
    },
    {
      "cells": [
        "trainee",
        "trainee"
      ],
      "line": 9,
      "id": "login-action;successful-login-with-valid-credentials;;2"
    },
    {
      "cells": [
        "admin",
        "manager"
      ],
      "line": 10,
      "id": "login-action;successful-login-with-valid-credentials;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 9,
  "name": "Successful login with valid credentials",
  "description": "",
  "id": "login-action;successful-login-with-valid-credentials;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "User navigate to login page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User enters \"trainee\" and \"trainee\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "Login should be successful",
  "keyword": "Then "
});
formatter.match({
  "location": "Step.user_navigate_to_login_page()"
});
formatter.result({
  "duration": 30422260500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "trainee",
      "offset": 13
    },
    {
      "val": "trainee",
      "offset": 27
    }
  ],
  "location": "Step.user_enters_username_and_password(String,String)"
});
formatter.result({
  "duration": 1223916000,
  "status": "passed"
});
formatter.match({
  "location": "Step.login_should_be_successful()"
});
formatter.result({
  "duration": 12543818000,
  "status": "passed"
});
formatter.scenario({
  "line": 10,
  "name": "Successful login with valid credentials",
  "description": "",
  "id": "login-action;successful-login-with-valid-credentials;;3",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "User navigate to login page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User enters \"admin\" and \"manager\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "Login should be successful",
  "keyword": "Then "
});
formatter.match({
  "location": "Step.user_navigate_to_login_page()"
});
formatter.result({
  "duration": 22850479300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "admin",
      "offset": 13
    },
    {
      "val": "manager",
      "offset": 25
    }
  ],
  "location": "Step.user_enters_username_and_password(String,String)"
});
formatter.result({
  "duration": 1002706500,
  "status": "passed"
});
formatter.match({
  "location": "Step.login_should_be_successful()"
});
formatter.result({
  "duration": 11163994600,
  "status": "passed"
});
});