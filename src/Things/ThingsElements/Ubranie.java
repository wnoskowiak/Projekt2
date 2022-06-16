package Things.ThingsElements;

import java.util.Comparator;

public class Ubranie extends GenericThing{

    public static class CompareUbrania implements Comparator<Ubranie>{
        @Override
        public int compare(Ubranie arg0, Ubranie arg1) {
            return Integer.compare(arg0.level, arg1.level);
        }
    }
    
    int wear = 0;

    public Ubranie(int quality){
        super(quality);
    }

    public boolean isOK(){
        if(wear<=level*level){
            return true;
        }
        return false;
    }

    public void wear(){
        if(isOK()){
            this.wear++;
        }
    }
}
