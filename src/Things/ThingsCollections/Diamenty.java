package Things.ThingsCollections;

public class Diamenty extends NonUniqueCollection<Double> {

    public Diamenty(Double amount){
        super(amount);
    }

    public void add(Double delta){
        this.amount += delta;
    }

    public void remove(Double delta){
        this.add(-delta);
    }
}
