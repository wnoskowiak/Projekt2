package ProfessionChangeStrategy;

import Agents.Robotnik;

public class Rewolucjonista implements GenericChanger{
    public Robotnik.paths changeProfession(Robotnik worker){
        if(worker.simulation.days()%7==0){
            int n = Integer.max(1, worker.id%17);
            return worker.simulation.market.getMostOften(n);
        }
        return worker.job;
    }
}
