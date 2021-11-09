package com.dkit.gd2.johnloane;

import java.util.ArrayList;

public class Hamburger
{
    private String name;
    private String meat;
    private double price;
    private String bunType;

    protected ArrayList<Filling> fillings = new ArrayList<>();

    public Hamburger(String name, String meat, double price, String bunType)
    {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.bunType = bunType;
    }

    public void addFilling(String name, double price)
    {
        if(this.fillings.size() <= 4)
        {
            this.fillings.add(new Filling(name, price));
        }
    }

    public double itemiseHamburger()
    {
        double hamburgerPrice = this.price;

        System.out.printf("%s" + " hamburger" + " on a " + "%s" + " bun " + "with " + "%s" + ", price is " + "%.2f\n", this.name, this.bunType, this.meat, this.price);
        double priceOfAllFillings = printAndTotalFillings();
        hamburgerPrice += priceOfAllFillings;
        return hamburgerPrice;
    }

    private double printAndTotalFillings()
    {
        double price = 0;
        if(this.fillings.size() == 0)
        {
            return 0;
        }
        for(Filling filling : this.fillings)
        {
            price += filling.getPrice();
            System.out.printf("Added %s" + " for an extra %.2f\n", filling.getName(), filling.getPrice() );
        }
        return price;
    }

    public ArrayList<Filling> getFillings()
    {
        return fillings;
    }
}
