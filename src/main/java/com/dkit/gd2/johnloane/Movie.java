package com.dkit.gd2.johnloane;

public class Movie
{
    private String name;

    public Movie(String name)
    {
        this.name = name;
    }

    public String plot()
    {
        return "We don't know the plot yet";
    }

    public String getName()
    {
        return name;
    }
}
