Feature: delete a lead
Scenario Outline: delete existing Lead(positive)
Given Enter username as <username> 
And Enter password as <password>
And Click login
And click crmsfa
And click leads link
When click on Findlead
And click on phone 
And type phone number as <phno>
And click find lead button
And get first id
And Click first id
And Click on delete
And click on Findlead
And type leadid
Then click find lead button
Examples:
|username|password|phno|
|DemosalesManager|crmsfa|9626817324|

