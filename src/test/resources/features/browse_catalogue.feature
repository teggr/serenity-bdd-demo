Feature: Browse Catalogue

	In order to find things that I want to purchase
	As a customer
	I want to be able to browse the available items in a catalogue

  Scenario: See all items
    Given there are some items available in a catalogue
    When I browse the catalogue
    Then I should see the all the items
