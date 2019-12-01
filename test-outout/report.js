$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/aathi/eclipse-workspace/CricBuzzCucumbebr/src/main/java/features/CucumberTesting.feature");
formatter.feature({
  "line": 1,
  "name": "Sample cucumber testing",
  "description": "",
  "id": "sample-cucumber-testing",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 4,
  "name": "Check parameter passing",
  "description": "",
  "id": "sample-cucumber-testing;check-parameter-passing",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@testing"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "Print one statement",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Statement printed pass parameter1 \"\u003cp1\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "logout",
  "keyword": "Then "
});
formatter.examples({
  "line": 10,
  "name": "",
  "description": "",
  "id": "sample-cucumber-testing;check-parameter-passing;",
  "rows": [
    {
      "cells": [
        "p1"
      ],
      "line": 11,
      "id": "sample-cucumber-testing;check-parameter-passing;;1"
    },
    {
      "cells": [
        "fine"
      ],
      "line": 12,
      "id": "sample-cucumber-testing;check-parameter-passing;;2"
    },
    {
      "cells": [
        "working"
      ],
      "line": 13,
      "id": "sample-cucumber-testing;check-parameter-passing;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 12,
  "name": "Check parameter passing",
  "description": "",
  "id": "sample-cucumber-testing;check-parameter-passing;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@testing"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "Print one statement",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Statement printed pass parameter1 \"fine\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "logout",
  "keyword": "Then "
});
formatter.match({
  "location": "CucumberTesting.print_one_statement()"
});
formatter.result({
  "duration": 616834600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "fine",
      "offset": 35
    }
  ],
  "location": "CucumberTesting.statement_printed_pass_parameter(String)"
});
formatter.result({
  "duration": 3946500,
  "status": "passed"
});
formatter.match({
  "location": "CucumberTesting.logout()"
});
formatter.result({
  "duration": 112600,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "Check parameter passing",
  "description": "",
  "id": "sample-cucumber-testing;check-parameter-passing;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@testing"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "Print one statement",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Statement printed pass parameter1 \"working\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "logout",
  "keyword": "Then "
});
formatter.match({
  "location": "CucumberTesting.print_one_statement()"
});
formatter.result({
  "duration": 228400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "working",
      "offset": 35
    }
  ],
  "location": "CucumberTesting.statement_printed_pass_parameter(String)"
});
formatter.result({
  "duration": 158200,
  "status": "passed"
});
formatter.match({
  "location": "CucumberTesting.logout()"
});
formatter.result({
  "duration": 136500,
  "status": "passed"
});
});