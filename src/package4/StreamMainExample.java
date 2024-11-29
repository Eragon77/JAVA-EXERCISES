package package4;

import com.sun.jdi.IntegerValue;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StreamMainExample {
    public static void main(String [] args){
        Scanner scanner=new Scanner(System.in);
        List<String> lista=new ArrayList<>();

        while(true){
            String add=scanner.nextLine();
            add=sanitize(add);

            if(add.equals("end"))
                break;

            lista.add(add);
        }

        String scelta=sanitize(scanner.nextLine());
        double average=0;
        if(scelta.equals("n")){
            average=lista.stream().mapToDouble(s-> Double.valueOf(s)).filter(numeri->numeri<0).average().orElse(0.0);
        }
        else if(scelta.equals("p")){
            average=lista.stream().mapToDouble(numero->Double.valueOf(numero)).filter(numero->numero>0).average().orElse(0.0);
        }else{
            System.out.println("Wrong choice, idiot!");
            return;
        }
        System.out.println("Average: "+average);

    }

    public static String sanitize(String s){
        return s.trim().toLowerCase();
    }
}
