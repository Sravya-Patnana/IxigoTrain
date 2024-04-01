Feature: Ixigo Train Bookings

Scenario: Search For Available Trains By Destination
Given I am on the Home Page of Ixigo app
When I click on Trains and I can see the trains page
And I Enter "Secunderabad Jn (SC)" in From bar
And I Enter "Visakhapatnam (VSKP)" in To bar
And I click on Search bar
Then I Should see the list of Available Trains

Scenario: Search For Train By Name Or Number
Given I am on the Home Page of Ixigo app
When I click on Trains and I can see the trains page
When I click on Search By Name/Number 
And I click on Train By Name/Number bar
And I click on Search
Then I Should see the details about train 

Scenario: Search For Running Status for a specific train
Given I am on the Home Page of Ixigo app
When I click on Trains and I can see the trains page
When I click on Running Status
And I click on Train By Name bar
And I click on Searchbar
Then I Should see the Running Status for the specific train

Scenario: Search Trains From Railway Station
Given I am on the Home Page of Ixigo app
When I click on Trains and I can see the trains page
When I click on Search By Station
And I click on the Station Name Bar
And I click on search button
Then I Should See The Available Trains by Station 

Scenario: Search For Train By Name Or Number With No Results
Given I am on the Home Page of Ixigo app
When I click on Trains and I can see the trains page
When I click on Search By Name/Number 
And I click on Train By Number bar
And I Enter name or number and I click search
Then I should see the Please select a train number or name

  