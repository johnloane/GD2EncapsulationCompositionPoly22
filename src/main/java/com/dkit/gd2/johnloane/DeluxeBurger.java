package com.dkit.gd2.johnloane;

public class DeluxeBurger extends Hamburger
{
    private Sides chips;
    private Drinks drink;

    public DeluxeBurger(String meat, double price, String bunType)
    {
        super("Deluxe", meat, price, bunType);
        this.chips = new Sides("Chips", 2.75);
        this.drink = new Drinks("Drink", 1.80);
    }

    @Override
    public double itemiseHamburger()
    {
        double hamburgerPrice = super.itemiseHamburger();
        double priceOfChipsDrink = printChipsAndDrinkAddPrice();
        return hamburgerPrice+priceOfChipsDrink;
    }

    private double printChipsAndDrinkAddPrice()
    {
        double chipPrice = this.chips.getPrice();
        double drinkPrice = this.drink.getPrice();
        System.out.printf("Chips: " + "%.2f", chipPrice);
        System.out.printf("Drink: " + "%.2f", drinkPrice);
        return chipPrice + drinkPrice;
    }
}
