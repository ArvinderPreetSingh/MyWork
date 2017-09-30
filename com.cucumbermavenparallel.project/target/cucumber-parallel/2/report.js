$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("E:/com.cucumbermavenparallel.project/src/test/resources/features/firefox.feature");
formatter.feature({
  "line": 1,
  "name": "Firefox",
  "description": "",
  "id": "firefox",
  "keyword": "Feature"
});
formatter.before({
  "duration": 7354408772,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Firefox Testing",
  "description": "",
  "id": "firefox;firefox-testing",
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
  "name": "Do firefox testing",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefination.do_firefox_testing()"
});
formatter.result({
  "duration": 17512591638,
  "status": "passed"
});
});