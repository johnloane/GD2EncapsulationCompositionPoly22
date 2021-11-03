package com.dkit.gd2.johnloane;

public class Player
{
    public String playerName;
    public int health;
    public String weapon;

    public void loseHealth(int damage)
    {
        this.health -= damage;
        if(this.health <= 0)
        {
            System.out.println("The player died");
        }
    }

    public int healthRemaining()
    {
        return this.health;
    }
}
