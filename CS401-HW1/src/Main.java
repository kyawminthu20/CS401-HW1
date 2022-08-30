import Menu.Menu;
import Plant.Plant;

import java.util.LinkedList;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        int menuL1Choice;

        System.out.println("Program Started");

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
                    for (Plant i : plantDB) {
                        System.out.println(
                                i.getPlantCommonName() + " | " +
                                        i.getPlantScientificName() + " | " +
                                        i.getPlantTypeOfPlant() + " | " +
                                        i.getPlantMinGrowingZone() + " | " +
                                        i.getPlantMaxGrowingZone());
                    }
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
        for (Plant i : plantDB)
        {
            int plantMinZone = i.getPlantMinGrowingZone();
            int plantMaxZone = i.getPlantMaxGrowingZone();

            if (zoneToSearch == plantMinZone || zoneToSearch == plantMaxZone)
            {
                System.out.println(
                        i.getPlantCommonName() + " | " +
                                i.getPlantScientificName() + " | " +
                                i.getPlantTypeOfPlant() + " | " +
                                i.getPlantMinGrowingZone() + " | " +
                                i.getPlantMaxGrowingZone());
            }
        }
    }

    private static void findingPlantNameByType(LinkedList<Plant> plantDB)
    {
        Scanner stdin = new Scanner(System.in);
        System.out.printf("Enter Type to search (0 > Tree, 1 > Perennial) : ");
        int typeToSearch = stdin.nextInt();


        System.out.println("Results related to < " + typeToSearch + " >");
        for (Plant i : plantDB)
        {
            int typeToCompare = i.getTypeOfPlant();

            if ( typeToSearch == typeToCompare )
            {
                System.out.println(
                        i.getPlantCommonName() + " | " +
                                i.getPlantScientificName() + " | " +
                                i.getPlantTypeOfPlant() + " | " +
                                i.getPlantMinGrowingZone() + " | " +
                                i.getPlantMaxGrowingZone());
            }
        }

    }

    private static void findingPlantNameByName(LinkedList<Plant> plantDB)
    {
        Scanner stdin = new Scanner(System.in);
        System.out.printf("Enter name to search : ");
        String nameToSearch = stdin.next();

        System.out.println("Results related to < " + nameToSearch + " >");
        for (Plant i : plantDB)
        {
            String plantCommonName = i.getPlantCommonName();
            String plantScientificName = i.getPlantScientificName();

            if (plantCommonName.equalsIgnoreCase(nameToSearch) || plantScientificName.equalsIgnoreCase(nameToSearch))
            {
                System.out.println(
                        i.getPlantCommonName() + " | " +
                                i.getPlantScientificName() + " | " +
                                i.getPlantTypeOfPlant() + " | " +
                                i.getPlantMinGrowingZone() + " | " +
                                i.getPlantMaxGrowingZone());
            }
        }

    }
}