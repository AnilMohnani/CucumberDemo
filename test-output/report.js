$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/features/Amart.feature");
formatter.feature({
  "name": "Amart Login Application",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Amart Login testing",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User is on Login Screen of the Amart App",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefinitions.AmartLoginSteps.user_is_on_login_screen_of_the_amart_app()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters email and password",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinitions.AmartLoginSteps.user_enters_email_and_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User must be successfully log into App",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.AmartLoginSteps.user_must_be_successfully_loginto_app()"
});
formatter.result({
  "error_message": "junit.framework.ComparisonFailure: expected:\u003cM[y account]\u003e but was:\u003cM[Y ACCOUNT]\u003e\r\n\tat junit.framework.Assert.assertEquals(Assert.java:100)\r\n\tat junit.framework.Assert.assertEquals(Assert.java:107)\r\n\tat stepDefinitions.AmartLoginSteps.user_must_be_successfully_loginto_app(AmartLoginSteps.java:35)\r\n\tat ✽.User must be successfully log into App(file:///C:/Anil/CucumberRahul/src/test/java/features/Amart.feature:7)\r\n",
  "status": "failed"
});
formatter.scenario({
  "name": "Amart logout",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User is on profile home screen",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinitions.AmartLoginSteps.user_is_on_profile_home_screen()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on logout",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.AmartLoginSteps.user_clicks_on_logout()"
});
formatter.result({
  "status": "passed"
});
});