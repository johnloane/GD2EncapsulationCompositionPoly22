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
        //demoPrinter();
        //demoPC();
        //playMovies();
        //driveCars();
        mmmmmmmmHamburgers();

    }

    private static void mmmmmmmmHamburgers()
    {
        /* The purpose of this app is help company called Dylan's Burgers to manage to manage the process of selling hamburgers.
        Should help with selecting types of burgers, fillings to be added to the burger and pricing
        We want to create a base hamburger, but also two other popular types of hamburger.
        The basic hamburger should have the following:
        bun type, meat, up to 4 additional fillings
        This base burger gas a base prive and fillings are all separately priced
        Create a hamburger class to deal with all of the above
        The constructor should only include bun type, meat and price, can also include name of burger
        Also create two additional Hamburgers to cater for
        1) Healthy burger (on brown rye bun), plus two toppings
        The healthy burger can have 6 fillings in total
        2) Deluxe Hamburger - comes with chips and drinks as extras, no extra fillings
        All 3 classes should have a method that can be called anytime to show the base price of the hamburger plus all fillings, each showing the filling name and price and a grant total for the burger (base price + all additions)
         */
    }

    private static void driveCars()
    {
        Car car = new Car(8, "Base car");
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());

        Car skyline = new Skyline(4, "Skyline");
        System.out.println(skyline.startEngine());
        System.out.println(skyline.accelerate());
        System.out.println(skyline.brake());

        Car mini = new MiniCooper(3, "Mini Cooper");
        System.out.println(mini.startEngine());
        System.out.println(mini.accelerate());
        System.out.println(mini.brake());

        Car porsche911 = new Porsche911(6, "Porsche 911");
        System.out.println(porsche911.startEngine());
        System.out.println(porsche911.accelerate());
        System.out.println(porsche911.brake());
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
        //bedRoom.makeBed();

        //bedRoom.getLamp().turnOn();
    }

    private static void playMovies()
    {
        for(int i=0; i < 11; i++)
        {
            Movie movie = randomMovie();
            System.out.println("Movie #" + i + " : " + movie.getName() + "\n" + "Plot: " + movie.plot() + "\n");
        }
    }

    private static Movie randomMovie()
    {
        int randomNumber = (int)(Math.random()*4) + 1;
        System.out.println("Number generated was " + randomNumber);
        if(randomNumber == 1)
        {
            return new TheGoodTheBadAndTheUgly();
        }
        else if(randomNumber == 2)
        {
            return new BladeRunner();
        }
        else if(randomNumber == 3)
        {
            return new ThreeHundred();
        }
        else if(randomNumber == 4)
        {
            return new BraveHeart();
        }
        return null;
    }
}
