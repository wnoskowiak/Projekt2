package WorkStrategy;

import Agents.Robotnik;
import Things.ThingsCollections.Diamenty;

public class Oszczędny implements WorkStrategy{

    double limit_diamentów;

    public Oszczędny(double limit_diamentów){
        this.limit_diamentów = limit_diamentów;
    }
    
    public boolean goToSchool(Robotnik worker){
        if(((Diamenty)worker.items.get(Robotnik.itemNames.diamenty)).howMany()>this.limit_diamentów){
            return true;
        }
        return false;
    }

}
