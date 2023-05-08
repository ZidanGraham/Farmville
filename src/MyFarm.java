import java.util.ArrayList;

public class MyFarm {
    //declaration section
    ArrayList<Plot> row;


    public static void main(String[] args) {
        //System.out.println("this my farm");
        MyFarm LettuceCode = new MyFarm();
    }

    public MyFarm() {
        //contruct objects
        row = new ArrayList<>();
        //fill my arraylist
        for (int i = 0; i < 10; i++) {
            row.add(new Plot());
        }


        //Here we call our practice problems

        printPlantNames();
        //printRowInfo();
        addLettuce();
        addTulip();
        tomatoLocations();
        numberOfEmptyPlots();
        everyOtherNeedsWater();
        plantWithMaxNumber();


    }//My FArm in the constructor method

    public void totalPlants() {
        // how many total plants are there in the row?
        int total = 0;
        System.out.println("*****TOTAL PLANTS*******");
        for (int s = 0; s < row.size(); s++) {
            total = total + row.get(s).numberOfPlants;
        }
        System.out.println("total plants in row:" + total);

    }

    public void printPlantNames() {

        System.out.println("****PLANT NAMES****");
        for (int s = 0; s < row.size(); s++) {
            System.out.print(s + ": " + row.get(s).plantName + ", ");

        }
        System.out.println("*******");


    }

    public void printRowInfo() {
        // use the printPlotInfo() method in Plot.java to print all information for each plot in the row
        for (int x = 0; x < row.size(); x++) {
            row.get(x).printPlotInfo();
        }
    }

    public void addLettuce() {
        // add a lettuce plot to the end of the row with 42 plants that need water
        // call printPlantNames() method before and after your addition to make sure it worked
        System.out.println("****ADD LETTUCE****");
        printPlantNames();
        row.add(new Plot());
        row.get(10).plantName = "lettuce";
        row.get(10).numberOfPlants = 42;
        row.get(10).needsWater = true;


        printPlantNames();

    }

    public void addTulip() {
        // at index 3, add a new tulip plot with 70 plants that do not need water
        // call printPlantNames() method before and after your addition to make sure it worked
        row.get(3).plantName = "tulip";
        row.get(3).numberOfPlants = 70;
        row.get(3).needsWater = false;
        printPlantNames();
    }

    public void tomatoLocations() {
        // print indexes of all tomato plants
        // call printPlantNames() method to make sure you're getting the correct indexes
        System.out.println("**** LOCATION OF ALL TOMATOS****");
        System.out.println("There are tomato plants at the following row(s):");
        for (int y = 0; y < row.size(); y++) {
            if (row.get(y).plantName == "tomato") {
                System.out.println((y + 1));
            }
        }
    }

    public void totalCarrots() {
        // how many plots have carrots on them
// call printPlantNames() method to check
        System.out.println("****Total Carrots****");
        int total = 0;
        for (int k = 0; k < row.size(); k++) {
            if (row.get(k).plantName.equals("carrot")) {
                total = total + row.get(k).numberOfPlants;
            }
        }
        System.out.println(" Total Carrots:" + total);
    }

    public void averageNumberOfPlants() {
        // what is the average number of plants across the whole row?
        System.out.println("****Average Number of Plants******");
        int total = 0;
        int avg = 0;
        for (int index = 0; index < row.size(); index++) {
            total = total + row.get(index).numberOfPlants;
        }
        avg = total / 10;//or divide by row.size
        System.out.println("This is the average number of plants per plot:" + avg);

    }

    public void numberOfCarrotPlots() {
        // how many plots have carrots on them
// call printPlantNames() method to check
        int numberCarrotPlots = 0;
        System.out.println("*****Number of Carrot Plots***** ");
        for (int k = 0; k < row.size(); k++) {
            if (row.get(k).plantName.equals("carrot")) {
                numberCarrotPlots++;
            }
        }
        System.out.println("Number Carrot Plots:" + numberCarrotPlots);
    }

    public void numberOfEmptyPlots() {
        // how many plots are empty
// call printPlantNames() method to check

        int numberOfEmptyPlots = 0;
        System.out.println("*****Number of Empty Plots***** ");
        for (int i = 0; i < row.size(); i++) {
            if (row.get(i).plantName.equals("empty")) {
                numberOfEmptyPlots++;
            }
        }
        System.out.println("Number of Empty Plots:" + numberOfEmptyPlots);
    }

    public void everyOtherNeedsWater() {
        // change the value of needsWater to be true for every other plot
        System.out.println("**** Everyother plot needs water***");
        for (int i = 0; i < row.size(); i += 2) {
            row.get(i).needsWater = true;
        }
    }
    public void greaterthan10(){
        //how many plots have more than 10 plants in the plot?
        int numberofgrTenPlots=0;
        for (int i=0;i<row.size();i++){
            if (row.get(i).numberOfPlants>10){
                numberofgrTenPlots++;
            }
        }
        System.out.println("There are "+numberofgrTenPlots+"plots with more than ten plants");
    }


    public void plantWithMinNumber() {
        // which plant type has the least total plants (not counting empty plots)?
        System.out.println("******Plant With Minimum Number*********");
        int totalCarrots=0;
        int totalTomatoes=0;
        int totalTulips=0;
        int totalLettuce=0;

        //step 1: add up the total Carrots, total Tomatoes, total tulips, total Lettuce
        for(int k=0;k<row.size();k++){
            if(row.get(k).plantName.equals("carrot")){
                totalCarrots=totalCarrots+row.get(k).numberOfPlants;
            }
            if(row.get(k).plantName.equals("tomato")){
                totalTomatoes=totalTomatoes+row.get(k).numberOfPlants;
            }
            if(row.get(k).plantName.equals("tulip")){
                totalTulips=totalTulips+row.get(k).numberOfPlants;
            }
            if(row.get(k).plantName.equals("lettuce")){
                totalLettuce=totalLettuce+row.get(k).numberOfPlants;
            }
        }
        //step 2: compare each individual plant total to find the smallest (greater than 0)
        int currentMin=0;
        String plantType="empty";

        if(totalCarrots<totalTomatoes ){
            currentMin=totalCarrots;
            plantType="carrot";
        }else {
            currentMin=totalTomatoes;
            plantType="tomato";
        }
        //current min vs. tulip
        if (totalTulips<currentMin && totalTulips>0){
            currentMin=totalTulips;
            plantType="tulip";
        }
        //current min vs. lettuce
        if(totalLettuce<currentMin && totalLettuce>0){
            currentMin=totalLettuce;
            plantType="lettuce";
        }
        System.out.println("The min plant type is "+plantType+ " with "+ currentMin+ " plants.");

    }
    public void plantWithMaxNumber() {
        // which plant type has the most total plants?
        //variable definition
        int numTomatoPlants = 0;
        int numTulipPlants = 0;
        int numLettucePlants = 0;
        int numCarrotPlants = 0;
        int numEmptyPlants = 0;
        String maxplants = "nothing";
        for (int i=0; i < row.size(); i++) {
            if (row.get(i).plantName == "carrot") {
                numCarrotPlants += row.get(i).numberOfPlants;
                if (numCarrotPlants > numTomatoPlants && numCarrotPlants > numTulipPlants && numCarrotPlants > numLettucePlants && numCarrotPlants > numEmptyPlants) {
                    maxplants = row.get(i).plantName;
                }
            }
            else if (row.get(i).plantName == "tulip") {
                numTulipPlants += row.get(i).numberOfPlants;
                if (numTulipPlants > numTomatoPlants && numTulipPlants > numCarrotPlants && numTulipPlants > numLettucePlants && numTulipPlants > numEmptyPlants) {
                    maxplants = row.get(i).plantName;
                }
            }
            else if (row.get(i).plantName == "tomato") {
                numTomatoPlants += row.get(i).numberOfPlants;
                if (numTomatoPlants > numCarrotPlants && numTomatoPlants > numTulipPlants && numTomatoPlants > numLettucePlants && numTomatoPlants > numEmptyPlants) {
                    maxplants = row.get(i).plantName;
                }
            }
            else if (row.get(i).plantName == "lettuce") {
                numLettucePlants += row.get(i).numberOfPlants;
                if (numLettucePlants > numTomatoPlants && numLettucePlants > numTulipPlants && numLettucePlants > numCarrotPlants && numLettucePlants > numEmptyPlants) {
                    maxplants = row.get(i).plantName;
                }
            }
            else if (row.get(i).plantName == "empty") {
                numEmptyPlants += row.get(i).numberOfPlants;
                if (numEmptyPlants > numTomatoPlants && numEmptyPlants > numTulipPlants && numEmptyPlants > numLettucePlants && numEmptyPlants > numCarrotPlants) {
                    maxplants = row.get(i).plantName;
                }
            }
        }
        System.out.println("The plant type with the most plants is " + maxplants);
    }


}












