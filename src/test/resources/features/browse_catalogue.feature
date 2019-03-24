Feature: Browse Catalogue

	In order to find kittens that I want to purchase
	As a customer
	I want to be able to browse the available kittens

  Scenario: See all kittens
    Given there are some kittens available
    When I browse the catalogue
    Then I should see all available kittens
