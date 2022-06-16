package Things.ThingsCollections;

public class Jedzenie extends NonUniqueCollection<Integer>{

    public Jedzenie(Integer amount){
        super(amount);
    }

    public void add(Integer delta){
        this.amount += delta;
    }

    public void remove(Integer delta){
        this.add(-delta);
    }
}
