package Things.ThingsCollections;
public abstract class NonUniqueCollection<T> extends GenericCollection<T>{
    
    protected T amount;

    protected NonUniqueCollection(T amount){
        this.amount = amount;
    }

    public T howMany(){
        return this.amount;
    }

    abstract public void add(T delta);

    abstract public void remove(T delta);
}
