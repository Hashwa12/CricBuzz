Feature: Sample cucumber testing

@testing
Scenario Outline: Check parameter passing
Given Print one statement
When Statement printed pass parameter1 "<p1>"
Then logout


Examples:
|p1|
|fine|
|working|