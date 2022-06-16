package Things.ThingsCollections;

import Things.ThingsElements.Narzędzie;

public class Narzędzia extends UniqueThingCollection<Narzędzie>{

    public Narzędzia(Narzędzie... elements){
        super(elements);
    }

    public int cumulativeBonus(){
        int result = 0;
        for(Narzędzie elem : this.arr){
            result += elem.getLevel();
        }
        return result;
    }
}
