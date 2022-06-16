package ProductionStrategy;

import Agents.Robotnik;

public class Chciwy implements GenericProductionStrategy{
    
    public Robotnik.itemNames whatToProduce(Robotnik worker){
        return worker.simulation.market.getLastDayGreatestValue();
    }
}