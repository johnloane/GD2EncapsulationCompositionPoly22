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
        demoPC();

    }

    private static void demoPC()
    {
        Dimensions dimensions = new Dimensions(15, 45, 45);
        Case theCase = new Case("20B", "Dell", "240v", dimensions);
        Monitor theMonitor = new Monitor("Lenovo 24", "IBM", 24, new Resolution(3840, 2160));
        Motherboard theMotherboard = new Motherboard("G99", "Asus", 4, 6, "v7.0");
        GraphicsCard theGPU = new GraphicsCard("3090", "Nvidia", 16);
        CPU theCPU = new CPU("Ryzen", "AMD", 16, 5000, 9);
        PC myNewPC = new PC(theCase, theMonitor, theMotherboard, theGPU, theCPU);
        myNewPC.powerUp();
    }

    private static void demoPrinter()
    {
        Printer printer = new Printer(50, false);
        System.out.println("Initial page count = " + printer.getPagesPrinted());
        int pagesPrinted = printer.printPages(4);
        System.out.println("New page count = " + printer.getPagesPrinted());
    }

    /*
    Create a single room of a house using composition
    Think about what should be included in the room
    It could be the physical parts of the house, as well as furniture
    Add at least one method to access an object by a getter and the
    use that objects public method
    Then at least one method to hide the object (not using getter) but to access the object via composition
     */
    private static void demoRoomOfHouse()
    {
        bedRoom.makeBed();

        bedRoom.getLamp().turnOn();
    }
}
