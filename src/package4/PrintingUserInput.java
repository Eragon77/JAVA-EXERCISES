package package4;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class PrintingUserInput {
    public static void main(String[] args){
        ArrayList<Integer> input=new ArrayList<>();
        Scanner scanner=new Scanner(System.in);


        while(true){
            int number=scanner.nextInt();

            if(number<0)
                break;

            input.add(number);

        }

        input.stream().filter(n->n>=1 && n<=5).forEach(System.out::println);

    }

}
