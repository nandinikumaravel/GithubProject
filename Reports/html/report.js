$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("login.feature");
formatter.feature({
  "line": 1,
  "name": "To validate facebook functionality",
  "description": "",
  "id": "to-validate-facebook-functionality",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 5,
  "name": "To validate login function with username and password",
  "description": "",
  "id": "to-validate-facebook-functionality;to-validate-login-function-with-username-and-password",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "To open chrome",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "to pass valid username and valid password",
  "rows": [
    {
      "cells": [
        "email",
        "Nandini@1324"
      ],
      "line": 9
    },
    {
      "cells": [
        "username",
        "nandini"
      ],
      "line": 10
    },
    {
      "cells": [
        "password",
        "46674"
      ],
      "line": 11
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "to click the button",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.to_open_chrome()"
});
formatter.result({
  "duration": 6475516788,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.to_pass_valid_username_and_valid_password(DataTable)"
});
formatter.result({
  "duration": 12499285343,
  "error_message": "java.lang.IllegalArgumentException: Keys to send should be a not null CharSequence\r\n\tat org.openqa.selenium.remote.RemoteWebElement.sendKeys(RemoteWebElement.java:97)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(Unknown Source)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(Unknown Source)\r\n\tat java.lang.reflect.Method.invoke(Unknown Source)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:51)\r\n\tat com.sun.proxy.$Proxy17.sendKeys(Unknown Source)\r\n\tat org.base.HelperCLass.fillText(HelperCLass.java:57)\r\n\tat org.demo.StepDefinition.to_pass_valid_username_and_valid_password(StepDefinition.java:30)\r\n\tat ✽.When to pass valid username and valid password(login.feature:8)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "StepDefinition.to_click_the_button()"
});
formatter.result({
  "status": "skipped"
});
});