package ProductionStrategy;

import Agents.Robotnik;

public class Krótkowzroczny implements GenericProductionStrategy{
    
    public Robotnik.itemNames whatToProduce(Robotnik worker){
        return worker.simulation.market.getLastDayMostPopular();
    }

}
