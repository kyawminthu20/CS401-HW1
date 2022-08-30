package Plant;

public class Plant {
    String commonName, scientificName;
    int typeOfPlant;
    int minGrowingZone, maxGrowingZone;

    public void setPlantCommonName(String s)
    {
        commonName = s;
    }
    public void setPlantScientificName(String s)
    {
        scientificName = s;
    }
    public void setPlantTypeOfPlant(int s)
    {
        typeOfPlant = s;
    }
    public void setPlantMinGrowingZone(int s)
    {
        minGrowingZone = s;
    }
    public void setPlantMaxGrowingZone(int s)
    {
        maxGrowingZone = s;
    }

    //---------------------------

    public String getPlantCommonName()
    {
        //System.out.println(commonName);
        return commonName;
    }
    public String getPlantScientificName()
    {
        //System.out.println(scientificName);
        return scientificName;
    }
    public String getPlantTypeOfPlant()
    {
        //System.out.println(typeOfPlant);
        if(typeOfPlant == 1)
            return "Perennial";
        else if (typeOfPlant == 0) {
            return "Tree";
        }
        else
            return "Not Defined";
    }

    public int getTypeOfPlant()
    {
        return typeOfPlant;
    }
    public int getPlantMinGrowingZone()
    {
        //System.out.println(minGrowingZone);
        return minGrowingZone;
    }
    public int getPlantMaxGrowingZone()
    {
        //System.out.println(maxGrowingZone);
        return maxGrowingZone;
    }

    public String getPlantGrowingZone()
    {
        return minGrowingZone + " - " + maxGrowingZone;
    }

    //-------------------------------

    public void printPlantCommonName()
    {
        System.out.println("Common name : " + commonName);
    }
    public void printPlantScientificName()
    {
        System.out.println("Scientific name : " + scientificName);
    }
    public void printPlantTypeOfPlant()
    {
        System.out.println("Type of Plant : " + typeOfPlant);
    }
    public void printPlantMinGrowingZone()
    {
        System.out.println("Minimum Growing Zone : " + minGrowingZone);
    }
    public void printPlantMaxGrowingZone()
    {
        System.out.println("Maximum Growing Zone : " + maxGrowingZone);
    }
}
