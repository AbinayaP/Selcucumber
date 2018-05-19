Feature: Create a new lead
@positive
Scenario Outline: Edit a existing Lead(positive)
Given Enter username as <username> 
And Enter password as <password>
And Click login
And click crmsfa
And click leads link
When click on Findlead
And type first name as <Fname>
And click find lead button
And Click first id
And Click on edit
And Type cname on edit lead page as <cname>
And click update button
Then verify the cname as <cname>
Examples:
|username|password|Fname|cname|
|DemosalesManager|crmsfa|Abi|Fourblocks|
|DemosalesManager|crmsfa|Viki|IBM|
