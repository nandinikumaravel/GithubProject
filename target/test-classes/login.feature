Feature:  To validate facebook functionality


@smoke
Scenario: To validate login function with username and password

Given To open chrome
When to pass valid username and valid password
|email|Nandini@1324|
|username|nandini|
|password|46674|
     
Then to click the button

@sanity
Scenario: To validate login function with username and password
Given To open chrome
When to pass valid username and invalid password
|email|password|username|rollno|
|Nandini|164|hvhgfgh|654565|
|manoj|7569|yhkli|456|
|cfdghv|546|tfd|21465|

Then to click the button


