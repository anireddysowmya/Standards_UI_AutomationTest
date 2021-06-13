Feature: Enquire new Home loan
Scenario Outline: As a customer, I would like to enquire about new home loan and fill up the  Call Back form at Nab

Given when user launches the browser and navigates to url <url>	
When user selects Home loans from Personal Home list
And  user selects request call back from enquiry list
When user selects home loan topic and proceeds next
And user enters the details <firstname>, <lastname>,<Email> and <phonenumber> in call back form
Then user submits the form
Then user closes the application







Examples:
|url|firstname|lastname|Email|phonenumber|
|https://www.nab.com.au/|Test|verify|verifyone.test@gmail.com|0411111111|
