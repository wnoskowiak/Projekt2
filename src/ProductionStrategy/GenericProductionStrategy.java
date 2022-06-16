package ProductionStrategy;

import Agents.Robotnik;

public interface GenericProductionStrategy {
    
    public Robotnik.itemNames whatToProduce(Robotnik worker);

}
