Feature: Basket

	In order to purchase items from a catalogue
	As a customer
	I want to be put those items in a basket which can be purchased

Background:
	Given there are some items available in a catalogue

  Scenario: Add items to basket
    Given I am browsing the catalogue
    When I find an item I like
    Then I should be able add that to my basket

  Scenario: Remove items from basket
    Given I have an item in my basket
    When I no longer want that item
    Then I should be able to remove that item from my basket
  
  Scenario: Clear basket
  	Given I have some items in my basket
  	When I no longer want any items
  	Then I should be able to clear all items from my basket
  	
	Scenario: Purchase basket
  	Given I have some items in my basket
  	When I have all the items I want
  	Then I should be able to purchase those items