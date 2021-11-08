package com.dkit.gd2.johnloane;

public class Skyline extends Car
{
    public Skyline(int cylinders, String name)
    {
        super(cylinders, name);
    }

    @Override
    public String startEngine()
    {
        return "Skyline -> startEngine()";
    }

    @Override
    public String accelerate()
    {
        return "Skyline -> accelerate";
    }

    @Override
    public String brake()
    {
        return "Skyline -> brake()";
    }
}
