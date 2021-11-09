package com.dkit.gd2.johnloane;

public class HealthyBurger extends Hamburger
{
    public HealthyBurger(String meat, double price)
    {
        super("Healthy", meat, price, "Brown Rye");
    }

    @Override
    public void addFilling(String name, double price)
    {
        if (this.fillings.size() <= 6)
        {
            this.fillings.add(new Filling(name, price));
        }
    }

}
