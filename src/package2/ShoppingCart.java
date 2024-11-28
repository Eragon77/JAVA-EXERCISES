package package2;

import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {
  private Map<String,Item> oggetti;


    public ShoppingCart(){
        this.oggetti=new HashMap<>();
    }

    public void add(String product, int price){
        if(this.oggetti.containsKey(product))
            this.oggetti.get(product).increaseQuantity();
        else{
            this.oggetti.put(product,new Item(product,1,price));
        }

    }


    public int price(){
        int prezzo=0;
        for(Item oggetto:oggetti.values()){
            prezzo+=oggetto.price();
        }
        return prezzo;
    }

    public void print() {
        for (Item item : oggetti.values()) {
            System.out.println(item);
        }
    }
}
