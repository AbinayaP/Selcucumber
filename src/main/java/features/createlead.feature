Feature: Create a new lead
@positive
Scenario Outline: Create a new Lead(positive)
Given Enter username as <username> 
And Enter password as <password>
And Click login
And click crmsfa
And click leads link
When click on createlead
And enter company name as <cname>
And Enter firstname as <Fname>
And Enter Lastname as <Lname>
And click on submit
Then verify the lead created
Examples:
|username|password|cname|Fname|Lname|
|DemosalesManager|crmsfa|IBM|Abi|P|
|DemosalesManager|crmsfa|Fourblocks|Viki|E|

@Negative
Scenario Outline: Create a new Lead(Negative)
Given Enter username as <username> 
And Enter password as <password>
And Click login
And click crmsfa
And click leads link
When click on createlead
And enter company name as <cname>
And Enter firstname as <Fname>
And click on submit
Then verify the lead is not created

Examples:
|username|password|cname|Fname|
|DemosalesManager|crmsfa|IBM|Abi|
