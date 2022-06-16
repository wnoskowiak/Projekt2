package WorkStrategy;

import java.util.Random;

import Agents.Robotnik;

public class Rozkładowy implements WorkStrategy{

    Random r = new Random();

    public boolean goToSchool(Robotnik worker){
        int days = worker.simulation.days();
        double probability = 1/(days+3);
        if(probability<r.nextDouble()){
            return true;
        }
        return false;
    }

}
