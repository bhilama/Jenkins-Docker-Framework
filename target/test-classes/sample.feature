Feature: Hotel and Flight Booking

@smoke
Scenario Outline: Customer books Hotel
Given Customer logs in to the portal with username "Mahesh" and password "Test123"
When Customer selects date from 10th Oct 2025 to 15th Oct 2025
And Customer pays $230
Then Booking is complete
And I have $20.00 with me
And We travel to <Destination> on <From> till <To>

Examples:
|Destination    |From   |To |
|New Jersey     |25th Dec   |30th Dec   |
|Florida        |27th Dec   |31st Dec   |