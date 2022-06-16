package Things.ThingsCollections;

import Things.ThingsElements.Ubranie;

public class Ubrania extends UniqueThingCollection<Ubranie>{

    public Ubrania(Ubranie... elements){
        super(elements);
    }

    @Override
    public void add(Ubranie... newElements){
        super.add(newElements);
        this.arr.sort(new Ubranie.CompareUbrania());
    }

    public void use(int howMany){
        int removed = 0;
        Ubranie current;
        for(int i = 0; i<howMany-removed; i++){
            current = this.arr.get(i);
            current.wear();
            if(!current.isOK()){
                this.arr.remove(i);
                removed++;
            }
        }
    }

}
