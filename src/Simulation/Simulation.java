package Simulation;
import Agents.Robotnik;
import Agents.Robotnik.paths;
import Agents.Robotnik.itemNames;
import Giełda.Giełda;

public class Simulation {

    public static Robotnik.paths productToPaths(itemNames item){
        if(item == itemNames.diamenty){
            return paths.Górnik;
        }
        if(item == Robotnik.itemNames.jedzenie){
            return paths.Rolnik;
        }
        if(item == Robotnik.itemNames.narzedzia){
            return paths.Inżynier;
        }
        if(item == Robotnik.itemNames.ubrania){
            return paths.Rzemieślnik;
        }
        return paths.Programista;
    }

    public Giełda market;

    private int days;

    public int days(){
        return days;
    }
}
