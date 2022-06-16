package BuyingStrategy;

import java.util.HashMap;
import java.util.Map;
import Agents.Robotnik;
import Agents.Robotnik.itemNames;

public class Technofob implements GenericBuyingStrategy{

    public Map<itemNames,Integer> whatToBuy(Robotnik worker){
        Map<itemNames,Integer> result = new HashMap<itemNames,Integer>();
        result.put(itemNames.jedzenie,100);

        return result;
    }
}
