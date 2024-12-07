package package6;

public class Hideout<T> {
    private T hider;

    public Hideout(){
        this.hider=null; //No object hidden initally
    }

    public void putIntoHideout(T toHide){
        this.hider=toHide; //hiding an object
    }

    public T takeFromHideout(){
        T toReturn=(T) this.hider;
        this.hider=null;
        return toReturn;
    }

    public boolean isInHideout(){
        return this.hider != null;
    }
}
