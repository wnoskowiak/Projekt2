package ProductionStrategy;

import Agents.Robotnik;

public class Perspektywiczny implements GenericProductionStrategy{

    int historia_perspektywy;

    public Perspektywiczny(int prod){
        this.historia_perspektywy = prod;
    }

    public Robotnik.itemNames whatToProduce(Robotnik worker){
        return worker.simulation.market.getGreatestValueRise(this.historia_perspektywy);
    }
}