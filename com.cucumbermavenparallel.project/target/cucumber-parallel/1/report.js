$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("E:/com.cucumbermavenparallel.project/src/test/resources/features/chrome.feature");
formatter.feature({
  "line": 1,
  "name": "Chrome",
  "description": "",
  "id": "chrome",
  "keyword": "Feature"
});
formatter.before({
  "duration": 7832319084,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Chrome Testing",
  "description": "",
  "id": "chrome;chrome-testing",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@tag"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "Do Chrome testing",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefination.do_Chrome_testing()"
});
formatter.result({
  "duration": 17277469188,
  "status": "passed"
});
formatter.before({
  "duration": 3022983033,
  "status": "passed"
});
formatter.scenario({
  "line": 8,
  "name": "Chromes Testing",
  "description": "",
  "id": "chrome;chromes-testing",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 7,
      "name": "@tag"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "Do Chromes testing",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefination.do_Chromes_testing()"
});
formatter.result({
  "duration": 5797799561,
  "status": "passed"
});
});