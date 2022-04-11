package View;

import Classes.*;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int user;
        do{
            System.out.println("\n");
            System.out.println("CREATE SPACECRAFT | MENU");
            System.out.println("==================================================");
            System.out.println("| 1. Create ShuttleShip: (1)");
            System.out.println("| 2. Create UnManned SpaceCraft: (2)");
            System.out.println("| 3. Create Manned SpaceCraft: (3)");
            System.out.println("| 4. Create Hybrid SpaceCraft: (4)");
            System.out.println("| 5. EXIT: (5)");
            System.out.println("==================================================");
            System.out.println("Enter the number of your process:");
            Scanner inputMain= new Scanner(System.in);
            user= inputMain.nextInt();

            switch (user){
                case 1:
                    System.out.println("Your selection was create a SHUTTLE SpaceCraft");

                    System.out.println("\nEnter the spacecraft's name: ");
                    Scanner name= new Scanner(System.in);
                    String S1Name= name.next();

                    System.out.println("\nEnter the spacecraft's origin: ");
                    Scanner from= new Scanner(System.in);
                    String S1from= from.next();

                    System.out.println("\nEnter the spacecraft's weight (kgs): ");
                    Scanner weight= new Scanner(System.in);
                    int S1weight= weight.nextInt();

                    ShuttleShip S1= new ShuttleShip(S1Name,S1from,S1weight, "ShuttleShip");
                    methodsShuttleShip(S1);
                    break;
                case 2:
                    System.out.println("Your selection was create a UNMANNED SpaceCraft");

                    System.out.println("\nEnter the spacecraft's name: ");
                    Scanner nameUnmanned= new Scanner(System.in);
                    String U1NameUnmanned= nameUnmanned.next();

                    System.out.println("\nEnter the spacecraft's origin: ");
                    Scanner fromUnmanned= new Scanner(System.in);
                    String U1fromUnmanned= fromUnmanned.next();

                    System.out.println("\nEnter the spacecraft's weight (kgs): ");
                    Scanner weightUnmanned= new Scanner(System.in);
                    int U1weightUnmanned= weightUnmanned.nextInt();

                    UnMannedShip U1= new UnMannedShip(U1NameUnmanned,U1fromUnmanned,U1weightUnmanned, "UnMannedShip", 12000);
                    methodsUnMannedShip(U1);
                    break;
                case 3:
                    System.out.println("Your selection was create a MANNED SpaceCraft");

                    System.out.println("\nEnter the spacecraft's name: ");
                    Scanner nameManned= new Scanner(System.in);
                    String M1NameManned= nameManned.next();

                    System.out.println("\nEnter the spacecraft's origin: ");
                    Scanner fromManned= new Scanner(System.in);
                    String M1fromManned= fromManned.next();

                    System.out.println("\nEnter the spacecraft's weight (kgs): ");
                    Scanner weightManned= new Scanner(System.in);
                    int M1weightManned= weightManned.nextInt();

                    System.out.println("\nEnter the spacecraft's passenger number: ");
                    Scanner passengerManned= new Scanner(System.in);
                    int M1passengerManned= weightManned.nextInt();

                    MannedShip M1= new MannedShip(M1NameManned,M1fromManned,M1weightManned, "MannedShip",M1passengerManned);
                    int items= M1.getPassengersNumber();
                    for (int i= 1;i<=items; i++) {
                        System.out.println("\n| Enter the name of the passenger "+i+":");
                        Scanner input= new Scanner(System.in);
                        String name1= input.next();
                        M1.setNamesPassengers(name1);
                    }
                    methodsMannedShips(M1);
                    break;
                case 4:
                    System.out.println("Your selection was create a HYBRID SpaceCraft");

                    System.out.println("\nEnter the spacecraft's name: ");
                    Scanner nameHybrid= new Scanner(System.in);
                    String H1NameHybrid= nameHybrid.next();

                    System.out.println("\nEnter the spacecraft's origin: ");
                    Scanner fromHybrid= new Scanner(System.in);
                    String H1fromHybrid= fromHybrid.next();

                    System.out.println("\nEnter the spacecraft's weight (kgs): ");
                    Scanner weightHybrid= new Scanner(System.in);
                    int H1weightHybrid= weightHybrid.nextInt();

                    System.out.println("\nEnter the spacecraft's passenger number: ");
                    Scanner passengerHybrid= new Scanner(System.in);
                    int H1passengerHybrid= weightHybrid.nextInt();

                    System.out.println("\nEnter the spacecraft's hypersleep chamber number: ");
                    Scanner chamberHybrid= new Scanner(System.in);
                    int H1chamberHybrid= chamberHybrid.nextInt();

                    HybridShip H1= new HybridShip(H1NameHybrid,H1fromHybrid,H1weightHybrid, "HybridShip",H1passengerHybrid,H1chamberHybrid);
                    int itemsH1= H1.getPassengersNumber();
                    if (itemsH1 > 0){
                        for (int i= 1;i<=itemsH1; i++) {
                            System.out.println("\n| Enter the name of the passenger "+i+":");
                            Scanner input= new Scanner(System.in);
                            String name1= input.next();
                            H1.setNamesPassengers(name1);
                        }
                    }
                    methodsHybridShips(H1);
                    break;
            }
        }while (user != 5);
        System.out.println("\nThe program is over");
        System.out.println("\nCreated By: <Nestor Quiroga A-Dev/>");

    }


// FUNCTIONS FOR SECUNDARY MENUS OF METHODS OF EACH SPACECRAFT

    /**
     * Submenus for select the methods ShuttleShip
     * @param S1 Instance of ShuttleShip
     */
    private static void methodsShuttleShip(ShuttleShip S1){
        System.out.println("\n| You can select a function.");
        System.out.println("==================================================");
        System.out.println("| 1. Get Information: (1)");
        System.out.println("| 2. Passengers Number: (2)");
        System.out.println("| 3. Turn-On Engine: (3)");
        System.out.println("| 4. Throw Load: (4)");
        System.out.println("==================================================\n");
        System.out.println("| Enter a number to perform the operation.");
        Scanner input= new Scanner(System.in);
        int user= input.nextInt();
        System.out.println("\n");
        switch (user){
            case 1:
                S1.getInformation();
                break;
            case 2:
                System.out.println("Passengers number: "+S1.getPassengersNumber());
                break;
            case 3:
                S1.turnOnEngine();
                break;
            case 4:
                System.out.println(S1.throwLoad());
                break;
        }
    }

    /**
     * Submenus for select the methods UnMannedShip
     * @param U1 Instance of UnMannedShip
     */
    private static void methodsUnMannedShip(UnMannedShip U1){
        System.out.println("\n| You can select a function.");
        System.out.println("==================================================");
        System.out.println("| 1. Get Information: (1)");
        System.out.println("| 2. Passengers Number: (2)");
        System.out.println("| 3. Turn-On Engine: (3)");
        System.out.println("| 4. Turn-On Camera: (4)");
        System.out.println("| 5. Take Photos: (5)");
        System.out.println("==================================================\n");
        System.out.println("| Enter a number to perform the operation.");
        Scanner input= new Scanner(System.in);
        int user= input.nextInt();
        System.out.println("\n");
        switch (user){
            case 1:
                U1.getInformation();
                break;
            case 2:
                System.out.println("Passengers number: "+U1.getPassengersNumber());
                break;
            case 3:
                U1.turnOnEngine();
                break;
            case 4:
                System.out.println("| Enter True or False");
                Scanner value= new Scanner(System.in);
                boolean valueCamera= value.nextBoolean();
                U1.turnOnCamera(valueCamera);
                break;
            case 5:
                U1.takePhotos();
        }
    }

    /**
     * Submenus for select the methods MannedShips
     * @param M1 Instance of MannedShips
     */
    private static void methodsMannedShips(MannedShip M1){
        System.out.println("\n| You can select a function.");
        System.out.println("==================================================");
        System.out.println("| 1. Get Information: (1)");
        System.out.println("| 2. Passengers Number: (2)");
        System.out.println("| 3. Passengers Names: (3)");
        System.out.println("| 4. Turn-On Engine: (4)");
        System.out.println("| 5. Enable/Disable Speakers: (5)");
        System.out.println("==================================================\n");
        System.out.println("| Enter a number to perform the operation.");
        Scanner input= new Scanner(System.in);
        int user= input.nextInt();
        System.out.println("\n");
        switch (user){
            case 1:
                M1.getInformation();
                break;
            case 2:
                System.out.println("Passengers number: "+M1.getPassengersNumber());
                break;
            case 3:
                System.out.println("The Passenger names are: "+M1.getNamesPassengers());
                break;
            case 4:
                M1.turnOnEngine();
                break;
            case 5:
                System.out.println("| Enter True or False");
                Scanner value= new Scanner(System.in);
                boolean valueSpeaker= value.nextBoolean();
                M1.activateSpeakers(valueSpeaker);
                break;
        }
    }

    /**
     * Submenus for select the methods HybridShips
     * @param H1 Instance of HybridShips
     */
    private static void methodsHybridShips(HybridShip H1){
        System.out.println("\n| You can select a function.");
        System.out.println("==================================================");
        System.out.println("| 1. Get Information: (1)");
        System.out.println("| 2. Passengers Number: (2)");
        System.out.println("| 3. Passengers Names: (3)");
        System.out.println("| 4. Turn-On Engine: (4)");
        System.out.println("| 5. Enable/Disable Hypersleep Chambers: (5)");
        System.out.println("| 6. Open the food compartment: (6)");
        System.out.println("==================================================\n");
        System.out.println("| Enter a number to perform the operation.");
        Scanner input= new Scanner(System.in);
        int user= input.nextInt();
        System.out.println("\n");
        switch (user){
            case 1:
                H1.getInformation();
                break;
            case 2:
                System.out.println("Passengers number: "+H1.getPassengersNumber());
                break;
            case 3:
                System.out.println("The Passenger names are: "+H1.getNamesPassengers());
                break;
            case 4:
                H1.turnOnEngine();
                break;
            case 5:
                System.out.println("| Enter True or False");
                Scanner value= new Scanner(System.in);
                boolean valueChamber= value.nextBoolean();
                H1.enableHypersleepChamber(valueChamber);
                break;
            case 6:
                H1.openFoodCompartment();
                break;
        }
    }

}
