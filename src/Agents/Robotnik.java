package Agents;
import java.util.Map;

import Simulation.Simulation;

import java.util.HashMap;

import Things.ThingsCollections.Diamenty;
import Things.ThingsCollections.GenericCollection;
import Things.ThingsCollections.Jedzenie;
import Things.ThingsCollections.Narzędzia;
import Things.ThingsCollections.Programy;
import Things.ThingsCollections.Ubrania;

public class Robotnik {

    public enum markets{
        Kapitalistyczna,
        Socjalistyczna,
        Mieszana
    }

    public enum paths{
        Rolnik,
        Górnik,
        Rzemieślnik,
        Inżynier,
        Programista
    };

    public enum itemNames{
        programy,
        jedzenie,
        diamenty,
        ubrania,
        narzedzia
    };

    public enum careerPath {
        Konserwatysta,
        Rewolucjonista
    };

    public final int id;

    public Simulation simulation;

    protected double diamonds;

    public paths job;

    protected Map<paths,Integer> levels;

    protected Map<itemNames,Integer> productivity = new HashMap<itemNames,Integer>();

    public Map<itemNames,GenericCollection<?>> items = new HashMap<itemNames,GenericCollection<?>>();

    public Robotnik(){
        this.id = 0;
        this.items.put(itemNames.ubrania, new Ubrania());
        this.items.put(itemNames.narzedzia, new Narzędzia());
        this.items.put(itemNames.programy, new Programy());
        this.items.put(itemNames.jedzenie, new Jedzenie(0));
        this.items.put(itemNames.diamenty, new Diamenty(0.0));
    }

}
