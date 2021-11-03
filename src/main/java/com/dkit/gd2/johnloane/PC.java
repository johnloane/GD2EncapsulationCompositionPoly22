package com.dkit.gd2.johnloane;

public class PC
{
    private Case theCase;
    private Monitor monitor;
    private Motherboard motherboard;
    private GraphicsCard graphicsCard;
    private CPU cpu;

    public PC(Case theCase, Monitor monitor, Motherboard motherboard, GraphicsCard graphicsCard, CPU cpu)
    {
        this.theCase = theCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
        this.graphicsCard = graphicsCard;
        this.cpu = cpu;
    }

    public void powerUp()
    {
        theCase.pressPowerButton();
        drawLogo();
    }

    private void drawLogo()
    {
        monitor.drawPixelAt(1200, 50, "blue");
    }
}
