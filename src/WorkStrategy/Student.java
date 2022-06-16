package WorkStrategy;

import Agents.Robotnik;
import Things.ThingsCollections.Diamenty;

public class Student implements WorkStrategy{

    private int time;
    private int supply;

    public Student(int time, int supply){
        this.time = time;
        this.supply = supply;
    }
    
    public boolean goToSchool(Robotnik worker){
        double minDiamonds = worker.simulation.market.averageFoodPrice(time)*100*supply;
        if(((Diamenty)worker.items.get(Robotnik.itemNames.diamenty)).howMany()>minDiamonds){
            return true;
        }
        return false;
    }

}
