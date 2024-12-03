package package5;

public class Card implements Comparable<Card> {
    private final int value;
    private Suit suit;

    public Card(int value, Suit suit){
        this.value=value;
        this.suit=suit;
    }

    @Override
    public String toString(){
        String valueString;
        switch(value){
            case 11:
                valueString="J";
                break;
            case 12:
                valueString="Q";
                break;
            case 13:
                valueString="K";
                break;
            case 14:
                valueString="A";
                break;
            default:
                valueString=String.valueOf(value);
        }

        return suit.toString()+" "+valueString;
    }

    public int getValue() {
        return value; // Access the numeric value
    }

    public Suit getSuit(){
        return this.suit;
    }

    @Override
    public int compareTo(Card other){
        if(this.value!=other.value)
            return this.value-other.value;

        return this.suit.ordinal()-other.suit.ordinal();

    }
}
