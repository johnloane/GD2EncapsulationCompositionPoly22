package com.dkit.gd2.johnloane;


public class App 
{
    public static void main( String[] args )
    {
//        Player player = new Player();
//        player.playerName = "Kevin";
//        player.health = 20;
//        player.weapon = "Sword";
//
//        int damage = 10;
//        player.loseHealth(damage);
//        System.out.println("Remaining health " + player.healthRemaining());
//
//        damage = 11;
//        player.health = 1000000;
//        player.loseHealth(damage);
//        System.out.println("Remaining health " + player.healthRemaining());
//        BetterPlayer player = new BetterPlayer("Kevin", 200, "Sword");
//        System.out.println("Hitpoints " + player.getHitPoints());
        demoPrinter();

    }

    public static void demoPrinter()
    {
        Printer printer = new Printer(50, false);
        System.out.println("Initial page count = " + printer.getPagesPrinted());
        int pagesPrinted = printer.printPages(4);
        System.out.println("New page count = " + printer.getPagesPrinted());
    }

    /*
    Create a class to demonstrate encapsulation
    The class will be called Printer
    It should have fields for toner level, number of pages printed and
    also whether it is a duplex printer (prints on both sides)
    Add methods to fill up the toner (up to max of 100%) another
    method to simulate printing a page (increase number of pages printed

     */
}
