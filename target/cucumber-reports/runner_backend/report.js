$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/test.feature");
formatter.feature({
  "name": "Test",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@test"
    }
  ]
});
formatter.scenario({
  "name": "test one",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@test"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.write(" Execution Data \n Date and hour: 2022-03-10_10:00:02");
formatter.write("\n Running on Mac OS X by picaroon-core v4.4.5");
formatter.write("\n Backend Execution or not created driver yet");
formatter.beforestep({
  "status": "passed"
});
formatter.step({
  "name": "i do it",
  "keyword": "Given "
});
formatter.match({
  "location": "com.example.mpontoc.steps.StepDefs.\u003cinit\u003e(StepDefs.kt:12)"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.beforestep({
  "status": "passed"
});
formatter.step({
  "name": "i see it",
  "keyword": "When "
});
formatter.match({
  "location": "com.example.mpontoc.steps.StepDefs.\u003cinit\u003e(StepDefs.kt:17)"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.beforestep({
  "status": "passed"
});
formatter.step({
  "name": "show that",
  "keyword": "Then "
});
formatter.match({
  "location": "com.example.mpontoc.steps.StepDefs.\u003cinit\u003e(StepDefs.kt:21)"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.write(" Execution time : 00:00:00 ");
formatter.write("Total execution time until \u0027moment/final\u002700:00:04 ");
formatter.after({
  "status": "passed"
});
});