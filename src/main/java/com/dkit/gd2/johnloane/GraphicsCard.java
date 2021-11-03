package com.dkit.gd2.johnloane;

public class GraphicsCard
{
    private String model;
    private String manufacturer;
    private int vram;

    public GraphicsCard(String model, String manufacturer, int vram)
    {
        this.model = model;
        this.manufacturer = manufacturer;
        this.vram = vram;
    }

    public String getModel()
    {
        return model;
    }

    public String getManufacturer()
    {
        return manufacturer;
    }

    public int getVram()
    {
        return vram;
    }
}
