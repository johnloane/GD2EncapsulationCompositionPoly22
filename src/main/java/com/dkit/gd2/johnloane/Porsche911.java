package com.dkit.gd2.johnloane;

public class Porsche911 extends Car
{
    public Porsche911(int cylinders, String name)
    {
        super(cylinders, name);
    }

    @Override
    public String startEngine()
    {
        return "911 -> startEngine()";
    }

    @Override
    public String accelerate()
    {
        return "911 -> accelerate()";
    }

    @Override
    public String brake()
    {
        return "911 -> brake()";
    }
}
