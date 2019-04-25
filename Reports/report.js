$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Features/google.feature");
formatter.feature({
  "name": "Google Seacrhes",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@userstory1"
    }
  ]
});
formatter.scenario({
  "name": "search apple in google.",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@userstory1"
    }
  ]
});
formatter.step({
  "name": "chrome browser is set up",
  "keyword": "Given "
});
formatter.match({
  "location": "googlesearches.chrome_browser_is_set_up()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "open the website",
  "keyword": "When "
});
formatter.match({
  "location": "googlesearches.open_the_website()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "go to URL",
  "keyword": "Then "
});
formatter.match({
  "location": "googlesearches.go_to_URL()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "page opens",
  "keyword": "And "
});
formatter.match({
  "location": "googlesearches.page_opens()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "seach box is empty",
  "keyword": "But "
});
formatter.match({
  "location": "googlesearches.seach_box_is_empty()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "type the keyword apple.",
  "keyword": "* "
});
formatter.match({
  "location": "googlesearches.type_the_keyword_apple()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "close browser",
  "keyword": "Then "
});
formatter.match({
  "location": "googlesearches.close_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "search samsung in google.",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@userstory1"
    },
    {
      "name": "@samsung"
    }
  ]
});
formatter.step({
  "name": "chrome browser is set up",
  "keyword": "Given "
});
formatter.match({
  "location": "googlesearches.chrome_browser_is_set_up()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "open the website",
  "keyword": "When "
});
formatter.match({
  "location": "googlesearches.open_the_website()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "go to URL",
  "keyword": "Then "
});
formatter.match({
  "location": "googlesearches.go_to_URL()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "page opens",
  "keyword": "And "
});
formatter.match({
  "location": "googlesearches.page_opens()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "seach box is empty",
  "keyword": "But "
});
formatter.match({
  "location": "googlesearches.seach_box_is_empty()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "type the keyword samsung",
  "keyword": "* "
});
formatter.match({
  "location": "googlesearches.type_the_keyword_samsung()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "close browser",
  "keyword": "Then "
});
formatter.match({
  "location": "googlesearches.close_browser()"
});
formatter.result({
  "status": "passed"
});
});