package ProfessionChangeStrategy;

import Agents.Robotnik;

public class Konserwatysta implements GenericChanger{
    public Robotnik.paths changeProfession(Robotnik worker){
        return worker.job;
    }
}
