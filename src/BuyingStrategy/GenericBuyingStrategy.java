package BuyingStrategy;

import Agents.Robotnik;
import Agents.Robotnik.itemNames;

import java.util.Map;

public interface GenericBuyingStrategy {
    Map<itemNames,Integer> whatToBuy(Robotnik worker);
}
