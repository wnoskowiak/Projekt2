package Things.ThingsCollections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class UniqueThingCollection<T> extends GenericCollection<Integer>{

    protected List<T> arr;

    @SuppressWarnings("unchecked")
    public UniqueThingCollection(T... elements){
        arr = new ArrayList<T>(Arrays.asList(elements));
    }

    public Integer howMany(){
        return arr.size();
    }

    @SuppressWarnings("unchecked")
    public void add(T... newElements){
        for(T elem : newElements){
            this.arr.add(elem);
        }
    }

    public void clear(){
        for(int i = 0; i<this.arr.size(); i++){
            this.arr.remove(0);
        }
    }
}
