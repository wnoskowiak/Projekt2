package ProductionStrategy;

import java.util.Random;

import Agents.Robotnik;

public class Losowy implements GenericProductionStrategy{

    private Random rand;

    public Losowy(){
        this.rand = new Random();
    }
    
    public Robotnik.itemNames whatToProduce(Robotnik worker){
        int num = this.rand.nextInt((5));
        if(num == 0){
            return Robotnik.itemNames.diamenty;
        }
        if(num == 1){
            return Robotnik.itemNames.jedzenie;
        }
        if(num == 2){
            return Robotnik.itemNames.narzedzia;
        }
        if(num == 3){
            return Robotnik.itemNames.programy;
        }
        return Robotnik.itemNames.ubrania;
    }

}
