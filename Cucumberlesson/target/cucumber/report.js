$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Tagging/tagging.feature");
formatter.feature({
  "line": 2,
  "name": "",
  "description": "As a user\r\nI want to be able to add new clients in the system\r\nSo that i can add accounting data for that client",
  "id": "",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Signup"
    },
    {
      "line": 1,
      "name": "@TaggedAgain"
    }
  ]
});
formatter.scenarioOutline({
  "line": 12,
  "name": "Data driving new user sign-up",
  "description": "",
  "id": ";data-driving-new-user-sign-up",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 11,
      "name": "@Signup-DataDriven"
    }
  ]
});
formatter.step({
  "line": 13,
  "name": "she provides the first name as \"\u003cfirstName\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "she provides the last name as \"\u003clastName\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "she provides the email as \"\u003cemail\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "she provides the password as \"\u003cpassword\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "she provides the confirm password again as \"\u003cpassword\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "she signs-up",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "she should be logged in to the application",
  "keyword": "Then "
});
formatter.examples({
  "line": 20,
  "name": "",
  "description": "",
  "id": ";data-driving-new-user-sign-up;",
  "rows": [
    {
      "cells": [
        "firstName",
        "lastName",
        "email",
        "password"
      ],
      "line": 21,
      "id": ";data-driving-new-user-sign-up;;1"
    },
    {
      "cells": [
        "Bairon",
        "Kumar",
        "validemail@aq.com",
        "password"
      ],
      "line": 22,
      "id": ";data-driving-new-user-sign-up;;2"
    },
    {
      "cells": [
        "Lance",
        "lake",
        "lance@aq.com",
        "passbette"
      ],
      "line": 23,
      "id": ";data-driving-new-user-sign-up;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 225083,
  "status": "passed"
});
formatter.before({
  "duration": 62764,
  "status": "passed"
});
formatter.background({
  "line": 7,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 8,
  "name": "the user is on landing page",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "she chooses to sign up",
  "keyword": "When "
});
formatter.match({
  "location": "Tagging.setup()"
});
formatter.result({
  "duration": 6481429322,
  "status": "passed"
});
formatter.match({
  "location": "Tagging.she_chooses_to_sign_up()"
});
formatter.result({
  "duration": 521659685,
  "status": "passed"
});
formatter.scenario({
  "line": 22,
  "name": "Data driving new user sign-up",
  "description": "",
  "id": ";data-driving-new-user-sign-up;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@Signup"
    },
    {
      "line": 1,
      "name": "@TaggedAgain"
    },
    {
      "line": 11,
      "name": "@Signup-DataDriven"
    }
  ]
});
formatter.step({
  "line": 13,
  "name": "she provides the first name as \"Bairon\"",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "she provides the last name as \"Kumar\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "she provides the email as \"validemail@aq.com\"",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "she provides the password as \"password\"",
  "matchedColumns": [
    3
  ],
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "she provides the confirm password again as \"password\"",
  "matchedColumns": [
    3
  ],
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "she signs-up",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "she should be logged in to the application",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Bairon",
      "offset": 32
    }
  ],
  "location": "Tagging.she_provides_the_first_name_as_Sukesh(String)"
});
formatter.result({
  "duration": 44746230,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Kumar",
      "offset": 31
    }
  ],
  "location": "Tagging.she_provides_the_last_name_as_Sukesh(String)"
});
formatter.result({
  "duration": 50627432,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "validemail@aq.com",
      "offset": 27
    }
  ],
  "location": "Tagging.she_provides_the_email_as_Sukesh1(String)"
});
formatter.result({
  "duration": 99233143,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "password",
      "offset": 30
    }
  ],
  "location": "Tagging.she_provides_the_password_as_Sukesh(String)"
});
formatter.result({
  "duration": 43813438,
  "status": "passed"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.after({
  "duration": 48232,
  "status": "passed"
});
formatter.before({
  "duration": 30300,
  "status": "passed"
});
formatter.before({
  "duration": 32155,
  "status": "passed"
});
formatter.background({
  "line": 7,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 8,
  "name": "the user is on landing page",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "she chooses to sign up",
  "keyword": "When "
});
formatter.match({
  "location": "Tagging.setup()"
});
formatter.result({
  "duration": 5936729932,
  "status": "passed"
});
formatter.match({
  "location": "Tagging.she_chooses_to_sign_up()"
});
formatter.result({
  "duration": 757788604,
  "status": "passed"
});
formatter.scenario({
  "line": 23,
  "name": "Data driving new user sign-up",
  "description": "",
  "id": ";data-driving-new-user-sign-up;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@Signup"
    },
    {
      "line": 1,
      "name": "@TaggedAgain"
    },
    {
      "line": 11,
      "name": "@Signup-DataDriven"
    }
  ]
});
formatter.step({
  "line": 13,
  "name": "she provides the first name as \"Lance\"",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "she provides the last name as \"lake\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "she provides the email as \"lance@aq.com\"",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "she provides the password as \"passbette\"",
  "matchedColumns": [
    3
  ],
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "she provides the confirm password again as \"passbette\"",
  "matchedColumns": [
    3
  ],
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "she signs-up",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "she should be logged in to the application",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Lance",
      "offset": 32
    }
  ],
  "location": "Tagging.she_provides_the_first_name_as_Sukesh(String)"
});
formatter.result({
  "duration": 40917668,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "lake",
      "offset": 31
    }
  ],
  "location": "Tagging.she_provides_the_last_name_as_Sukesh(String)"
});
formatter.result({
  "duration": 52059549,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "lance@aq.com",
      "offset": 27
    }
  ],
  "location": "Tagging.she_provides_the_email_as_Sukesh1(String)"
});
formatter.result({
  "duration": 92556115,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "passbette",
      "offset": 30
    }
  ],
  "location": "Tagging.she_provides_the_password_as_Sukesh(String)"
});
formatter.result({
  "duration": 756272081,
  "status": "passed"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.after({
  "duration": 55033,
  "status": "passed"
});
});