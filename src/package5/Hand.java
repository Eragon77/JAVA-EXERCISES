package package5;

import java.util.ArrayList;
import java.util.Collections;

public class Hand implements Comparable<Hand>{
    ArrayList<Card> playerHand;

    public Hand(){
        this.playerHand=new ArrayList<>();
    }

    public void add(Card card){
        this.playerHand.add(card);
    }

    public void print(){
        playerHand.stream().forEach(System.out::println);

        /* for(Card card:playerHand)
            System.out.println(card); */
    }

    public void sort(){
        Collections.sort(playerHand);
    }

    @Override
    public int compareTo(Hand other) {
        int thisTotal = this.playerHand.stream().mapToInt(Card::getValue).sum();
        int otherTotal = other.playerHand.stream().mapToInt(Card::getValue).sum();
        return Integer.compare(thisTotal, otherTotal);
    }

    public void sortBySuit(){
       playerHand.sort(null);
       playerHand.sort(new SortBySuit());

    }


}
