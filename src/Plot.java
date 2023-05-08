public class Plot {
    public String plantName;
    public int numberOfPlants;
    public boolean needsWater;

    public boolean plantType;



    public Plot() {
        //task one assign a random value between 10 and 100
        numberOfPlants=(int) (Math.random()*90+10);

        //task 2: assign randon name to PlantName
        int plantID= (int) (Math.random()*5);

        if (plantID==0) {
            plantName = "tomato";
        }else if(plantID==1) {
            plantName = "carrot";
        }else if (plantID==2){
            plantName="lettuce";
        }else if (plantID==3){
            plantName="tulip";
        }else {
            plantName = "empty";
            numberOfPlants=0;
        }
        //do now: randomly assign true or false to needsWAter
        int waterID=(int)(Math.random()*2);
        if(waterID==0 && !plantName.equals("empty")==false) {
            needsWater=true;
        }else{
            needsWater=false;
        }


    }//Plot() this is called the constructor method




    public void printPlotInfo(){
        //fill in nicley
        System.out.println("***PLOT INFO***");
        System.out.println("plant Name:" +plantName);
        System.out.println("number Of Plants: "+ numberOfPlants);
        System.out.println("needs Water: "+ needsWater);
    }

}

