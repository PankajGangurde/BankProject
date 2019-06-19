$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/main/resources/features/HomeLoanBasic.feature");
formatter.feature({
  "name": "Home Loan Basic",
  "description": "This feature verifies the basic loan borrowing information",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Check the borrowing estimates of a person",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I launch Chrome browser instance",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefs_BankHomePage.I_launch_Chrome_browser_instance()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I open Bank Homepage",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefs_BankHomePage.I_open_Bank_Homepage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter the person details",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefs_BankHomePage.I_enter_the_person_details()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I verify the borrowing estimate",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefs_BankHomePage.I_verify_the_borrowing_estimate()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I close the browser",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefs_BankHomePage.I_close_the_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Check the Start over button clears the form",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I launch Chrome browser instance",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefs_BankHomePage.I_launch_Chrome_browser_instance()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I open Bank Homepage",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefs_BankHomePage.I_open_Bank_Homepage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter the person details",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefs_BankHomePage.I_enter_the_person_details()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I verify the borrowing estimate",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefs_BankHomePage.I_verify_the_borrowing_estimate()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I verify Start over button clears the form",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefs_BankHomePage.I_verify_Start_over_button_clears_the_form()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I close the browser",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefs_BankHomePage.I_close_the_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Check the error message on submitting the form with zero values",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I launch Chrome browser instance",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefs_BankHomePage.I_launch_Chrome_browser_instance()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I open Bank Homepage",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefs_BankHomePage.I_open_Bank_Homepage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter the person details with living expense value",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefs_BankHomePage.I_enter_the_person_details_with_living_expense_value()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I verify the error message",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefs_BankHomePage.I_verify_the_error_message()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I close the browser",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefs_BankHomePage.I_close_the_browser()"
});
formatter.result({
  "status": "passed"
});
});