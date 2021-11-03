package com.dkit.gd2.johnloane;

public class BetterPlayer
{
    private String playerName;
    private int hitPoints = 100;
    private String weapon;

    public BetterPlayer(String playerName, int hitPoints, String weapon)
    {
        this.playerName = playerName;
        if(hitPoints > 0 && hitPoints <= 100)
        {
            this.hitPoints = hitPoints;
        }
        this.weapon = weapon;
    }

    public int getHitPoints()
    {
        return hitPoints;
    }

    public void loseHealth(int damage)
    {
        this.hitPoints -= damage;
        if(this.hitPoints <= 0)
        {
            System.out.println("The player died");
        }
    }
}
