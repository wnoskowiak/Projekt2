package ProductionStrategy;

import Agents.Robotnik;

public class Średniak implements GenericProductionStrategy{

    int historia_sredniej_produkcji;

    public Średniak(int prod){
        this.historia_sredniej_produkcji = prod;
    }

    public Robotnik.itemNames whatToProduce(Robotnik worker){
        return worker.simulation.market.getGreatestAverage(this.historia_sredniej_produkcji);
    }
}