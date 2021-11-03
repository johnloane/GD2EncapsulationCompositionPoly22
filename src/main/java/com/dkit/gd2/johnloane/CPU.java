package com.dkit.gd2.johnloane;

public class CPU
{
    private String model;
    private String manufacturer;
    private int cores;
    private int coreGeneration;
    private int coreVersion;

    public CPU(String model, String manufacturer, int cores, int coreGeneration, int coreVersion)
    {
        this.model = model;
        this.manufacturer = manufacturer;
        this.cores = cores;
        this.coreGeneration = coreGeneration;
        this.coreVersion = coreVersion;
    }

    public String getModel()
    {
        return model;
    }

    public String getManufacturer()
    {
        return manufacturer;
    }

    public int getCores()
    {
        return cores;
    }

    public int getCoreGeneration()
    {
        return coreGeneration;
    }

    public int getCoreVersion()
    {
        return coreVersion;
    }
}
