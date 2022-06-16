package BuyingStrategy;

import java.util.HashMap;
import java.util.Map;
import Agents.Robotnik;
import Agents.Robotnik.itemNames;

public class Zmechanizowany {

    private int liczba_narzedzi;

    public Zmechanizowany(int liczba_narzedzi){
        this.liczba_narzedzi = liczba_narzedzi;
    }
    
    public Map<itemNames,Integer> whatToBuy(Robotnik worker){
        Map<itemNames,Integer> result = new HashMap<itemNames,Integer>();
        result.put(itemNames.jedzenie,100);
        result.put(itemNames.narzedzia,this.liczba_narzedzi);
        return result;
    }

}
