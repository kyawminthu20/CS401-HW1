// Importing all required packages

import Menu.Menu;
import Plant.Plant;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.Formatter;

// Main Class Start here
public class Main {
    public static void main(String[] args) {

        int menuL1Choice;

        System.out.println("Program Started");

      // All plants information are stored as Plant class in a Linked List Data Structure
      // Menu is declared as a class
      // do While loop is used to repeately display top menu until quit choice is selected.

        LinkedList<Plant> plantDB = new LinkedList<>();
        Menu plantMenu = new Menu();

        do
        {
            menuL1Choice = plantMenu.displayMainMenu();
            //System.out.println("the return value is " + menuL1Choice);

            switch (menuL1Choice) {
                case 1 -> {
                    System.out.println("Adding a plant information < Common Name, Scientific Name, Type of Plant, Minimum Planting Zone, Maximum Planting Zone");
                    Plant newPlant = new Plant();
                    newPlant = plantMenu.addPlantInformation();
                    plantDB.add(newPlant);

                }
                case 2 -> {
                    System.out.println("Finding Plant name by Type ");
                    findingPlantNameByType(plantDB);
                }
                case 3 -> {
                    System.out.println("Finding Plant name by Zone ");
                    findingPlantNameByZone(plantDB);
                }
                case 4 -> {
                    System.out.println("Finding Plant name by Name ");
                    findingPlantNameByName(plantDB);
                }
                case 5 -> {

                    Formatter fmt = new Formatter();
                    fmt.format("%15s %15s %15s %15s\n", "Common Name", "Scientific Name", "Type of Plant", "Growing Zone");

                    for (Plant i : plantDB) {
                        fmt.format("%14s %14s %14s %14s\n", i.getPlantCommonName(), i.getPlantScientificName(), i.getPlantTypeOfPlant(), i.getPlantGrowingZone());
                    }
                    System.out.println(fmt);
                }
                default -> {
                    System.out.println("Case not matched Error");
                }
            }

        } while (menuL1Choice != 0);

    }
    private static void findingPlantNameByZone(LinkedList<Plant> plantDB)
    {
        Scanner stdin = new Scanner(System.in);
        System.out.printf("Enter zone to search : ");
        int zoneToSearch = stdin.nextInt();

        System.out.println("Results related to < " + zoneToSearch + " >");

        Formatter fmt = new Formatter();
        fmt.format("%15s %15s %15s %15s\n", "Common Name", "Scientific Name", "Type of Plant", "Growing Zone");

        for (Plant i : plantDB)
        {
            int plantMinZone = i.getPlantMinGrowingZone();
            int plantMaxZone = i.getPlantMaxGrowingZone();

            if (zoneToSearch == plantMinZone || zoneToSearch == plantMaxZone)
            {
                fmt.format("%14s %14s %14s %14s\n", i.getPlantCommonName(), i.getPlantScientificName(), i.getPlantTypeOfPlant(), i.getPlantGrowingZone());
            }
        }
        System.out.println(fmt);
    }

    private static void findingPlantNameByType(LinkedList<Plant> plantDB)
    {
        Scanner stdin = new Scanner(System.in);
        System.out.printf("Enter Type to search (0 > Tree, 1 > Perennial) : ");
        int typeToSearch = stdin.nextInt();

        Formatter fmt = new Formatter();
        fmt.format("%15s %15s %15s %15s\n", "Common Name", "Scientific Name", "Type of Plant", "Growing Zone");

        System.out.println("Results related to < " + typeToSearch + " >");
        for (Plant i : plantDB)
        {
            int typeToCompare = i.getTypeOfPlant();

            if ( typeToSearch == typeToCompare )
            {
                fmt.format("%14s %14s %14s %14s\n", i.getPlantCommonName(), i.getPlantScientificName(), i.getPlantTypeOfPlant(), i.getPlantGrowingZone());
            }
        }
        System.out.println(fmt);

    }

    private static void findingPlantNameByName(LinkedList<Plant> plantDB)
    {
        Scanner stdin = new Scanner(System.in);
        System.out.printf("Enter name to search : ");
        String nameToSearch = stdin.next();

        Formatter fmt = new Formatter();
        fmt.format("%15s %15s %15s %15s\n", "Common Name", "Scientific Name", "Type of Plant", "Growing Zone");


        System.out.println("Results related to < " + nameToSearch + " >");
        for (Plant i : plantDB)
        {
            String plantCommonName = i.getPlantCommonName();
            String plantScientificName = i.getPlantScientificName();

            if (plantCommonName.equalsIgnoreCase(nameToSearch) || plantScientificName.equalsIgnoreCase(nameToSearch))
            {
                fmt.format("%14s %14s %14s %14s\n", i.getPlantCommonName(), i.getPlantScientificName(), i.getPlantTypeOfPlant(), i.getPlantGrowingZone());
            }
        }
        System.out.println(fmt);

    }
}