package WorkStrategy;

import Agents.Robotnik;

public class Okresowy implements WorkStrategy{

    int okresowosc_nauki;

    public Okresowy(int okresowosc_nauki){
        this.okresowosc_nauki = okresowosc_nauki;
    }

    public boolean goToSchool(Robotnik worker){
        if(worker.simulation.days()%okresowosc_nauki==0){
            return true;
        }
        return false;
    }

}
