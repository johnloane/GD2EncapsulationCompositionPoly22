package com.dkit.gd2.johnloane;

public class MiniCooper extends Car
{
    public MiniCooper(int cylinders, String name)
    {
        super(cylinders, name);
    }

    @Override
    public String startEngine()
    {
        return "Mini -> startEngine()";
    }

    @Override
    public String accelerate()
    {
        return "Mini -> accelerate";
    }

    @Override
    public String brake()
    {
        return "Mini -> brake()";
    }
}
