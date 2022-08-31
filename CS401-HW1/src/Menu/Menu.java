package Menu;
import Plant.Plant;

import java.util.*;


public class Menu {
    int mainMenuChoice;
    boolean valid = false;

    public int displayMainMenu(){
      System.out.println("\nPlants, v0.1");
      System.out.println("=============");

      do{
          Scanner stdin = new Scanner(System.in);
          System.out.println("Enter command : \n 0 to Quit\n 1 to Add\n 2 to Find by type\n 3 to Find by zone\n 4 to Find by name\n 5 to Display all information >>> ");
          mainMenuChoice = stdin.nextInt();

          if(mainMenuChoice < 0 || mainMenuChoice > 5)
          {
              valid = false;
              System.out.println("Invalid Input\n");
          } else if (mainMenuChoice == 0)
          {
              System.exit(0);
          }
          else {
              valid = true;
          }

          System.out.println("You have entered : "+ mainMenuChoice + "\n");

      }while(!valid);

      return mainMenuChoice;

    }

    public Plant addPlantInformation()
    {
        Plant newPlant = new Plant();
        Scanner stdin = new Scanner(System.in);
        System.out.printf("Please enter Common Name : ");
        newPlant.setPlantCommonName(stdin.next());
        stdin = new Scanner(System.in);
        System.out.printf("Please enter Scientific Name : ");
        newPlant.setPlantScientificName(stdin.next());
        stdin = new Scanner(System.in);
        System.out.printf("Please enter Type of Plant (0 > Tree, 1 > Perennial) : ");
        newPlant.setPlantTypeOfPlant(stdin.nextInt());
        stdin = new Scanner(System.in);
        System.out.printf("Please enter Minimum Growing Zone : ");
        newPlant.setPlantMinGrowingZone(stdin.nextInt());
        stdin = new Scanner(System.in);
        System.out.printf("Please enter Maximum Growing Zone : ");
        newPlant.setPlantMaxGrowingZone(stdin.nextInt());

        return newPlant;
    }

}
