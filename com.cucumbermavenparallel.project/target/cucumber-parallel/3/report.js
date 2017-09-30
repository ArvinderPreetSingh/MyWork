$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("E:/com.cucumbermavenparallel.project/src/test/resources/features/ie.feature");
formatter.feature({
  "line": 1,
  "name": "IE",
  "description": "",
  "id": "ie",
  "keyword": "Feature"
});
formatter.before({
  "duration": 7133370615,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "IE Testing",
  "description": "",
  "id": "ie;ie-testing",
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
  "name": "Do IE testing",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefination.do_IE_testing()"
});
formatter.result({
  "duration": 17983500376,
  "status": "passed"
});
});