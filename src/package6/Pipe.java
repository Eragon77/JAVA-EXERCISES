package package6;

import java.util.ArrayList;

public class Pipe<T> {
    private ArrayList<T> inPipe;

    public Pipe(){
        this.inPipe=new ArrayList<>();
    }

    public void putIntoPipe(T value){
        this.inPipe.add(value);
    }

    public T takeFromPipe(){
        if(inPipe.isEmpty())
            return null;
        else {
           T toReturn= inPipe.getFirst();
           inPipe.removeFirst();
            return toReturn;
            }
        }

    public boolean isInPipe(){
        return !(inPipe.isEmpty());
    }


}
