import java.util.ArrayList;
import java.util.Collections;

public class ChangeHistory {

    private ArrayList<Double> history;

    public ChangeHistory(){
        this.history=new ArrayList<>();
    }

    public void add(double status){
        this.history.add(status);
    }

    public void clear(){
        this.history.clear();
    }

    @Override
    public String toString(){
        return history.toString();
    }


    public double maxValue(){
        if(history.isEmpty())
            return 0;
        return Collections.max(history);
    }

    public double minValue() {
        if(history.isEmpty())
            return 0;
        return Collections.min(history);
    }

    public double average(){
        double average=0;
        double numbers=0;
        for(double number:history){
            numbers++;
            average+=number;
        }
        return average/numbers;
    }
}
