package Giełda;

import Agents.Robotnik;
import Simulation.Simulation;

public class Giełda {
    private final Robotnik.markets type;

    public Giełda(Robotnik.markets type){
        this.type = type;
    }

    public Robotnik.itemNames getGreatestValueRise(int days){
        return Robotnik.itemNames.narzedzia;
    }

    public Robotnik.itemNames getGreatestAverage(int days){
        return Robotnik.itemNames.narzedzia;
    }

    public Robotnik.itemNames getLastDayGreatestValue(){
        return Robotnik.itemNames.narzedzia;
    }

    public double averageFoodPrice(int time){
        return 100.0;
    }

    public Robotnik.paths getMostOften(int n){
        return Simulation.productToPaths(Robotnik.itemNames.narzedzia) ;
    }

    public Robotnik.itemNames getLastDayMostPopular(){
        return Robotnik.itemNames.diamenty;
    }


}
